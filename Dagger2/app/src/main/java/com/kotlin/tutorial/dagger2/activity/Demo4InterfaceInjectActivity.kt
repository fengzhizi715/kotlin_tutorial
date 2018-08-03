package com.kotlin.tutorial.dagger2.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.kotlin.tutorial.dagger2.IService
import com.kotlin.tutorial.dagger2.di.component.DaggerDemoComponent
import javax.inject.Inject

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.dagger2.activity.Demo4InterfaceInjectActivity.kt
 * @author: Tony Shen
 * @date: 2018-08-03 11:33
 * @version V1.0 <描述当前版本功能>
 */
class Demo4InterfaceInjectActivity: AppCompatActivity() {

    @Inject
    lateinit var service: IService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        DaggerDemoComponent.create().inject(this)

        Toast.makeText(this,service.foo(), Toast.LENGTH_LONG).show()
    }
}