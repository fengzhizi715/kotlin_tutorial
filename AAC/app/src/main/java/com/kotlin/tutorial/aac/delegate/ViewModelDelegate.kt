package com.kotlin.tutorial.aac.delegate

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import kotlin.reflect.KClass
import kotlin.reflect.KProperty

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.aac.delegate.ViewModelDelegate
 * @author: Tony Shen
 * @date: 2019-11-09 12:43
 * @version: V1.0 <描述当前版本功能>
 */
class ViewModelDelegate<out T : ViewModel>(private val clazz: KClass<T>, private val fromActivity: Boolean) {

    private var viewModel: T? = null

    operator fun getValue(thisRef: AppCompatActivity, property: KProperty<*>) = buildViewModel(activity = thisRef)

    operator fun getValue(thisRef: Fragment, property: KProperty<*>) = if (fromActivity)
        buildViewModel(activity = thisRef.activity as? AppCompatActivity
                ?: throw IllegalStateException("Activity must be as BaseActivity"))
    else buildViewModel(fragment = thisRef)

    private fun buildViewModel(activity: AppCompatActivity? = null, fragment: Fragment? = null): T {
        if (viewModel != null) return viewModel!!

        activity?.let {
            viewModel = ViewModelProviders.of(it).get(clazz.java)
        } ?: fragment?.let {
            viewModel = ViewModelProviders.of(it).get(clazz.java)
        } ?: throw IllegalStateException("Activity or Fragment is null! ")

        return viewModel!!
    }
}

fun <T : ViewModel> AppCompatActivity.viewModelDelegate(clazz: KClass<T>) = ViewModelDelegate(clazz, true)

fun <T : ViewModel> Fragment.viewModelDelegate(clazz: KClass<T>, fromActivity: Boolean = true) = ViewModelDelegate(clazz, fromActivity)