package io.jeffchang.giphy.data.model


import com.squareup.moshi.Json


data class Images(

	@Json(name="preview")
	val preview: Preview? = null,

	@Json(name="original")
	val original: Original,

	@Json(name="preview_gif")
	val previewGif: PreviewGif? = null,

	@Json(name="fixed_height_small")
	val fixedHeightSmall: FixedHeightSmall? = null,

	@Json(name="looping")
	val looping: Looping? = null,

	@Json(name="fixed_width")
	val fixedWidth: FixedWidth? = null,

	@Json(name="downsized_still")
	val downsizedStill: DownsizedStill? = null,

	@Json(name="downsized_large")
	val downsizedLarge: DownsizedLarge? = null,

	@Json(name="fixed_height_downsampled")
	val fixedHeightDownsampled: FixedHeightDownsampled? = null,

	@Json(name="fixed_height_small_still")
	val fixedHeightSmallStill: FixedHeightSmallStill? = null,

	@Json(name="fixed_width_downsampled")
	val fixedWidthDownsampled: FixedWidthDownsampled? = null,

	@Json(name="downsized_medium")
	val downsizedMedium: DownsizedMedium? = null,

	@Json(name="fixed_height")
	val fixedHeight: FixedHeight? = null,

	@Json(name="fixed_width_small")
	val fixedWidthSmall: FixedWidthSmall? = null,

	@Json(name="downsized_small")
	val downsizedSmall: DownsizedSmall? = null,

	@Json(name="original_mp4")
	val originalMp4: OriginalMp4? = null,

	@Json(name="fixed_height_still")
	val fixedHeightStill: FixedHeightStill? = null,

	@Json(name="fixed_width_small_still")
	val fixedWidthSmallStill: FixedWidthSmallStill? = null,

	@Json(name="preview_webp")
	val previewWebp: PreviewWebp? = null,

	@Json(name="480w_still")
	val jsonMember480wStill: JsonMember480wStill? = null,

	@Json(name="fixed_width_still")
	val fixedWidthStill: FixedWidthStill? = null,

	@Json(name="original_still")
	val originalStill: OriginalStill? = null,

	@Json(name="downsized")
	val downsized: Downsized? = null
)