package com.kotlin.tutorial.dagger2.app2.di.component

import com.kotlin.tutorial.dagger2.app2.activity.Demo4CustomerQualifierActivity
import com.kotlin.tutorial.dagger2.app2.di.module.UserModule4
import dagger.Component

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.dagger2.app2.di.component.UserComponent4.kt
 * @author: Tony Shen
 * @date: 2018-08-13 17:46
 * @version V1.0 <描述当前版本功能>
 */
@Component(modules = arrayOf(UserModule4::class))
interface UserComponent4 {

    fun inject(activity: Demo4CustomerQualifierActivity)
}