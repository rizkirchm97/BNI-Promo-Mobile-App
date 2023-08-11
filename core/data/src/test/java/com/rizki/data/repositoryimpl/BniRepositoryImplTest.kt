package com.rizki.data.repositoryimpl

import com.rizki.data.datasources.mapper.mapToEntity
import com.rizki.data.datasources.remote_datasource.BniRemoteDataSource
import com.rizki.data.datasources.remote_datasource.response.Img
import com.rizki.data.datasources.remote_datasource.response.ResponseItem
import com.rizkir.common.Resource
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
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
 * created by RIZKI RACHMANUDIN on 11/08/2023
 */

@Extensions(
    value = [
        ExtendWith(MockitoExtension::class)
    ]
)
class BniRepositoryImplTest {

    @Mock
    lateinit var remoteDataSource: BniRemoteDataSource

    private lateinit var bniRepositoryImpl: FakeBniRepositoryImpl

    @BeforeEach
    fun beforeEach() {
        bniRepositoryImpl = FakeBniRepositoryImpl(remoteDataSource)
    }


    @Test
    @DisplayName("Should Get Success From Remote Datasource and bring data")



    fun getBniPromoSuccess() = runTest {
        val expected = listOf<ResponseItem>(
            ResponseItem(
                Img(),
                "dqd",
                "321",
                1,
                "141",
                "fdsfds",
                "vdsfs",
                "1412",
                "fafa",
                "1.0",
                "1.0",
                1,
                "4314",
                "1",
                "1",
                "1",

            ),
            ResponseItem(
                Img(),
                "dqd",
                "321",
                2,
                "141",
                "fdsfds",
                "vdsfs",
                "1412",
                "fafa",
                "1.0",
                "1.0",
                2,
                "4314",
                "1",
                "1",
                "1",

                )
        )
        // Arrange
        Mockito.`when`(remoteDataSource.getBniPromo()).thenReturn(flowOf(Resource.Success(expected)))

        bniRepositoryImpl.getBniPromo().collect {


            assertInstanceOf(Resource.Success::class.java, it)
            assertEquals(Resource.Success(expected).data?.map { data -> data.mapToEntity() }, it.data)

        }

    }


}