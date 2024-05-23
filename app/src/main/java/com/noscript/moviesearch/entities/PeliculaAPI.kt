package com.noscript.moviesearch.entities

import com.google.gson.annotations.SerializedName

data class PeliculaAPI(
    val id: Int,
    val title: String,
    val overview: String,
    @SerializedName("release_date") val releaseDate: String,
    val posterPath: String,
    val genres: List<Genero>
)

data class Genero(
    val id: Int,
    val name: String
)
