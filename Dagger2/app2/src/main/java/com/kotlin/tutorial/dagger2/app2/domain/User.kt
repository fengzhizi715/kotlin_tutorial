package com.kotlin.tutorial.dagger2.app2.domain

import javax.inject.Inject

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.dagger2.app2.domain.User.kt
 * @author: Tony Shen
 * @date: 2018-08-08 00:50
 * @version V1.0 <描述当前版本功能>
 */
class User @Inject constructor() {

    fun testLazy() = "this is the Lazy Inject"
}