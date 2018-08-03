package com.kotlin.tutorial.dagger2.di.component

import com.kotlin.tutorial.dagger2.activity.Demo4ComponentBuilderActivity
import com.kotlin.tutorial.dagger2.di.module.UserModule4
import dagger.BindsInstance
import dagger.Component


/**
 *
 * @FileName:
 *          com.kotlin.tutorial.dagger2.di.component.UserComponent311.kt
 * @author: Tony Shen
 * @date: 2018-08-02 16:36
 * @version V1.0 <描述当前版本功能>
 */
@Component(modules = arrayOf(UserModule4::class))
interface UserComponent4 {

    fun inject(activity: Demo4ComponentBuilderActivity)

    @Component.Builder
    interface Builder {

        fun build():UserComponent4

        @BindsInstance
        fun param(param: String): Builder
    }
}