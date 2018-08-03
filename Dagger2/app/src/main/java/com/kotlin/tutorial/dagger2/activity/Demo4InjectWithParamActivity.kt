package com.kotlin.tutorial.dagger2.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.kotlin.tutorial.dagger2.di.component.DaggerUserComponent4
import com.kotlin.tutorial.dagger2.di.module.UserModule4
import com.kotlin.tutorial.dagger2.domain.User
import javax.inject.Inject

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.dagger2.activity.Demo4InjectWithParamActivity.kt* @author: Tony Shen
 * @date: 2018-08-03 12:57
 * @version V1.0 <描述当前版本功能>
 */
class Demo4InjectWithParamActivity: AppCompatActivity() {

    @Inject
    lateinit var user: User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val userModule = UserModule4()
        userModule.param("this")

        DaggerUserComponent4.builder().userModule4(userModule).build().inject(this)

        Toast.makeText(this,user.testInjectWithParam(), Toast.LENGTH_LONG).show()
    }
}