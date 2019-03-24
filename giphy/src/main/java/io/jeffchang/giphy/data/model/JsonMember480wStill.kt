package io.jeffchang.giphy.data.model


import com.squareup.moshi.Json


data class JsonMember480wStill(

	@Json(name="width")
	val width: String? = null,

	@Json(name="url")
	val url: String? = null,

	@Json(name="height")
	val height: String? = null
)