package com.kotlin.tutorial.dagger2.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.kotlin.tutorial.dagger2.di.component.DaggerUserComponent1
import com.kotlin.tutorial.dagger2.di.component.DaggerUserComponent2
import com.kotlin.tutorial.dagger2.domain.User
import javax.inject.Inject

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.dagger2.activity.Demo4ModuleActivity.kt
 * @author: Tony Shen
 * @date: 2018-08-02 01:03
 * @version V1.0 <描述当前版本功能>
 */
class Demo4ModuleActivity: AppCompatActivity() {

    @Inject
    lateinit var user: User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        DaggerUserComponent2.builder().build().inject(this)

        Toast.makeText(this,user.testModule(), Toast.LENGTH_LONG).show()
    }
}