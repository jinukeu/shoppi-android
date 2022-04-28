package com.kunize.shoppi_android.repository.category

import com.kunize.shoppi_android.model.Category
import com.kunize.shoppi_android.repository.category.CategoryRemoteDataSource

class CategoryRepository(
    private val remoteDataSource: CategoryRemoteDataSource
) {
    suspend fun getCategories(): List<Category> {
        return remoteDataSource.getCategories()
    }
}