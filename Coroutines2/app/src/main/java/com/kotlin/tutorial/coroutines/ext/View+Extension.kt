package com.kotlin.tutorial.coroutines.ext

import android.view.View
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.actor

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.coroutines.ext.`View+Extension`.kt
 * @author: Tony Shen
 * @date: 2018-09-02 14:27
 * @version: V1.0 <描述当前版本功能>
 */
interface JobHolder {
    val job: Job
}

val View.contextJob: Job
    get() = (context as? JobHolder)?.job ?: NonCancellable

fun View.onClick(time: Long = 600,action: suspend (View) -> Unit) {

    // launch one actor as a parent of the context job
    val eventActor = GlobalScope.actor<Unit>(contextJob + Dispatchers.Main ) {
        for (event in channel) {

            delay(time)
            action(this@onClick)
        }
    }

    // install a listener to activate this actor
    setOnClickListener {
        eventActor.offer(Unit)
    }
}