package io.jeffchang.giphy.data.model

import com.squareup.moshi.Json

data class SearchResult(

		@Json(name="pagination")
	val pagination: Pagination,

		@Json(name="data")
	val data: List<SearchItem>,

		@Json(name="meta")
	val meta: Meta? = null
)