package com.kotlin.tutorial.dagger2.app2.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.kotlin.tutorial.dagger2.app2.R
import com.kotlin.tutorial.dagger2.app2.di.component.DaggerUserComponent3
import com.kotlin.tutorial.dagger2.app2.domain.User
import kotlinx.android.synthetic.main.activity_demo_4_qualifier.*
import javax.inject.Inject
import javax.inject.Named

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.dagger2.app2.activity.Demo4QualifierActivity.kt
 * @author: Tony Shen
 * @date: 2018-08-10 17:55
 * @version V1.0 <描述当前版本功能>
 */
class Demo4QualifierActivity : AppCompatActivity() {

    @Inject
    @field:Named("tony") lateinit var tony: User

    @Inject
    @field:Named("monica") lateinit var monica: User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo_4_qualifier)

        DaggerUserComponent3.create().inject(this)

        text1.setOnClickListener {

            Toast.makeText(this@Demo4QualifierActivity,tony.printUserName(),Toast.LENGTH_LONG).show()
        }

        text2.setOnClickListener {

            Toast.makeText(this@Demo4QualifierActivity,monica.printUserName(),Toast.LENGTH_LONG).show()
        }
    }
}