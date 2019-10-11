/*
Copyright (c) 2019 Kotlin Data Classes Generated from JSON powered by http://www.json2kotlin.com

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

For support, please feel free to contact me at https://www.linkedin.com/in/syedabsar */
package com.themtgdeckgenius.gipysearcher.networking.objects

import com.google.gson.annotations.SerializedName

object GiphyModel{
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
        @SerializedName("downsized_still") val downsized_still : Downsized_still,
        @SerializedName("downsized") val downsized : Downsized,
        @SerializedName("downsized_large") val downsized_large : Downsized_large,
        @SerializedName("fixed_width_small_still") val fixed_width_small_still : Fixed_width_small_still,
        @SerializedName("preview_webp") val preview_webp : Preview_webp,
        @SerializedName("fixed_width_still") val fixed_width_still : Fixed_width_still,
        @SerializedName("fixed_width_small") val fixed_width_small : Fixed_width_small,
        @SerializedName("downsized_small") val downsized_small : Downsized_small,
        @SerializedName("fixed_width_downsampled") val fixed_width_downsampled : FixedWidthDownsampled,
        @SerializedName("downsized_medium") val downsized_medium : Downsized_medium,
        @SerializedName("original") val original : Original,
        @SerializedName("fixed_height") val fixed_height : Fixed_height,
        @SerializedName("looping") val looping : Looping,
        @SerializedName("original_mp4") val original_mp4 : Original_mp4,
        @SerializedName("preview_gif") val preview_gif : Preview_gif,
        @SerializedName("480w_still") val foureightyw_still : Foureightyw_still
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

    data class Analytics(
        @SerializedName("onload") val onload: Onload,
        @SerializedName("onclick") val onclick: Onclick,
        @SerializedName("onsent") val onsent: Onsent
    )
}