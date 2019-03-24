package io.jeffchang.giphy.data.model


import com.squareup.moshi.Json


data class Looping(

	@Json(name="mp4")
	val mp4: String? = null,

	@Json(name="mp4_size")
	val mp4Size: String? = null
)