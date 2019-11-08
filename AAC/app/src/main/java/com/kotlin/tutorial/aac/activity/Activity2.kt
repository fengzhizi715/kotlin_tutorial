package com.kotlin.tutorial.aac.activity

import android.app.Activity
import android.os.Bundle
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import com.kotlin.tutorial.aac.lifecycle.LifeCycleListener


/**
 *
 * @FileName:
 *          com.kotlin.tutorial.aac.activity.Activity2
 * @author: Tony Shen
 * @date: 2018-10-09 00:20
 * @version: V1.0 <描述当前版本功能>
 */
class Activity2: Activity(), LifecycleOwner {

    private lateinit var mLifecycleRegistry: LifecycleRegistry

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mLifecycleRegistry = LifecycleRegistry(this)
        mLifecycleRegistry.markState(Lifecycle.State.CREATED)
        getLifecycle().addObserver(LifeCycleListener())
    }

    override fun getLifecycle(): Lifecycle = mLifecycleRegistry

    @Override
    override fun onStart() {
        super.onStart();
        mLifecycleRegistry.markState(Lifecycle.State.STARTED);
    }

    @Override
    override fun onResume() {
        super.onResume();
        mLifecycleRegistry.markState(Lifecycle.State.RESUMED);
    }

    @Override
    override fun onDestroy() {
        super.onDestroy();
        mLifecycleRegistry.markState(Lifecycle.State.DESTROYED);
    }
}