package com.kotlin.tutorial.dagger2.app2.di.component

import com.kotlin.tutorial.dagger2.app2.activity.Demo4ProviderInjectActivity
import dagger.Component

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.dagger2.app2.di.component.UserComponent2.kt
 * @author: Tony Shen
 * @date: 2018-08-10 17:07
 * @version V1.0 <描述当前版本功能>
 */
@Component
interface UserComponent2 {

    fun inject(activity: Demo4ProviderInjectActivity)
}