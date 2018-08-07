package com.kotlin.tutorial.dagger2.app2.di.component

import com.kotlin.tutorial.dagger2.app2.activity.Demo4LazyActivity
import dagger.Component

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.dagger2.app2.di.component.UserComponent1.kt
 * @author: Tony Shen
 * @date: 2018-08-08 01:00
 * @version V1.0 <描述当前版本功能>
 */
@Component
interface UserComponent1 {

    fun inject(activity: Demo4LazyActivity)
}