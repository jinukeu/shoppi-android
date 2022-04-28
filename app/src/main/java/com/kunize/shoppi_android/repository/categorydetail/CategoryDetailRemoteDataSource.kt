package com.kunize.shoppi_android.repository.categorydetail

import com.kunize.shoppi_android.model.CategoryDetail
import com.kunize.shoppi_android.network.ApiClient

class CategoryDetailRemoteDataSource(private val api: ApiClient): CategoryDetailDataSource {
    override suspend fun getCategoryDetail(): CategoryDetail {
        return api.getCategoryDetail()
    }
}