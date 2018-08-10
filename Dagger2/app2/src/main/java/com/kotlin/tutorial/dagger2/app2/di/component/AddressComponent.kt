package com.kotlin.tutorial.dagger2.app2.di.component

import com.kotlin.tutorial.dagger2.app2.activity.Demo4RecursiveInjectActivity
import com.kotlin.tutorial.dagger2.app2.di.module.AddressModule
import com.kotlin.tutorial.dagger2.app2.di.module.StreetModule
import dagger.Component

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.dagger2.app2.di.component.AddressComponent.kt
 * @author: Tony Shen
 * @date: 2018-08-10 16:20
 * @version V1.0 <描述当前版本功能>
 */
@Component(modules = arrayOf(AddressModule::class,StreetModule::class))
interface AddressComponent {

    fun inject(activity: Demo4RecursiveInjectActivity)
}