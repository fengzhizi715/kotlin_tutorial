package com.kotlin.tutorial.aac.activity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.kotlin.tutorial.aac.R
import com.kotlin.tutorial.aac.livedata.MyLiveData
import kotlinx.android.synthetic.main.activity_3.*
import java.util.concurrent.atomic.AtomicInteger


/**
 *
 * @FileName:
 *          com.kotlin.tutorial.aac.activity.Activity3
 * @author: Tony Shen
 * @date: 2019-03-01 14:00
 * @version: V1.0 <描述当前版本功能>
 */
class Activity3: AppCompatActivity() {

    var data = MyLiveData()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

        text.setOnClickListener {

            data.updateValue(data.atomicInteger)
        }

        data.observe(this, Observer<AtomicInteger> { t ->
            text.text = "点击次数："+t //更新控件中的数据
            Log.d("liveData", "数据改变...$t")
        })

    }
}