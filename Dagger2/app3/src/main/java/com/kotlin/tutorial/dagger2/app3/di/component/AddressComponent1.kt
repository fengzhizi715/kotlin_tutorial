package com.kotlin.tutorial.dagger2.app3.di.component

import com.kotlin.tutorial.dagger2.app3.activity.Demo4ModuleIncludeActivity
import com.kotlin.tutorial.dagger2.app3.di.module.AddressModule1
import dagger.Component

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.dagger2.app3.di.component.AddressComponent1.kt
 * @author: Tony Shen
 * @date: 2018-08-10 16:20
 * @version V1.0 <描述当前版本功能>
 */
@Component(modules = arrayOf(AddressModule1::class))
interface AddressComponent1 {

    fun inject(activity: Demo4ModuleIncludeActivity)
}