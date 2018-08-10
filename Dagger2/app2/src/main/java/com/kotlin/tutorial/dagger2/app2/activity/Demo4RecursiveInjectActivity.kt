package com.kotlin.tutorial.dagger2.app2.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.kotlin.tutorial.dagger2.app2.di.component.DaggerAddressComponent
import com.kotlin.tutorial.dagger2.app2.domain.Address
import javax.inject.Inject

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.dagger2.app2.activity.Demo4RecursiveInjectActivity.kt
 * @author: Tony Shen
 * @date: 2018-08-10 15:53
 * @version V1.0 <描述当前版本功能>
 */
class Demo4RecursiveInjectActivity : AppCompatActivity() {

    @Inject
    lateinit var address: Address

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        DaggerAddressComponent.create().inject(this)

        Toast.makeText(this,address.toString(), Toast.LENGTH_LONG).show()
    }
}