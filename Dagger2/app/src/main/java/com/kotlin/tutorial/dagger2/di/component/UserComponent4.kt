package com.kotlin.tutorial.dagger2.di.component

import com.kotlin.tutorial.dagger2.activity.Demo4InjectWithParamActivity
import com.kotlin.tutorial.dagger2.di.module.UserModule4
import dagger.Component

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.dagger2.di.component.UserComponent4.kt
 * @author: Tony Shen
 * @date: 2018-08-03 12:59
 * @version V1.0 <描述当前版本功能>
 */
@Component(modules = arrayOf(UserModule4::class))
interface UserComponent4 {

    fun inject(activity: Demo4InjectWithParamActivity)
}