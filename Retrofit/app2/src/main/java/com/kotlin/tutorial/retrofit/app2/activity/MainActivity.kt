package com.kotlin.tutorial.retrofit.app2.activity

import android.os.Bundle

import android.support.v7.app.AppCompatActivity
import com.kotlin.tutorial.retrofit.app2.R
import com.kotlin.tutorial.retrofit.app2.http.RetrofitManager
import com.kotlin.tutorial.retrofit.app2.model.ZipObject
import com.kotlin.tutorial.retrofit.app2.model.SO2Model
import com.kotlin.tutorial.retrofit.app2.model.PM10Model
import com.kotlin.tutorial.retrofit.app2.model.PM25Model
import io.reactivex.Maybe

import com.safframework.utils.RxJavaUtils
import com.kotlin.tutorial.retrofit.app2.config.Constant
import com.safframework.tony.common.utils.Preconditions
import io.reactivex.functions.Function3
import kotlinx.android.synthetic.main.activity_main.*


/**
 *
 * @FileName:
 *          com.kotlin.tutorial.retrofit.app2.activity.MainActivity.java
 * @author: Tony Shen
 * @date: 2018-06-20 01:14
 * @version V1.0 <描述当前版本功能>
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initData()
    }

    private fun initData() {

        val apiService = RetrofitManager.get().apiService()

        val pm25Maybe = apiService.pm25(Constant.CITY_ID, Constant.TOKEN)
                .compose(RxJavaUtils.maybeToMain<List<PM25Model>>())
                .filter {

                    it ->
                    Preconditions.isNotBlank(it)
                }
                .flatMap { pm25Models: List<PM25Model> ->

                    for (model in pm25Models) {

                        if ("南门" == model.position_name) {

                            return@flatMap Maybe.just(model)
                        }
                    }

                    null
                }

        val pm10Maybe = apiService.pm10(Constant.CITY_ID, Constant.TOKEN)
                .compose(RxJavaUtils.maybeToMain<List<PM10Model>>())
                .filter {

                    it ->
                    Preconditions.isNotBlank(it)
                }
                .flatMap { pm10Models: List<PM10Model> ->

                    for (model in pm10Models) {

                        if ("南门" == model.position_name) {

                            return@flatMap Maybe.just(model)
                        }
                    }

                    null

                }

        val so2Maybe = apiService.so2(Constant.CITY_ID, Constant.TOKEN)
                .compose(RxJavaUtils.maybeToMain<List<SO2Model>>())
                .filter {

                    it ->
                    Preconditions.isNotBlank(it)
                }
                .flatMap { so2Models: List<SO2Model> ->

                    for (model in so2Models) {

                        if ("南门" == model.position_name) {

                            return@flatMap Maybe.just(model)
                        }
                    }

                    null
                }

        // 合并多个网络请求
        Maybe.zip(pm25Maybe, pm10Maybe, so2Maybe, Function3<PM25Model, PM10Model, SO2Model, ZipObject> { pm25Model, pm10Model, so2Model ->

            ZipObject(pm25Model.quality,
                    pm25Model.pm2_5,
                    pm25Model.pm2_5_24h,
                    pm10Model.pm10,
                    pm10Model.pm10_24h,
                    so2Model.so2,
                    so2Model.so2_24h)
        }).subscribe({

            quality.setText("空气质量指数：" + it.pm2_5_quality)
            pm2_5.setText("PM2.5 1小时内平均：" + it.pm2_5)
            pm2_5_24h.setText("PM2.5 24小时滑动平均：" + it.pm2_5_24h)

            pm10.setText("PM10 1小时内平均：" + it.pm10)
            pm10_24h.setText("PM10 24小时滑动平均：" + it.pm10_24h)

            so2.setText("二氧化硫1小时平均：" + it.so2)
            so2_24h.setText("二氧化硫24小时滑动平均：" + it.so2_24h)
        }, {

            println(it.message)
        })
    }
}