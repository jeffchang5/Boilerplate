package io.jeffchang.giphy.data.model


import com.squareup.moshi.Json


data class Onsent(

	@Json(name="url")
	val url: String? = null
)