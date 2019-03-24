package io.jeffchang.giphy.data.model

import com.squareup.moshi.Json

data class Onload(

	@Json(name="url")
	val url: String? = null
)