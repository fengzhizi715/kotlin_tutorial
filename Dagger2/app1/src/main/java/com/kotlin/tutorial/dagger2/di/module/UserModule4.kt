package com.kotlin.tutorial.dagger2.di.module

import com.kotlin.tutorial.dagger2.domain.User
import dagger.Module
import dagger.Provides

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.dagger2.di.module.UserModule4.java
 * @author: Tony Shen
 * @date: 2018-08-02 17:13
 * @version V1.0 <描述当前版本功能>
 */
@Module
class UserModule4 {

    @Provides
    fun provideUser(param:String) = User(param)
}