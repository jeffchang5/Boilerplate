package io.jeffchang.giphy.interactor

import io.jeffchang.giphy.repository.GiphyRepository
import javax.inject.Inject

class GiphyInteractor @Inject constructor(
        private val giphyRepository: GiphyRepository) {

    fun getSearchItems(query: String) = giphyRepository.getSearchItems(query)
            .map { it.data }
}