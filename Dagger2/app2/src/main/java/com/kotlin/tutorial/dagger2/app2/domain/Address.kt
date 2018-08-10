package com.kotlin.tutorial.dagger2.app2.domain

import javax.inject.Inject

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.dagger2.app2.domain.Address.kt
 * @author: Tony Shen
 * @date: 2018-08-10 15:57
 * @version V1.0 <描述当前版本功能>
 */
class Address @Inject constructor(street: Street) {

    private val street:Street

    init {

        this.street = street
    }

    override fun toString(): String {
        return "address:" + street.toString()
    }
}