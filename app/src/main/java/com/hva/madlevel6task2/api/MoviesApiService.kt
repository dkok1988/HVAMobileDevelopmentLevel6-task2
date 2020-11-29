package com.hva.madlevel6task2.api

import com.hva.madlevel6task2.model.MoviePage
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.QueryMap

public interface MoviesApiService {
    @GET("/3/discover/movie")
    fun getMoviesForYear(@QueryMap params: Map<String, String>): Call<MoviePage>
}