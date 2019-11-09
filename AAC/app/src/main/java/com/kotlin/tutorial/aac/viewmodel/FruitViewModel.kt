package com.kotlin.tutorial.aac.viewmodel

import android.os.Handler
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.aac.viewmodel.FruitViewModel
 * @author: Tony Shen
 * @date: 2019-11-09 12:03
 * @version: V1.0 <描述当前版本功能>
 */
class FruitViewModel: ViewModel() {

    private var fruitList: MutableLiveData<List<String>>? = null
    private val handler:Handler = Handler()

    override fun onCleared() {
        super.onCleared()
        Log.d(TAG, "onCleared");
    }

    fun getFruitList(): LiveData<List<String>> {

        if (fruitList == null) {
            fruitList = MutableLiveData<List<String>>()
            loadFruits()
        }
        return fruitList as LiveData<List<String>>
    }

    /**
     * 模拟网络请求，延迟2.5s
     */
    private fun loadFruits(){
        handler.postDelayed({
            val list = ArrayList<String>()
            list.add("Apple")
            list.add("Banana")
            list.add("Orange")
            list.add("Pear")
            list.add("Watermelon")

            fruitList?.let {

                it.value = list
            }
        }, 2500)
    }

    companion object {
        private val TAG = FruitViewModel::class.java.simpleName
    }
}