package com.kotlin.tutorial.aac.activity

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.kotlin.tutorial.aac.R
import com.kotlin.tutorial.aac.db.User
import com.kotlin.tutorial.aac.db.UserDatabase
import kotlinx.android.synthetic.main.activity_6.*

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.aac.activity.Activity6
 * @author: Tony Shen
 * @date: 2019-11-09 16:29
 * @version: V1.0 <描述当前版本功能>
 */
class Activity6: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_6)

        bindClickListeners()
    }

    private fun bindClickListeners() {

        val userDao = UserDatabase.getInstance(applicationContext).userDao()
        val usersLiveData = userDao.getAll()

        val observer = Observer<List<User>> { userList ->
            appendToLog("Count=${userList.count()}")
            userList.forEach {
                val msg = "$it (id=${it.id})"
                appendToLog("$it (id=${it.id})")
            }
        }

        observeButton.setOnClickListener {
            appendToLog("OBSERVE")
            usersLiveData.observe(this, observer)
        }

        unobserveButton.setOnClickListener {
            appendToLog("UNOBSERVE")
            usersLiveData.removeObserver(observer)
        }

        addButton.setOnClickListener {
            appendToLog("ADD")
            val userCount = userDao.getCount()
            userDao.insert(User("User ${userCount + 1}"))
        }

        deleteButton.setOnClickListener {
            appendToLog("DELETE")
            userDao.deleteAll()
        }
    }

    private fun appendToLog(msg: String) {
        val sb = StringBuilder()
        sb.append("\n$msg")

        Toast.makeText(this,sb.toString(),Toast.LENGTH_LONG).show()
    }

    companion object {
        private val TAG = Activity6::class.java.simpleName
    }
}