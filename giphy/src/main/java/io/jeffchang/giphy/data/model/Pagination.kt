package io.jeffchang.giphy.data.model


import com.squareup.moshi.Json


data class Pagination(

	@Json(name="offset")
	val offset: Int? = null,

	@Json(name="total_count")
	val totalCount: Int? = null,

	@Json(name="count")
	val count: Int? = null
)