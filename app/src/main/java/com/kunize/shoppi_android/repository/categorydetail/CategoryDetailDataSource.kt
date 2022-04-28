package com.kunize.shoppi_android.repository.categorydetail

import com.kunize.shoppi_android.model.CategoryDetail

interface CategoryDetailDataSource {
    suspend fun getCategoryDetail(): CategoryDetail
}