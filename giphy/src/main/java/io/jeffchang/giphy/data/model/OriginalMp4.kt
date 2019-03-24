package io.jeffchang.giphy.data.model


import com.squareup.moshi.Json


data class OriginalMp4(

	@Json(name="mp4")
	val mp4: String? = null,

	@Json(name="width")
	val width: String? = null,

	@Json(name="mp4_size")
	val mp4Size: String? = null,

	@Json(name="height")
	val height: String? = null
)