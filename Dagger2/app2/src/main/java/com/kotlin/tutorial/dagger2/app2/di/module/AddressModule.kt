package com.kotlin.tutorial.dagger2.app2.di.module

import com.kotlin.tutorial.dagger2.app2.domain.Address
import com.kotlin.tutorial.dagger2.app2.domain.Street
import dagger.Module
import dagger.Provides

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.dagger2.app2.di.module.AddressModule.kt
 * @author: Tony Shen
 * @date: 2018-08-10 15:58
 * @version V1.0 <描述当前版本功能>
 */
@Module
class AddressModule {

    @Provides
    fun provideAddress(street: Street): Address {

        val address = Address(street)
        return address
    }
}