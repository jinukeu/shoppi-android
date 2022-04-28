package com.kunize.shoppi_android.repository.categorydetail

import com.kunize.shoppi_android.model.CategoryDetail

class CategoryDetailRepository(
    private val remoteDataSource: CategoryDetailRemoteDataSource
) {
    suspend fun getCategoryDetail(): CategoryDetail {
        return remoteDataSource.getCategoryDetail()
    }
}