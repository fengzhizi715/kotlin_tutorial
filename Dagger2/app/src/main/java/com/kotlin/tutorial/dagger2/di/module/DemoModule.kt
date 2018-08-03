package com.kotlin.tutorial.dagger2.di.module

import com.kotlin.tutorial.dagger2.DemoService
import com.kotlin.tutorial.dagger2.IService
import dagger.Module
import dagger.Provides

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.dagger2.di.module.DemoModule.kt
 * @author: Tony Shen
 * @date: 2018-08-03 11:42
 * @version V1.0 <描述当前版本功能>
 */
@Module
class DemoModule {

    @Provides
    fun provideDemoService():IService {

        return DemoService()
    }
}
