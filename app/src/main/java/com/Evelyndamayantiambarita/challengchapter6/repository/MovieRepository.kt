package com.Evelyndamayantiambarita.challengchapter6.repository

import com.Evelyndamayantiambarita.challengchapter6.data.api.tmdb.TMDBAPI
import com.Evelyndamayantiambarita.challengchapter6.data.api.tmdb.listgenre.ListGenreResponse
import com.Evelyndamayantiambarita.challengchapter6.data.api.tmdb.moviepopuler.MoviePopulerResponse
import com.Evelyndamayantiambarita.challengchapter6.database.MyDatabase
import retrofit2.Response

/**
 * com.Evelyndamayantiambarita.challengchapter6.common
 *
 * Created by Evelyn Ambarita on 29/06/2022.
 * https://github.com/EvelynAmbarita
 *
 */


class MovieRepository(
    private val api: TMDBAPI,
    private val db: MyDatabase
) {
    suspend fun getMoviePopuler(key: String): Response<MoviePopulerResponse> {
        return api.getMoviePopuler(key)
    }

    suspend fun getListGenre(key: String): Response<ListGenreResponse> {
        return api.getListGenre(key)
    }
}