package com.kotlin.tutorial.dagger2.app3.di.module

import com.kotlin.tutorial.dagger2.app3.domain.Address
import com.kotlin.tutorial.dagger2.app3.domain.Street
import dagger.Module
import dagger.Provides

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.dagger2.app3.di.module.AddressModule2
 * @author: Tony Shen
 * @date: 2019-12-27 01:25
 * @version: V1.0 <描述当前版本功能>
 */
@Module
class AddressModule2 {

    @Provides
    fun provideAddress(street: Street) = Address(street)
}