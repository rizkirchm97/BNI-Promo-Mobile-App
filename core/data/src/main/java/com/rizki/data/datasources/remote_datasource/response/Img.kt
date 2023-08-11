package com.rizki.data.datasources.remote_datasource.response

import com.squareup.moshi.Json

/**
 * created by RIZKI RACHMANUDIN on 11/08/2023
 */
data class Img(

    @field:Json (name="ext")
    val ext: String? = null,

    @field:Json (name="formats")
    val formats: Formats? = null,

    @field:Json (name="previewUrl")
    val previewUrl: Any? = null,

    @field:Json (name="mime")
    val mime: String? = null,

    @field:Json (name="caption")
    val caption: String? = null,

    @field:Json (name="created_at")
    val createdAt: String? = null,

    @field:Json (name="url")
    val url: String? = null,

    @field:Json (name="size")
    val size: Any? = null,

    @field:Json (name="updated_at")
    val updatedAt: String? = null,

    @field:Json (name="provider")
    val provider: String? = null,

    @field:Json (name="name")
    val name: String? = null,

    @field:Json (name="width")
    val width: Int? = null,

    @field:Json (name="provider_metadata")
    val providerMetadata: Any? = null,

    @field:Json (name="id")
    val id: Int? = null,

    @field:Json (name="alternativeText")
    val alternativeText: String? = null,

    @field:Json (name="hash")
    val hash: String? = null,

    @field:Json (name="height")
    val height: Int? = null
)
