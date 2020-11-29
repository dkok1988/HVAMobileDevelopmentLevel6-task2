package com.hva.madlevel6task2.api

import android.content.Context
import com.hva.madlevel6task2.R

class MoviesRepository(var context: Context) {
    private val moviesApi: MoviesApiService = MoviesApi.createApi()

    fun getMovies(year: String) = moviesApi.getMoviesForYear(
        mapOf(
            "api_key" to context.getString(R.string.tmdb_api_key),
            "language" to "en-US",
            "sort_by" to "popularity.desc",
            "include_adult" to "false",
            "include_video" to "false",
            "page" to "1",
            "primary_release_year" to year)
    )
}

