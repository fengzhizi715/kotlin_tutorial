package com.kotlin.tutorial.dagger2.di.component

import com.kotlin.tutorial.dagger2.activity.Demo4InterfaceInjectActivity
import com.kotlin.tutorial.dagger2.di.module.DemoModule
import dagger.Component

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.dagger2.di.component.DemoComponent.kt
 * @author: Tony Shen
 * @date: 2018-08-03 11:46
 * @version V1.0 <描述当前版本功能>
 */
@Component(modules = arrayOf(DemoModule::class))
interface DemoComponent {

    fun inject(activity: Demo4InterfaceInjectActivity)
}