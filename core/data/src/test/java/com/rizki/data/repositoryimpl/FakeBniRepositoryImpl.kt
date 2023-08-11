package com.rizki.data.repositoryimpl

import com.rizki.data.datasources.mapper.mapToEntity
import com.rizki.data.datasources.remote_datasource.BniRemoteDataSource
import com.rizki.domain.entities.PromoDetailEntity
import com.rizki.domain.repositories.BniPromoRepository
import com.rizkir.common.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.count
import kotlinx.coroutines.flow.flatMap
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map

/**
 * created by RIZKI RACHMANUDIN on 11/08/2023
 */
class FakeBniRepositoryImpl(
    private val remoteDataSource: BniRemoteDataSource
): BniPromoRepository {

    override suspend fun getBniPromo(): Flow<Resource<List<PromoDetailEntity>>> = flow {

        emit(Resource.Loading())
        val resultData = remoteDataSource.getBniPromo()

        resultData
            .map { it.data?.map { data -> data.mapToEntity() } }
            .collect { resource ->
            emit(Resource.Success(resource))
            emit(Resource.Loading(false))
        }
    }

}