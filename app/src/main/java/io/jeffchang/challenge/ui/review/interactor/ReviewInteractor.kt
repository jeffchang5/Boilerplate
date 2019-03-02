package io.jeffchang.challenge.ui.review.interactor

import io.jeffchang.challenge.ui.review.repository.ReviewRepository
import javax.inject.Inject

class ReviewInteractor @Inject constructor(
        private val reviewRepository: ReviewRepository) {

    fun getReviews() =
            reviewRepository.getReviews()


}