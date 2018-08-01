package com.kotlin.tutorial.dagger2.di.module

import com.kotlin.tutorial.dagger2.domain.User
import dagger.Module
import dagger.Provides

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.dagger2.di.module.UserModule.kt
 * @author: Tony Shen
 * @date: 2018-08-02 00:59
 * @version V1.0 <描述当前版本功能>
 */
@Module
class UserModule {

    @Provides
    fun provideUser() = User()
}