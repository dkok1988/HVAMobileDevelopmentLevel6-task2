package com.hva.madlevel6task2.model

import com.google.gson.annotations.SerializedName

data class MoviePage(
    @SerializedName("results") var movies: List<Movie>
)