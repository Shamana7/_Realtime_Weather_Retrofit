package com.harman.designcompose.weatherapp.api

//T refers to WeatherModel
sealed class NetworkResponse<out T> {
    data class Success<out T>(val data : T) : NetworkResponse<T>()      // Success is child of NetworkResponse
    data class Error(val message : String) : NetworkResponse<Nothing>()
    object Loading : NetworkResponse<Nothing>()
}