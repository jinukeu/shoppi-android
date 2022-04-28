package com.kunize.shoppi_android.repository.home

import com.google.gson.Gson
import com.kunize.shoppi_android.AssetLoader
import com.kunize.shoppi_android.model.HomeData

class HomeAssetDataSource(private val assetLoader: AssetLoader) : HomeDataSource {
    private val gson = Gson()

    override fun getHomeData(): HomeData? {
        return assetLoader.getJsonString("home.json")?.let { homeJsonString ->
            gson.fromJson(homeJsonString, HomeData::class.java)
        }
    }
}