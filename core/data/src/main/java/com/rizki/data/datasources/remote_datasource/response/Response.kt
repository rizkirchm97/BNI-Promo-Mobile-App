package com.rizki.data.datasources.remote_datasource.response

import com.squareup.moshi.Json

data class Response(

	@field:Json(name="Response")
	val response: List<ResponseItem?>? = null
)