/*
Copyright (c) 2019 Kotlin Data Classes Generated from JSON powered by http://www.json2kotlin.com

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

For support, please feel free to contact me at https://www.linkedin.com/in/syedabsar */
package com.themtgdeckgenius.gipysearcher.networking.models

import com.google.gson.annotations.SerializedName

object GiphyModel{
    data class Result (
        @SerializedName("data") val data : List<Data>,
        @SerializedName("pagination") val pagination : Pagination,
        @SerializedName("meta") val meta : Meta
    )

    data class Pagination (
        @SerializedName("total_count") val total_count : Int,
        @SerializedName("count") val count : Int,
        @SerializedName("offset") val offset : Int
    )

    data class Meta (
        @SerializedName("status") val status : Int,
        @SerializedName("msg") val msg : String,
        @SerializedName("response_id") val response_id : String
    )

    data class Data (
        @SerializedName("type") val type : String,
        @SerializedName("id") val id : String,
        @SerializedName("url") val url : String,
        @SerializedName("slug") val slug : String,
        @SerializedName("bitly_gif_url") val bitly_gif_url : String,
        @SerializedName("bitly_url") val bitly_url : String,
        @SerializedName("embed_url") val embed_url : String,
        @SerializedName("username") val username : String,
        @SerializedName("source") val source : String,
        @SerializedName("title") val title : String,
        @SerializedName("rating") val rating : String,
        @SerializedName("content_url") val content_url : String,
        @SerializedName("source_tld") val source_tld : String,
        @SerializedName("source_post_url") val source_post_url : String,
        @SerializedName("is_sticker") val is_sticker : Int,
        @SerializedName("import_datetime") val import_datetime : String,
        @SerializedName("trending_datetime") val trending_datetime : String,
        @SerializedName("images") val images : Images,
        @SerializedName("analytics") val analytics : Analytics
    )

    data class Images (
        @SerializedName("fixed_height_still") val fixed_height_still : FixedHeightStill,
        @SerializedName("original_still") val original_still : OriginalStill,
        @SerializedName("fixed_width") val fixed_width : FixedWidth,
        @SerializedName("fixed_height_small_still") val fixed_height_small_still : FixedHeightSmallStill,
        @SerializedName("fixed_height_downsampled") val fixed_height_downsampled : FixedHeightDownsampled,
        @SerializedName("preview") val preview : Preview,
        @SerializedName("fixed_height_small") val fixed_height_small : FixedHeightSmall,
        @SerializedName("downsized_still") val downsized_still : DownsizedStill,
        @SerializedName("downsized") val downsized : Downsized,
        @SerializedName("downsized_large") val downsized_large : DownsizedLarge,
        @SerializedName("fixed_width_small_still") val fixed_width_small_still : FixedWidthSmallStill,
        @SerializedName("preview_webp") val preview_webp : PreviewWebp,
        @SerializedName("fixed_width_still") val fixed_width_still : FixedWidthStill,
        @SerializedName("fixed_width_small") val fixed_width_small : FixedWidthSmall,
        @SerializedName("downsized_small") val downsized_small : DownsizedSmall,
        @SerializedName("fixed_width_downsampled") val fixed_width_downsampled : FixedWidthDownsampled,
        @SerializedName("downsized_medium") val downsized_medium : DownsizedMedium,
        @SerializedName("original") val original : Original,
        @SerializedName("fixed_height") val fixed_height : FixedHeight,
        @SerializedName("looping") val looping : Looping,
        @SerializedName("original_mp4") val original_mp4 : OriginalMp4,
        @SerializedName("preview_gif") val preview_gif : PreviewGif,
        @SerializedName("480w_still") val foureightyw_still : FoureightywStill
    )

    data class FixedHeightStill (
        @SerializedName("height") val height : Int,
        @SerializedName("url") val url : String,
        @SerializedName("width") val width : Int
    )

    data class OriginalStill (
        @SerializedName("height") val height : Int,
        @SerializedName("url") val url : String,
        @SerializedName("width") val width : Int
    )

    data class FixedWidth (
        @SerializedName("height") val height : Int,
        @SerializedName("mp4") val mp4 : String,
        @SerializedName("mp4_size") val mp4_size : Int,
        @SerializedName("size") val size : Int,
        @SerializedName("url") val url : String,
        @SerializedName("webp") val webp : String,
        @SerializedName("webp_size") val webp_size : Int,
        @SerializedName("width") val width : Int
    )

    data class FixedHeightSmallStill (
        @SerializedName("height") val height : Int,
        @SerializedName("url") val url : String,
        @SerializedName("width") val width : Int
    )

    data class FixedWidthDownsampled (
        @SerializedName("height") val height : Int,
        @SerializedName("size") val size : Int,
        @SerializedName("url") val url : String,
        @SerializedName("webp") val webp : String,
        @SerializedName("webp_size") val webp_size : Int,
        @SerializedName("width") val width : Int
    )

