package com.harman.designcompose.weatherapp.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//SETSUP RETROFIT to talk to api
object RetrofitInstance {

    private const val baseUrl = "https://api.weatherapi.com"

    private fun getInstance(): Retrofit {
        return Retrofit.Builder()                                                      //Starts building a new Retrofit instance.
            .baseUrl(baseUrl)                                                          //base URL for all API calls
            .addConverterFactory(GsonConverterFactory.create())                       //Tells Retrofit to use Gson to convert JSON responses into Kotlin objects.
            .build()
    }

    val weatherApi: WeatherApi =
        getInstance().create(WeatherApi::class.java)                                  //instance of WeatherApi to call its fun
}
