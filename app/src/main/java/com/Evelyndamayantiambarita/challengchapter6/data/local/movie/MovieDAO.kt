package com.Evelyndamayantiambarita.challengchapter6.data.local.movie

import androidx.room.*

/**
 * com.Evelyndamayantiambarita.challengchapter6.common
 *
 * Created by Evelyn Ambarita on 29/06/2022.
 * https://github.com/EvelynAmbarita
 *
 */

@Dao
interface MovieDAO {
    @Insert
    suspend fun addMovieLocal(movieEntity: MovieEntity)

    @Delete
    suspend fun deleteMovieLocal(movieEntity: MovieEntity)

    @Query("SELECT * FROM movie")
    suspend fun getMovieLocal(): List<MovieEntity>

    @Query("SELECT * FROM movie WHERE id=:id LIMIT 1")
    fun getOneMovie(id: String): MovieEntity?

    @Query("DELETE FROM movie WHERE id = :id")
    fun deleteMovie(id: String): Int
}