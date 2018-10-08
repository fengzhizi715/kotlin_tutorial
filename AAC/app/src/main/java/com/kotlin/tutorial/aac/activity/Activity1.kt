package com.kotlin.tutorial.aac.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.kotlin.tutorial.aac.lifecycle.LifeCycleListener

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.aac.activity.Activity1
 * @author: Tony Shen
 * @date: 2018-10-09 00:13
 * @version: V1.0 <描述当前版本功能>
 */
class Activity1: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        lifecycle.addObserver(LifeCycleListener())
    }
}