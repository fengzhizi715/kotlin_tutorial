package com.kotlin.tutorial.dagger2.di.module

import com.kotlin.tutorial.dagger2.domain.User
import dagger.Module
import dagger.Provides

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.dagger2.di.module.UserModule4.kt
 * @author: Tony Shen
 * @date: 2018-08-03 13:03
 * @version V1.0 <描述当前版本功能>
 */
@Module
class UserModule4 {

    lateinit var param: String

    fun param(param: String) {
        this.param = param
    }

    @Provides
    fun provideUser() = User(param)
}