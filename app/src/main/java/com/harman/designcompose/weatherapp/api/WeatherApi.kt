package com.harman.designcompose.weatherapp.api

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

//DEFINES API
interface WeatherApi {
    @GET("v1/current.json")                 //get request to api
    suspend fun getWeather(
        @Query("key") apikey: String,
        @Query("q") city: String,           //pass api key and city as paameter
    ): Response<WeatherModel>
}
