package com.kotlin.tutorial.aac.activity


import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.kotlin.tutorial.aac.R
import com.kotlin.tutorial.aac.viewmodel.FruitViewModel
import kotlinx.android.synthetic.main.activity_4.*

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.aac.activity.Activity4
 * @author: Tony Shen
 * @date: 2019-11-09 11:53
 * @version: V1.0 <描述当前版本功能>
 */
class Activity4: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4)

        this.progressbar.visibility = View.VISIBLE

        var model: FruitViewModel = ViewModelProviders.of(this).get(FruitViewModel::class.java)

        model.getFruitList().observe(this, Observer {

            var adapter: ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,it)
            this.listView.adapter = adapter
            this.progressbar.visibility = View.INVISIBLE
        })

    }
}