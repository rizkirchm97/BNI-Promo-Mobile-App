package com.rizki.data.datasources.remote_datasource.response

import com.squareup.moshi.Json

/**
 * created by RIZKI RACHMANUDIN on 11/08/2023
 */
data class Formats(

    @field:Json (name="small")
    val small: Small? = null,

    @field:Json (name="thumbnail")
    val thumbnail: Thumbnail? = null,

    @field:Json (name="medium")
    val medium: Medium? = null,

    @field:Json (name="large")
    val large: Large? = null
)
