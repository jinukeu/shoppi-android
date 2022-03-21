package com.kunize.shoppi_android.repository

import com.kunize.shoppi_android.model.Category
import com.kunize.shoppi_android.network.ApiClient

class CategoryRemoteDataSource(private val apiClient: ApiClient): CategoryDataSource {
    override suspend fun getCategories(): List<Category> {
        return apiClient.getCategories()
    }
}