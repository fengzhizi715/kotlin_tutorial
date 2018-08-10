package com.kotlin.tutorial.dagger2.app2.domain

import javax.inject.Inject

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.dagger2.app2.domain.Street.kt
 * @author: Tony Shen
 * @date: 2018-08-10 16:14
 * @version V1.0 <描述当前版本功能>
 */
class Street @Inject constructor(streetName:String) {

    private val streetName: String

    init {
        this.streetName = streetName
    }

    override fun toString(): String {

        return streetName
    }
}