package com.kotlin.tutorial.aac.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.aac.db.UserDao
 * @author: Tony Shen
 * @date: 2019-11-09 16:35
 * @version: V1.0 <描述当前版本功能>
 */
@Dao
interface UserDao {

    @Insert
    fun insert(obj: User): Long

    @Query("SELECT * FROM users")
    fun getAll(): LiveData<List<User>>

    @Query("SELECT Count(*) FROM users")
    fun getCount(): Int

    @Query("DELETE FROM users")
    fun deleteAll()
}