    data class FixedHeightDownsampled (
        @SerializedName("height") val height : Int,
        @SerializedName("size") val size : Int,
        @SerializedName("url") val url : String,
        @SerializedName("webp") val webp : String,
        @SerializedName("webp_size") val webp_size : Int,
        @SerializedName("width") val width : Int
    )

    data class Preview (
        @SerializedName("height") val height : Int,
        @SerializedName("mp4") val mp4 : String,
        @SerializedName("mp4_size") val mp4_size : Int,
        @SerializedName("width") val width : Int
    )

    data class FixedHeightSmall (
        @SerializedName("height") val height : Int,
        @SerializedName("mp4") val mp4 : String,
        @SerializedName("mp4_size") val mp4_size : Int,
        @SerializedName("size") val size : Int,
        @SerializedName("url") val url : String,
        @SerializedName("webp") val webp : String,
        @SerializedName("webp_size") val webp_size : Int,
        @SerializedName("width") val width : Int
    )

    data class DownsizedStill (
        @SerializedName("height") val height : Int,
        @SerializedName("url") val url : String,
        @SerializedName("width") val width : Int
    )

    data class Downsized (
        @SerializedName("height") val height : Int,
        @SerializedName("size") val size : Int,
        @SerializedName("url") val url : String,
        @SerializedName("width") val width : Int
    )

    data class DownsizedLarge (
        @SerializedName("height") val height : Int,
        @SerializedName("size") val size : Int,
        @SerializedName("url") val url : String,
        @SerializedName("width") val width : Int
    )

    data class FixedWidthSmallStill (
        @SerializedName("height") val height : Int,
        @SerializedName("url") val url : String,
        @SerializedName("width") val width : Int
    )

    data class PreviewWebp (
        @SerializedName("height") val height : Int,
        @SerializedName("size") val size : Int,
        @SerializedName("url") val url : String,
        @SerializedName("width") val width : Int
    )

    data class FixedWidthStill (
        @SerializedName("height") val height : Int,
        @SerializedName("url") val url : String,
        @SerializedName("width") val width : Int
    )

    data class FixedWidthSmall (
        @SerializedName("height") val height : Int,
        @SerializedName("mp4") val mp4 : String,
        @SerializedName("mp4_size") val mp4_size : Int,
        @SerializedName("size") val size : Int,
        @SerializedName("url") val url : String,
        @SerializedName("webp") val webp : String,
        @SerializedName("webp_size") val webp_size : Int,
        @SerializedName("width") val width : Int
    )

    data class DownsizedSmall (
        @SerializedName("height") val height : Int,
        @SerializedName("mp4") val mp4 : String,
        @SerializedName("mp4_size") val mp4_size : Int,
        @SerializedName("width") val width : Int
    )

    data class DownsizedMedium (
        @SerializedName("height") val height : Int,
        @SerializedName("size") val size : Int,
        @SerializedName("url") val url : String,
        @SerializedName("width") val width : Int
    )

    data class Original (
        @SerializedName("frames") val frames : Int,
        @SerializedName("height") val height : Int,
        @SerializedName("mp4") val mp4 : String,
        @SerializedName("mp4_size") val mp4_size : Int,
        @SerializedName("size") val size : Int,
        @SerializedName("url") val url : String,
        @SerializedName("webp") val webp : String,
        @SerializedName("webp_size") val webp_size : Int,
        @SerializedName("width") val width : Int
    )

    data class FixedHeight (
        @SerializedName("height") val height : Int,
        @SerializedName("mp4") val mp4 : String,
        @SerializedName("mp4_size") val mp4_size : Int,
        @SerializedName("size") val size : Int,
        @SerializedName("url") val url : String,
        @SerializedName("webp") val webp : String,
        @SerializedName("webp_size") val webp_size : Int,
        @SerializedName("width") val width : Int
    )

    data class Looping (
        @SerializedName("mp4") val mp4 : String,
        @SerializedName("mp4_size") val mp4_size : Int
    )

    data class OriginalMp4 (
        @SerializedName("height") val height : Int,
        @SerializedName("mp4") val mp4 : String,
        @SerializedName("mp4_size") val mp4_size : Int,
        @SerializedName("width") val width : Int
    )

    data class PreviewGif (
        @SerializedName("height") val height : Int,
        @SerializedName("size") val size : Int,
        @SerializedName("url") val url : String,
        @SerializedName("width") val width : Int
    )

    data class FoureightywStill (
        @SerializedName("url") val url : String,
        @SerializedName("width") val width : Int,
        @SerializedName("height") val height : Int
    )

    data class Analytics(
        @SerializedName("onload") val onload: OnLoad,
        @SerializedName("onclick") val onclick: OnClick,
        @SerializedName("onsent") val onsent: OnSent
    )

    data class OnLoad (
        @SerializedName("url") val url : String
    )

    data class OnClick (
        @SerializedName("url") val url : String
    )

    data class OnSent (
        @SerializedName("url") val url : String
    )
}