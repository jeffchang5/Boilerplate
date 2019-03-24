package io.jeffchang.giphy.data.model

import com.squareup.moshi.Json

data class Meta(

	@Json(name="msg")
	val msg: String? = null,

	@Json(name="response_id")
	val responseId: String? = null,

	@Json(name="status")
	val status: Int? = null
)