package com.kotlin.tutorial.aac.db

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.aac.db.User
 * @author: Tony Shen
 * @date: 2019-11-09 16:32
 * @version: V1.0 <描述当前版本功能>
 */
@Entity(tableName = "users")
data class User(val name: String) {

    @PrimaryKey(autoGenerate = true)
    var id: Long = 0
}