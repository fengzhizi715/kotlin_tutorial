package com.kotlin.tutorial.retrofit.app2.model

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.retrofit.app2.model.ZipObject.java
 * @author: Tony Shen
 * @date: 2018-06-20 10:44
 * @version V1.0 <描述当前版本功能>
 */
data class ZipObject(

        var pm2_5_quality: String,
        var pm2_5: Int,
        var pm2_5_24h: Int,

        var so2: Int,
        var so2_24h: Int
)