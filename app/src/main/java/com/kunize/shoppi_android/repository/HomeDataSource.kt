package com.kunize.shoppi_android.repository

import com.kunize.shoppi_android.model.HomeData

interface HomeDataSource {
    fun getHomeData(): HomeData?
}