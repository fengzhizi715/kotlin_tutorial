package com.kotlin.tutorial.aac.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kotlin.tutorial.aac.R
import com.kotlin.tutorial.aac.fragment.Fragment1
import com.kotlin.tutorial.aac.fragment.Fragment2

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.aac.activity.Activity7
 * @author: Tony Shen
 * @date: 2019-11-10 22:14
 * @version: V1.0 <描述当前版本功能>
 */
class Activity7: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_7)

        supportFragmentManager.beginTransaction()
                .add(R.id.frame1, Fragment1())
                .add(R.id.frame2, Fragment2())
                .commit()
    }

}