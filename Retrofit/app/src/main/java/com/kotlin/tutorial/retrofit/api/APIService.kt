package com.kotlin.tutorial.retrofit.api

import io.reactivex.Maybe
import retrofit2.http.Body
import retrofit2.http.POST

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.retrofit.api.APIService.java
 * @author: Tony Shen
 * @date: 2018-06-18 19:28
 * @version V1.0 <描述当前版本功能>
 */
interface APIService {

    companion object {

        const val API_BASE_SERVER_URL = "https://www.reddit.com/"
    }

//    @POST("session/init")
//    fun sessionInit(@Body param: SessionInitParam): Maybe<SessionInitModel>
}