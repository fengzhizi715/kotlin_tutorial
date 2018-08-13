package com.kotlin.tutorial.dagger2.app2.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.kotlin.tutorial.dagger2.app2.R
import com.kotlin.tutorial.dagger2.app2.di.component.DaggerUserComponent4
import com.kotlin.tutorial.dagger2.app2.di.qualifier.Monica
import com.kotlin.tutorial.dagger2.app2.di.qualifier.Tony
import com.kotlin.tutorial.dagger2.app2.domain.User
import kotlinx.android.synthetic.main.activity_demo_4_qualifier.*
import javax.inject.Inject

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.dagger2.app2.activity.Demo4CustomerQualifierActivity.kt
 * @author: Tony Shen
 * @date: 2018-08-13 17:48
 * @version V1.0 <描述当前版本功能>
 */
class Demo4CustomerQualifierActivity : AppCompatActivity() {

    @Inject
    @field:Tony
    lateinit var tony: User

    @Inject
    @field:Monica
    lateinit var monica: User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo_4_qualifier)

        DaggerUserComponent4.create().inject(this);

        text1.setOnClickListener {

            Toast.makeText(this@Demo4CustomerQualifierActivity,tony.printUserName(), Toast.LENGTH_LONG).show()
        }

        text2.setOnClickListener {

            Toast.makeText(this@Demo4CustomerQualifierActivity,monica.printUserName(), Toast.LENGTH_LONG).show()
        }
    }
}