package com.rizki.data.mapper

import com.rizki.data.datasources.remote_datasource.response.ResponseItem
import com.rizki.domain.entities.PromoDetailEntity
import com.rizki.data.datasources.mapper.mapToEntity
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

/**
 * created by RIZKI RACHMANUDIN on 11/08/2023
 */

class MapToEntityTest {


    @Test
    @DisplayName("Should Success when data mapped to entity")
    fun testResponseItemToPromoDetailEntitySuccess() {
        val promoDetailEntity = PromoDetailEntity(
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

        val responseItem = ResponseItem(
            id = 8,
            title = "dw",
            desc = "rwqcrqtq",
            descPromo = "grega",
            lokasi = "rrqwrqw",
            namePromo = "fcqwwe",
            nama = "cqrq",
            alt = "gewg",
            latitude = "1.0",
            longitude = "1.0",
            count = 9,
            createdAt = "4234325",
            created_At = "143",
            updatedAt = "532",
            publishedAt = "4324",

            )


        assertEquals(responseItem.mapToEntity(), promoDetailEntity)
    }


    @Test
    @DisplayName("Should Error when data mapped to entity")
    fun testResponseItemToPromoDetailEntityError() {
        val promoDetailEntity = PromoDetailEntity(
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

        val responseItem = ResponseItem(
            id = 8,
            title = "dw",
            desc = "rwqcrqtq",
            descPromo = "grega",
            lokasi = "rrqwrqw",
            namePromo = "fcqwwe",
            nama = "cqrq",
            alt = "gewg",
            latitude = "1.0",
            longitude = "1.0",
            count = null,
            createdAt = "4234325",
            created_At = "143",
            updatedAt = "532",
            publishedAt = "4324",

            )

        assertNotEquals(responseItem.mapToEntity(), promoDetailEntity)
    }
}


