package io.jeffchang.giphy.data.model

import com.squareup.moshi.Json

data class SearchItem(

	@Json(name="import_datetime")
	val importDatetime: String? = null,

	@Json(name="images")
	val images: Images,

	@Json(name="embed_url")
	val embedUrl: String? = null,

	@Json(name="trending_datetime")
	val trendingDatetime: String? = null,

	@Json(name="bitly_url")
	val bitlyUrl: String? = null,

	@Json(name="rating")
	val rating: String? = null,

	@Json(name="is_sticker")
	val isSticker: Int? = null,

	@Json(name="source")
	val source: String? = null,

	@Json(name="type")
	val type: String? = null,

	@Json(name="bitly_gif_url")
	val bitlyGifUrl: String? = null,

	@Json(name="title")
	val title: String,

	@Json(name="_score")
	val score: Double? = null,

	@Json(name="source_tld")
	val sourceTld: String? = null,

	@Json(name="url")
	val url: String? = null,

	@Json(name="analytics")
	val analytics: Analytics? = null,

	@Json(name="source_post_url")
	val sourcePostUrl: String? = null,

	@Json(name="content_url")
	val contentUrl: String? = null,

	@Json(name="id")
	val id: String? = null,

	@Json(name="user")
	val user: User? = null,

	@Json(name="slug")
	val slug: String? = null,

	@Json(name="username")
	val username: String? = null
)