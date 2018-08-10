package com.kotlin.tutorial.dagger2.app2.di.component

import com.kotlin.tutorial.dagger2.app2.activity.Demo4QualifierActivity
import com.kotlin.tutorial.dagger2.app2.di.module.UserModule3
import dagger.Component

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.dagger2.app2.di.component.UserComponent3.kt
 * @author: Tony Shen
 * @date: 2018-08-10 18:35
 * @version V1.0 <描述当前版本功能>
 */
@Component(modules = arrayOf(UserModule3::class))
interface UserComponent3 {

    fun inject(activity: Demo4QualifierActivity)
}