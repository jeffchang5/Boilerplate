package io.jeffchang.giphy.data.model


import com.squareup.moshi.Json


data class Onclick(

	@Json(name="url")
	val url: String? = null
)