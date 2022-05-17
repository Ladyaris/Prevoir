package com.chores.prvoir.models

import com.google.gson.annotations.SerializedName

data class Sys (
    @field:SerializedName("type")
    val type: Int,

    @field:SerializedName("id")
    val id: Int,

    @field:SerializedName("country")
    val country: Int,
        )