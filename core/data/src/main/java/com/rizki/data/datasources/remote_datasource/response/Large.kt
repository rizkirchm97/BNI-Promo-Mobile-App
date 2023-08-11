package com.rizki.data.datasources.remote_datasource.response

import com.squareup.moshi.Json

/**
 * created by RIZKI RACHMANUDIN on 11/08/2023
 */
data class Large(

    @Json(name="ext")
    val ext: String? = null,

    @Json(name="path")
    val path: Any? = null,

    @Json(name="size")
    val size: Any? = null,

    @Json(name="mime")
    val mime: String? = null,

    @Json(name="name")
    val name: String? = null,

    @Json(name="width")
    val width: Int? = null,

    @Json(name="url")
    val url: String? = null,

    @Json(name="hash")
    val hash: String? = null,

    @Json(name="height")
    val height: Int? = null
)
