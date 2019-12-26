package com.kotlin.tutorial.dagger2.app3.di.component

import com.kotlin.tutorial.dagger2.app3.di.module.StreetModule
import com.kotlin.tutorial.dagger2.app3.domain.Street
import dagger.Component
import javax.inject.Singleton

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.dagger2.app3.di.component.StreetComponent2
 * @author: Tony Shen
 * @date: 2019-12-27 01:27
 * @version: V1.0 <描述当前版本功能>
 */
@Component(modules = arrayOf(StreetModule::class))
interface StreetComponent2 {

    fun inject(street: Street)

    fun street(): Street
}