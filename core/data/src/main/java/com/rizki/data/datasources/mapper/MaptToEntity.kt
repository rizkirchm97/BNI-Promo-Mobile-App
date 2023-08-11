package com.rizki.data.datasources.mapper

import com.rizki.data.datasources.remote_datasource.response.ResponseItem
import com.rizki.domain.entities.PromoDetailEntity

fun ResponseItem.mapToEntity(): PromoDetailEntity {
    return PromoDetailEntity(
        id = id,
        title = title,
        desc = desc,
        descPromo = descPromo,
        lokasi = lokasi,
        namePromo = namePromo,
        nama = nama,
        alt = alt,
        latitude = latitude,
        longitude = longitude,
        count = count,
        createdAt = createdAt,
        created_at = created_At,
        updated_at = updatedAt,
        published_at = publishedAt,
    )
}