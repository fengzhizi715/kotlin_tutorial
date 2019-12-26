package com.kotlin.tutorial.dagger2.app3.di.component

import com.kotlin.tutorial.dagger2.app3.activity.Demo4ComponentDependenciesActivity
import dagger.Component

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.dagger2.app3.di.component.AddressComponent2
 * @author: Tony Shen
 * @date: 2019-12-27 01:24
 * @version: V1.0 <描述当前版本功能>
 */
@Component(dependencies = arrayOf(StreetComponent2::class))
interface AddressComponent2 {

    fun inject(activity: Demo4ComponentDependenciesActivity)
}