package com.noscript.moviesearch.network

import com.noscript.moviesearch.entities.PeliculaAPI
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface PeliculaService {
    @GET("movie/{id}")
    fun getPelicula(@Path("id") id: Int): Call<PeliculaAPI>
}