package com.kotlin.tutorial.coroutines.api


import com.kotlin.tutorial.coroutines.model.PM25Model
import com.kotlin.tutorial.coroutines.model.SO2Model
import kotlinx.coroutines.experimental.Deferred
import retrofit2.http.GET
import retrofit2.http.Query

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.coroutines.api.APIService.kt
 * @author: Tony Shen
 * @date: 2018-06-18 19:28
 * @version V1.0 <描述当前版本功能>
 */
interface APIService {

    companion object {

        val API_BASE_SERVER_URL = "http://www.pm25.in/"
    }

    @GET("api/querys/pm2_5.json")
    fun pm25(@Query("city") cityId: String, @Query("token") token: String): Deferred<List<PM25Model>>

    @GET("api/querys/so2.json")
    fun so2(@Query("city") cityId: String, @Query("token") token: String): Deferred<List<SO2Model>>

}