package io.jeffchang.giphy.data.service

import io.jeffchang.base.common.Constants
import io.jeffchang.giphy.data.model.SearchResult
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface GiphyService {

    @GET("/v1/gifs/search?api_key=${Constants.GIPHY_API_KEY}&limit=1&offset=0&rating=G&lang=en")
    fun getSearchResults(@Query("q") query: String): Single<SearchResult>

}