package com.kotlin.tutorial.dagger2.app2.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.kotlin.tutorial.dagger2.app2.di.component.DaggerUserComponent2
import com.kotlin.tutorial.dagger2.app2.domain.User
import com.safframework.log.L
import javax.inject.Inject
import javax.inject.Provider

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.dagger2.app2.activity.Demo4ProviderInjectActivity.kt
 * @author: Tony Shen
 * @date: 2018-08-10 16:59
 * @version V1.0 <描述当前版本功能>
 */
class Demo4ProviderInjectActivity : AppCompatActivity() {

    @Inject
    lateinit var userProvider: Provider<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        DaggerUserComponent2.create().inject(this)

        val list = ArrayList<User>()

        for (i in 0 until 10) {

            userProvider?.let {

                it?.let {

                    list.add(it.get())
                }
            }
        }

        Toast.makeText(this,"注入User的数量："+list.size,Toast.LENGTH_LONG).show()

        val user1 = list.get(0)
        val user2 = list.get(1)

        L.i(user1.toString())
        L.i(user2.toString())
    }
}