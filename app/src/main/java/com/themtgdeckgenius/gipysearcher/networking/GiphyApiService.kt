package com.themtgdeckgenius.gipysearcher.networking

import com.themtgdeckgenius.gipysearcher.networking.models.GiphyModel
import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface GiphyApiService {

    @GET("v1/gifs/search")
    fun getGifList(
        @Query("api_key") api_key: String,
        @Query("q") q: String,
        @Query("limit") limit: Int,
        @Query("offset") offset: Int,
        @Query("rating") rating: String,
        @Query("lang") lang: String
    ): Observable<GiphyModel.Result>

    companion object {
        fun create(): GiphyApiService {
            val retrofit = Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://api.giphy.com/")
                .build()

            return retrofit.create(GiphyApiService::class.java)
        }
    }
}