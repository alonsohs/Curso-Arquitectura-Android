package com.anncode.offersandcoupons.Model

import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("getOffers/")
    fun getCoupons(): Call<JsonObject>
}