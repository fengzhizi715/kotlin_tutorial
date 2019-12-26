package com.kotlin.tutorial.dagger2.app3.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.kotlin.tutorial.dagger2.app3.di.component.DaggerAddressComponent2
import com.kotlin.tutorial.dagger2.app3.di.component.DaggerStreetComponent2
import com.kotlin.tutorial.dagger2.app3.domain.Address
import javax.inject.Inject

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.dagger2.app3.activity.Demo4ModuleDependenciesActivity
 * @author: Tony Shen
 * @date: 2019-12-27 01:23
 * @version: V1.0 <描述当前版本功能>
 */
class Demo4ComponentDependenciesActivity: AppCompatActivity() {

    @Inject
    lateinit var address: Address

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val streetComponent2 = DaggerStreetComponent2.builder().build()
        DaggerAddressComponent2.builder().streetComponent2(streetComponent2).build().inject(this)

        Toast.makeText(this,address.toString(), Toast.LENGTH_LONG).show()
    }

}