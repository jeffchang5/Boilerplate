package io.jeffchang.challenge.data.service

import io.jeffchang.challenge.data.model.Review
import io.reactivex.Single
import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Streaming
import retrofit2.http.Url

interface ReviewService {

    @GET
    fun getReviews(): Single<List<Review>>

}