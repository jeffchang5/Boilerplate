package io.jeffchang.giphy.data.model

import com.squareup.moshi.Json

data class Analytics(

	@Json(name="onclick")
	val onclick: Onclick? = null,

	@Json(name="onsent")
	val onsent: Onsent? = null,

	@Json(name="onload")
	val onload: Onload? = null
)