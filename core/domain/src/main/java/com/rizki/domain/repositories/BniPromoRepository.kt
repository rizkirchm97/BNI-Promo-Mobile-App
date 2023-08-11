package com.rizki.domain.repositories

import com.rizki.domain.entities.PromoDetailEntity
import com.rizkir.common.Resource
import kotlinx.coroutines.flow.Flow

interface BniPromoRepository {

    suspend fun getBniPromo(): Flow<Resource<List<PromoDetailEntity>>>


}
