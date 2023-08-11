package com.rizki.data.datasources.remote_datasource

import com.rizki.data.datasources.remote_datasource.response.Response
import com.rizki.data.datasources.remote_datasource.response.ResponseItem
import com.rizki.domain.entities.PromoDetailEntity
import com.rizkir.common.Resource
import kotlinx.coroutines.flow.Flow

/**
 * created by RIZKI RACHMANUDIN on 11/08/2023
 */
interface BniRemoteDataSource {
    fun getBniPromo(): Flow<Resource<List<ResponseItem>>>
}