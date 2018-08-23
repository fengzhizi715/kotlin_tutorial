package com.kotlin.tutorial.dagger2.app3.di.module

import com.kotlin.tutorial.dagger2.app3.domain.Street
import dagger.Module
import dagger.Provides

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.dagger2.app2.di.module.StreetModule.kt
 * @author: Tony Shen
 * @date: 2018-08-10 16:22
 * @version V1.0 <描述当前版本功能>
 */
@Module
class StreetModule {

    @Provides
    fun provideStreet(): Street {

        return Street("汶水路")
    }
}