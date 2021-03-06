package com.kotlin.tutorial.aac.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kotlin.tutorial.aac.R
import kotlinx.android.synthetic.main.activity_main.*


/**
 *
 * @FileName:
 *          com.kotlin.tutorial.aac.activity.MainActivity
 * @author: Tony Shen
 * @date: 2018-10-08 15:42
 * @version: V1.0 <描述当前版本功能>
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text1.setOnClickListener {

            val intent = Intent(this,Activity1::class.java)
            startActivity(intent)
        }

        text2.setOnClickListener {

            val intent = Intent(this,Activity2::class.java)
            startActivity(intent)
        }

        text3.setOnClickListener {

            val intent = Intent(this,Activity3::class.java)
            startActivity(intent)
        }

        text4.setOnClickListener {

            val intent = Intent(this,Activity4::class.java)
            startActivity(intent)
        }

        text5.setOnClickListener {

            val intent = Intent(this,Activity5::class.java)
            startActivity(intent)
        }

        text6.setOnClickListener {

            val intent = Intent(this,Activity6::class.java)
            startActivity(intent)
        }

        text7.setOnClickListener {

            val intent = Intent(this,Activity7::class.java)
            startActivity(intent)
        }
    }
}