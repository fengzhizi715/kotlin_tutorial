package com.kotlin.tutorial.dagger2.app2.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.kotlin.tutorial.dagger2.app2.R
import com.kotlin.tutorial.dagger2.app2.di.component.DaggerUserComponent1
import com.kotlin.tutorial.dagger2.app2.domain.User
import javax.inject.Inject
import dagger.Lazy

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.dagger2.app2.activity.Demo4LazyActivity.kt
 * @author: Tony Shen
 * @date: 2018-08-08 00:43
 * @version V1.0 <描述当前版本功能>
 */
class Demo4LazyActivity : AppCompatActivity() {

    @Inject
    lateinit var lazyCar:Lazy<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        DaggerUserComponent1.create().inject(this)

        initData()
    }

    private fun initData() {

        println(lazyCar.get().testLazy())
    }
}