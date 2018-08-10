package com.kotlin.tutorial.dagger2.app2.di.module

import com.kotlin.tutorial.dagger2.app2.domain.User
import dagger.Module
import dagger.Provides
import javax.inject.Named

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.dagger2.app2.di.module.UserModule3.kt
 * @author: Tony Shen
 * @date: 2018-08-10 17:58
 * @version V1.0 <描述当前版本功能>
 */
@Module
class UserModule3 {

    @Named("tony")
    @Provides
    fun provideTony() = User("Tony")


    @Named("monica")
    @Provides
    fun provideMonica() = User("Monica")
}