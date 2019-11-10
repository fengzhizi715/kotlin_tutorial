package com.kotlin.tutorial.aac.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.aac.viewmodel.SharedViewModel
 * @author: Tony Shen
 * @date: 2019-11-10 22:18
 * @version: V1.0 <描述当前版本功能>
 */
class SharedViewModel : ViewModel() {

    private val text : MutableLiveData<CharSequence> = MutableLiveData()

    fun setText(input: CharSequence) {
        text.value = input
    }

    fun getText() = text
}