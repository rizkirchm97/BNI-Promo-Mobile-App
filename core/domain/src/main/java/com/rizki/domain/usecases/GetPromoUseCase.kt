package com.rizki.domain.usecases

import com.rizki.domain.entities.PromoDetailEntity
import com.rizki.domain.repositories.BniPromoRepository
import com.rizkir.common.Resource
import kotlinx.coroutines.flow.Flow

class GetPromoUseCase(val bniPromoRepository: BniPromoRepository) {

    suspend operator fun invoke(): Flow<Resource<List<PromoDetailEntity>>> {
        return bniPromoRepository.getBniPromo()
    }


}
