package com.kunize.shoppi_android.repository.category

import com.kunize.shoppi_android.model.Category
import com.kunize.shoppi_android.network.ApiClient
import com.kunize.shoppi_android.repository.category.CategoryDataSource

class CategoryRemoteDataSource(private val apiClient: ApiClient): CategoryDataSource {
    override suspend fun getCategories(): List<Category> {
        return apiClient.getCategories()
    }
}