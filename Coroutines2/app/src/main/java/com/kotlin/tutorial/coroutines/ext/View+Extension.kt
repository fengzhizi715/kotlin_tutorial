package com.kotlin.tutorial.coroutines.ext

import android.view.View
import kotlinx.coroutines.experimental.Job
import kotlinx.coroutines.experimental.NonCancellable
import kotlinx.coroutines.experimental.android.UI
import kotlinx.coroutines.experimental.channels.actor

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

fun View.onClick(action: suspend (View) -> Unit) {
    // launch one actor as a parent of the context job
    val eventActor = actor<Unit>(contextJob + UI) {
        for (event in channel) action(this@onClick)
    }
    // install a listener to activate this actor
    setOnClickListener {
        eventActor.offer(Unit)
    }
}