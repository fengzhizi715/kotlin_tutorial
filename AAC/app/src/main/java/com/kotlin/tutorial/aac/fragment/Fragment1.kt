package com.kotlin.tutorial.aac.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.kotlin.tutorial.aac.R
import com.kotlin.tutorial.aac.delegate.viewModelDelegate
import com.kotlin.tutorial.aac.viewmodel.SharedViewModel
import kotlinx.android.synthetic.main.fragment_1.*
import kotlinx.android.synthetic.main.fragment_1.view.*

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.aac.fragment.Fragment1
 * @author: Tony Shen
 * @date: 2019-11-10 22:20
 * @version: V1.0 <描述当前版本功能>
 */
class Fragment1 : Fragment() {

    private val viewModel by viewModelDelegate(SharedViewModel::class)

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_1, container, false)

        v.button_ok.setOnClickListener {
            viewModel.setText(edit_text.text.toString())
        }

        return v
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel.getText().observe(viewLifecycleOwner, Observer {
            text -> edit_text.setText(text)
        })
    }
}