package com.kotlin.tutorial.aac.livedata
import android.util.Log
import androidx.lifecycle.LiveData
import java.util.concurrent.atomic.AtomicInteger


/**
 *
 * @FileName:
 *          com.kotlin.tutorial.aac.livedata.MyLiveData
 * @author: Tony Shen
 * @date: 2019-11-08 23:06
 * @version: V1.0 <描述当前版本功能>
 */
class MyLiveData : LiveData<AtomicInteger>() {

    var atomicInteger:AtomicInteger = AtomicInteger(0)

    override fun onActive() {
        super.onActive()
        Log.d(TAG, "onActive")
    }

    override fun onInactive() {
        super.onInactive()
        Log.d(TAG, "onInactive")
    }

    override fun setValue(value: AtomicInteger?) {
        super.setValue(value)
        Log.d(TAG, "setValue...$value")
    }

    fun updateValue(value: AtomicInteger?) {
        atomicInteger.incrementAndGet()
        setValue(atomicInteger)
    }

    companion object {
        private val TAG = MyLiveData::class.java.simpleName
    }
}