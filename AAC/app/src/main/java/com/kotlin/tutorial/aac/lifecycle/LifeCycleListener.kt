package com.kotlin.tutorial.aac.lifecycle

import android.arch.lifecycle.LifecycleObserver
import android.util.Log
import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.OnLifecycleEvent


/**
 *
 * @FileName:
 *          com.kotlin.tutorial.aac.lifecycle.LifeCycleListener
 * @author: Tony Shen
 * @date: 2018-10-08 16:39
 * @version: V1.0 <描述当前版本功能>
 */
class LifeCycleListener : LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate() {
        Log.d(TAG, "onCreate")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStart() {
        Log.d(TAG, "onStart")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResume() {
        Log.d(TAG, "onResume")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPause() {
        Log.d(TAG, "onPause")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStop() {
        Log.d(TAG, "onStop")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy() {
        Log.d(TAG, "onDestroy")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    fun onAny() {
        Log.d(TAG, "onAny")
    }

    companion object {
        private val TAG = LifeCycleListener::class.java.simpleName
    }
}