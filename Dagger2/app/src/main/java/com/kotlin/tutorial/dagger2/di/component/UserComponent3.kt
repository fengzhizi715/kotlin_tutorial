package com.kotlin.tutorial.dagger2.di.component

import com.kotlin.tutorial.dagger2.activity.Demo4ComponentBuilderActivity
import com.kotlin.tutorial.dagger2.di.module.UserModule3
import dagger.BindsInstance
import dagger.Component


/**
 *
 * @FileName:
 *          com.kotlin.tutorial.dagger2.di.component.UserComponent3.kt
 * @author: Tony Shen
 * @date: 2018-08-02 16:36
 * @version V1.0 <描述当前版本功能>
 */
@Component(modules = arrayOf(UserModule3::class))
interface UserComponent3 {

    fun inject(activity: Demo4ComponentBuilderActivity)

    @Component.Builder
    interface Builder {

        fun build():UserComponent3

        @BindsInstance
        fun param(param: String): Builder
    }
}