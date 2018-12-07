package com.kotlin.tutorial.retrofit.app2.model

import java.io.Serializable

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.retrofit.app2.model.PM25Model.java
 * @author: Tony Shen
 * @date: 2018-06-20 01:43
 * @version V1.0 <描述当前版本功能>
 */
data class PM25Model(

        var aqi: Int = 0,
        var area: String = "",
        var pm2_5: Int = 0,
        var pm2_5_24h: Int = 0,
        var position_name: String = "",
        var primary_pollutant: String = "",
        var quality: String = "",
        var station_code: String = "",
        var time_point: String = ""
) : Serializable