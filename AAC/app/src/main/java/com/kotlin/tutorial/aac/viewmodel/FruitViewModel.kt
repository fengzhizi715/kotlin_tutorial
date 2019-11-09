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

    private fun loadFruits(){
        handler.postDelayed({
            val fruitsStringList = ArrayList<String>()
            fruitsStringList.add("Mango")
            fruitsStringList.add("Apple")
            fruitsStringList.add("Orange")
            fruitsStringList.add("Banana")
            fruitsStringList.add("Grapes")

            fruitList?.let {

                it.value = fruitsStringList
            }
        }, 5000)
    }

    companion object {
        private val TAG = FruitViewModel::class.java.simpleName
    }
}