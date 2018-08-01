package com.kotlin.tutorial.dagger2.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.kotlin.tutorial.dagger2.di.component.DaggerUserComponent
import com.kotlin.tutorial.dagger2.domain.User
import javax.inject.Inject

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.dagger2.activity.Demo4InjectActivity.ktt
 * @author: Tony Shen
 * @date: 2018-08-02 00:06
 * @version V1.0 <描述当前版本功能>
 */
class Demo4InjectActivity: AppCompatActivity() {

    @Inject
    lateinit var user: User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        DaggerUserComponent.builder().build().inject(this)

        Toast.makeText(this,user.testInject(),Toast.LENGTH_LONG).show()
    }
}