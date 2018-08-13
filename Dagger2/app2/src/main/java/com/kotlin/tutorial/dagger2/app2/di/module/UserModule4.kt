package com.kotlin.tutorial.dagger2.app2.di.module

import com.kotlin.tutorial.dagger2.app2.di.qualifier.Monica
import com.kotlin.tutorial.dagger2.app2.di.qualifier.Tony
import com.kotlin.tutorial.dagger2.app2.domain.User
import dagger.Module
import dagger.Provides
import javax.inject.Named

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.dagger2.app2.di.module.UserModule4.kt
 * @author: Tony Shen
 * @date: 2018-08-13 17:45
 * @version V1.0 <描述当前版本功能>
 */
@Module
class UserModule4 {

    @Tony
    @Provides
    fun provideTony() = User("Tony")


    @Monica
    @Provides
    fun provideMonica() = User("Monica")
}