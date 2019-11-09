package com.kotlin.tutorial.aac.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

/**
 *
 * @FileName:
 *          com.kotlin.tutorial.aac.db.UserDatabase
 * @author: Tony Shen
 * @date: 2019-11-09 16:36
 * @version: V1.0 <描述当前版本功能>
 */
@Database(
        entities = [User::class],
        version = 2
)
abstract class UserDatabase : RoomDatabase() {

    abstract fun userDao(): UserDao

    companion object {

        @Volatile
        private var myDb: UserDatabase? = null

        fun getInstance(context: Context): UserDatabase =
                myDb ?: synchronized(this) {
                    myDb ?: buildDatabase(context).also{ myDb = it }
                }

        private fun buildDatabase(context: Context) =
                Room.databaseBuilder(
                        context.applicationContext,
                        UserDatabase::class.java, "db")
                        .allowMainThreadQueries()
                        .build()
    }
}
