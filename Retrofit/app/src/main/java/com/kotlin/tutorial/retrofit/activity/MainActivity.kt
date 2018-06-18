package com.kotlin.tutorial.retrofit.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.kotlin.tutorial.retrofit.R
import com.kotlin.tutorial.retrofit.domain.model.publicEvent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initData()
    }

    private fun initData() {

        publicEvent(this,"fengzhizi715")
                .subscribe()
    }
}
