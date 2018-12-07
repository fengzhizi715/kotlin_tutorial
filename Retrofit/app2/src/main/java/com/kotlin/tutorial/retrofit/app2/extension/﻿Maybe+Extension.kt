package com.kotlin.tutorial.retrofit.app2.extension

import io.reactivex.Maybe

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.retrofit.app2.extension.`﻿Maybe+Extension`
 * @author: Tony Shen
 * @date: 2018-12-07 16:12
 * @version: V1.0 <描述当前版本功能>
 */

/**
 * 遇到错误时，能够提前捕获异常，并发射一个默认的值。
 * 后面无须再做异常处理
 */
fun <T> Maybe<T>.errorReturn(defValue:T): Maybe<T> = this.onErrorReturn {

            it -> it.printStackTrace()
            return@onErrorReturn defValue
        }


fun <T> Maybe<T>.errorResumeNext():Maybe<T> = this.onErrorResumeNext(Maybe.empty())