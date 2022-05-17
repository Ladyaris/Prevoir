package com.chores.prvoir.models

import com.google.gson.annotations.SerializedName

data class WeatherResponse (
    @field:SerializedName("coord")
    val coord: Coord,

    @field:SerializedName("weather")
    val weather: List<Weather>,

    @field:SerializedName("Sys")
    val sys: Sys,

    @field:SerializedName("main")
    val main: Main,

    @field:SerializedName("name")
    val name: String,

        )