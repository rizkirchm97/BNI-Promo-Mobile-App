package com.rizki.data.datasources.remote_datasource.response

import com.squareup.moshi.Json

/**
 * created by RIZKI RACHMANUDIN on 11/08/2023
 */
data class Medium(

    @field:Json(name="ext")
    val ext: String? = null,

    @field:Json(name="path")
    val path: Any? = null,

    @field:Json(name="size")
    val size: Any? = null,

    @field:Json(name="mime")
    val mime: String? = null,

    @field:Json(name="name")
    val name: String? = null,

    @field:Json(name="width")
    val width: Int? = null,

    @field:Json(name="url")
    val url: String? = null,

    @field:Json(name="hash")
    val hash: String? = null,

    @field:Json(name="height")
    val height: Int? = null
)
