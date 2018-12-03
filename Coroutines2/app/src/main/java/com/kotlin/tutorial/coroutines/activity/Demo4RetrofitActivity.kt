package com.kotlin.tutorial.coroutines.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.kotlin.tutorial.coroutines.R
import com.kotlin.tutorial.coroutines.config.Constant
import com.kotlin.tutorial.coroutines.http.RetrofitManager
import com.kotlin.tutorial.coroutines.model.PM25Model
import com.kotlin.tutorial.coroutines.model.SO2Model
import com.kotlin.tutorial.coroutines.model.ZipObject
import kotlinx.android.synthetic.main.activity_demo_4_retrofit.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.withContext

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.coroutines.activity.Demo4RetrofitActivity.ktt
 * @author: Tony Shen
 * @date: 2018-09-02 14:14
 * @version: V1.0 <描述当前版本功能>
 */
class Demo4RetrofitActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo_4_retrofit)

        initData()
    }

    private fun initData() {

        val apiService = RetrofitManager.get().apiService()

        GlobalScope.async(Dispatchers.Default) {

            val pm25List = apiService.pm25(Constant.CITY_ID, Constant.TOKEN).await()

            var pm25Model:PM25Model? = null

            pm25List.forEach {

                if ("南门" == it.position_name) {

                    pm25Model = it
                }
            }

            val so2List = apiService.so2(Constant.CITY_ID, Constant.TOKEN).await()

            var so2Model:SO2Model? = null

            so2List.forEach {

                if ("南门" == it.position_name) {

                    so2Model = it
                }
            }

            val zipObject = ZipObject(pm25Model?.quality,
                    pm25Model?.pm2_5,
                    pm25Model?.pm2_5_24h,
                    so2Model?.so2,
                    so2Model?.so2_24h)


            withContext(Dispatchers.Main) {

                quality.setText("空气质量指数：" + zipObject.pm2_5_quality)
                pm2_5.setText("PM2.5 1小时内平均：" + zipObject.pm2_5)
                pm2_5_24h.setText("PM2.5 24小时滑动平均：" + zipObject.pm2_5_24h)

                so2.setText("二氧化硫1小时平均：" + zipObject.so2)
                so2_24h.setText("二氧化硫24小时滑动平均：" + zipObject.so2_24h)
            }
        }
    }
}