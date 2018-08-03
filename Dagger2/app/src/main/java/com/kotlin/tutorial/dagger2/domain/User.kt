package com.kotlin.tutorial.dagger2.domain

import javax.inject.Inject

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.dagger2.domain.User.kt
 * @author: Tony Shen
 * @date: 2018-08-01 23:56
 * @version V1.0 <描述当前版本功能>
 */
class User @Inject constructor() {

    lateinit var param:String

    constructor(param:String) : this() {
        this.param = param
    }

    fun testInject() = "this is the first Inject"

    fun testModule() = "this is the second Inject"

    fun testInjectWithParam() =  "this is the Inject with parameter: $param"

    fun testComponentBuilder() = "this is the Inject with parameter: $param"
}