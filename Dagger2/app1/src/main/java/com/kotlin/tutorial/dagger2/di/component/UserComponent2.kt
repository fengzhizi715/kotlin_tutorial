package com.kotlin.tutorial.dagger2.di.component

import com.kotlin.tutorial.dagger2.activity.Demo4ModuleActivity
import com.kotlin.tutorial.dagger2.di.module.UserModule2
import dagger.Component

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.dagger2.di.component.UserComponent2.kt
 * @author: Tony Shen
 * @date: 2018-08-02 01:02
 * @version V1.0 <描述当前版本功能>
 */
@Component(modules = arrayOf(UserModule2::class))
interface UserComponent2 {

    fun inject(activity: Demo4ModuleActivity)
}