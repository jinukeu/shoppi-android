package com.kunize.shoppi_android.repository.home

import com.kunize.shoppi_android.model.HomeData
import com.kunize.shoppi_android.repository.home.HomeAssetDataSource

class HomeRepository(
    private val assetDataSource: HomeAssetDataSource
) {
    fun getHomeData(): HomeData? {
        return assetDataSource.getHomeData()
    }
}