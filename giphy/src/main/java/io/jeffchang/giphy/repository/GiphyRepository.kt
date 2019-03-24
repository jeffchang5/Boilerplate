package io.jeffchang.giphy.repository

import io.jeffchang.giphy.data.service.GiphyService
import javax.inject.Inject

class GiphyRepository @Inject constructor(
        private val giphyService: GiphyService
) {

    fun getSearchItems(query: String) = giphyService.getSearchResults(query)

}