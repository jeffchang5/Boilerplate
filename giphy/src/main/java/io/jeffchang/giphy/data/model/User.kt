package io.jeffchang.giphy.data.model


import com.squareup.moshi.Json


data class User(

	@Json(name="avatar_url")
	val avatarUrl: String? = null,

	@Json(name="profile_url")
	val profileUrl: String? = null,

	@Json(name="banner_url")
	val bannerUrl: String? = null,

	@Json(name="banner_image")
	val bannerImage: String? = null,

	@Json(name="display_name")
	val displayName: String? = null,

	@Json(name="is_verified")
	val isVerified: Boolean? = null,

	@Json(name="username")
	val username: String? = null
)