package com.kotlin.tutorial.coroutines.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import com.kotlin.tutorial.coroutines.R
import com.kotlin.tutorial.coroutines.ext.onClick
import kotlinx.android.synthetic.main.activity_main.*

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.coroutines.activity.MainActivity.kt
 * @author: Tony Shen
 * @date: 2018-09-02 14:13
 * @version: V1.0 <描述当前版本功能>
 */
class MainActivity : AppCompatActivity() {

    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text1.onClick {

            Toast.makeText(this@MainActivity, "${count++}", Toast.LENGTH_SHORT).show()
        }
    }
}