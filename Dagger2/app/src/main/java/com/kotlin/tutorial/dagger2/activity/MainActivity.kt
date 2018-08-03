package com.kotlin.tutorial.dagger2.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.kotlin.tutorial.dagger2.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text1.setOnClickListener {

            val intent = Intent(this,Demo4InjectActivity::class.java)
            startActivity(intent)
        }

        text2.setOnClickListener {

            val intent = Intent(this,Demo4ModuleActivity::class.java)
            startActivity(intent)
        }

        text3.setOnClickListener {

            val intent = Intent(this,Demo4InterfaceInjectActivity::class.java)
            startActivity(intent)
        }

        text4.setOnClickListener {

            val intent = Intent(this,Demo4ComponentBuilderActivity::class.java)
            startActivity(intent)
        }
    }
}
