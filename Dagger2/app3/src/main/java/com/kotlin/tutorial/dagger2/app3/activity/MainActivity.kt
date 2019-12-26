package com.kotlin.tutorial.dagger2.app3.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.kotlin.tutorial.dagger2.app3.R
import kotlinx.android.synthetic.main.activity_main.*

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.dagger2.app3.activity.MainActivity.kt
 * @author: Tony Shen
 * @date: 2018-08-07 21:19
 * @version V1.0 <描述当前版本功能>
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text1.setOnClickListener {

            val intent = Intent(this,Demo4ModuleIncludeActivity::class.java)
            startActivity(intent)
        }

        text2.setOnClickListener {

            val intent = Intent(this,Demo4ModuleDependenciesActivity::class.java)
            startActivity(intent)
        }
    }
}