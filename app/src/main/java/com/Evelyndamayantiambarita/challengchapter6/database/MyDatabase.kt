package com.Evelyndamayantiambarita.challengchapter6.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.Evelyndamayantiambarita.challengchapter6.data.local.movie.MovieDAO
import com.Evelyndamayantiambarita.challengchapter6.data.local.movie.MovieEntity
import com.Evelyndamayantiambarita.challengchapter6.data.local.user.UserDAO
import com.Evelyndamayantiambarita.challengchapter6.data.local.user.UserEntity

@Database(entities = [UserEntity::class, MovieEntity::class], version = 2)
abstract class MyDatabase : RoomDatabase() {

    abstract fun userDAO(): UserDAO
    abstract fun movieDAO(): MovieDAO

    companion object {
        private const val DB_NAME = "My.db"

        @Volatile
        private var INSTANCE: MyDatabase? = null

        fun getInstance(context: Context): MyDatabase {
                return INSTANCE ?: synchronized(this) {
                    INSTANCE ?: buildDatabase(context).also { INSTANCE = it }
                }
            }

            private fun buildDatabase(context: Context): MyDatabase {
                return Room.databaseBuilder(context, MyDatabase::class.java, DB_NAME)
                    .fallbackToDestructiveMigration()
                    .build()
            }

            fun destroyInstance() {
                INSTANCE = null
            }
        }
    }