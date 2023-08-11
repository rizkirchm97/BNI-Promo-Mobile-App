package com.rizki.domain.usecases

import com.rizki.domain.entities.PromoDetailEntity
import com.rizki.domain.repositories.BniPromoRepository
import com.rizkir.common.Resource
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.extension.Extensions
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.jupiter.MockitoExtension

/**
 * created by RIZKI RACHMANUDIN on 10/08/2023
 */

@Extensions(
    value = [
        ExtendWith(MockitoExtension::class)
    ]
)
class GetPromoUseCaseTest {

    @Mock
    lateinit var bniPromoRepository: BniPromoRepository

    private lateinit var getPromoUseCase: GetPromoUseCase

    @BeforeEach
    fun beforeEach() {
        getPromoUseCase = GetPromoUseCase(bniPromoRepository)
    }



    @Test
    @DisplayName("Should Get Success From repository")
    fun getPromoSuccess() = runTest {

        val expected = listOf<PromoDetailEntity>(
            PromoDetailEntity(
                7,
                "dqd",
                "321",
                "421",
                "141",
                "fdsfds",
                "vdsfs",
                "1412",
                "fafa",
                "1.0",
                "1.0",
                "1",
                "4314",
                "ffa a",
                5
            ),
            PromoDetailEntity(
                8,
                "dw",
                "4324",
                "143",
                "532",
                "fcqwwe",
                "grega",
                "cqrq",
                "rwqcrqtq",
                "1.0",
                "1.0",
                "gewg",
                "4234325",
                "rrqwrqw",
                9
            )
        )


        // Arrange
        val repo = bniPromoRepository.getBniPromo()
        Mockito.`when`(repo).thenReturn(flowOf(Resource.Success(expected)))

        // Act
        val actual = getPromoUseCase.invoke()

        // Assert
        assertEquals(Resource.Success(expected).data, actual.first().data)
        Mockito.verify(bniPromoRepository, Mockito.times(1)).getBniPromo()

    }

    @Test
    @DisplayName("Should Get Empty From repository")
    fun getPromoIsEmpty() = runTest {

        val expected = listOf<PromoDetailEntity>()

        // Arrange
        val repo = bniPromoRepository.getBniPromo()
        Mockito.`when`(repo).thenReturn(flowOf(Resource.Success(emptyList())))


        // Act
        val actual = getPromoUseCase.invoke()

        // Assert
        assertEquals(Resource.Success(expected).data, actual.first().data)
        Mockito.verify(bniPromoRepository, Mockito.times(1)).getBniPromo()

    }

    @Test
    @DisplayName("Should Get Error From repository")
    fun testGetPromoError() = runTest {

        val expected = "Error"

        // Arrange
        val repo = bniPromoRepository.getBniPromo()
        Mockito.`when`(repo).thenReturn(flowOf(Resource.Error(message = expected)))

        // Act
        val actual = getPromoUseCase.invoke()

        // Assert
        assertEquals(Resource.Error(message = expected, data = null).message, actual.first().message)
        Mockito.verify(bniPromoRepository, Mockito.times(1)).getBniPromo()

    }


}