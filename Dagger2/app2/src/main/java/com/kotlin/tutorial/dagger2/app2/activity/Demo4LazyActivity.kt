package com.kotlin.tutorial.dagger2.app2.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.kotlin.tutorial.dagger2.app2.di.component.DaggerUserComponent1
import com.kotlin.tutorial.dagger2.app2.domain.User
import com.safframework.log.L
import dagger.Lazy
import javax.inject.Inject

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
    lateinit var lazyUser:Lazy<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        DaggerUserComponent1.create().inject(this)

        initData()

        L.i(lazyUser.get().toString())
        L.i(lazyUser.get().toString())
    }

    private fun initData() {

        Toast.makeText(this,lazyUser.get().testLazy(), Toast.LENGTH_LONG).show()
    }
}