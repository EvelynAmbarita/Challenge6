package com.Evelyndamayantiambarita.challengchapter6.data.local.user

import androidx.room.*

@Dao
interface UserDAO {
    @Query("SELECT * FROM user WHERE email=:email LIMIT 1")
    fun getUsername(email: String): UserEntity?

    @Query("SELECT * FROM user LIMIT 1")
    fun getUser(): UserEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUser(userEntity: UserEntity): Long

    @Query("DELETE FROM user WHERE email = :email")
    fun deleteUser(email: String): Int
}