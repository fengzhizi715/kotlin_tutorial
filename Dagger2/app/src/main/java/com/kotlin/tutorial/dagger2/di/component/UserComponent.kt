package com.kotlin.tutorial.dagger2.di.component

import com.kotlin.tutorial.dagger2.activity.Demo4InjectActivity
import dagger.Component

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.dagger2.di.component.UserComponent.kt
 * @author: Tony Shen
 * @date: 2018-08-02 00:21
 * @version V1.0 <描述当前版本功能>
 */
@Component
interface UserComponent {

    fun inject(activity: Demo4InjectActivity)
}