package com.kunize.shoppi_android.repository.home

import com.kunize.shoppi_android.model.HomeData

interface HomeDataSource {
    fun getHomeData(): HomeData?
}