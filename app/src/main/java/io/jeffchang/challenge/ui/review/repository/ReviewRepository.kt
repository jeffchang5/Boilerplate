package io.jeffchang.challenge.ui.review.repository

import io.jeffchang.challenge.data.service.ReviewService
import javax.inject.Inject

class ReviewRepository @Inject constructor(
        private val reviewService: ReviewService
) {

    fun getReviews() = reviewService.getReviews()

}