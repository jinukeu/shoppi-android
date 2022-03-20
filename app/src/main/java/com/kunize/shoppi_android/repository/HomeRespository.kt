package com.kunize.shoppi_android.repository

import com.kunize.shoppi_android.model.HomeData

class HomeRespository(
    private val assetDataSource: HomeAssetDataSource
) {
    fun getHomeData(): HomeData? {
        return assetDataSource.getHomeData()
    }
}