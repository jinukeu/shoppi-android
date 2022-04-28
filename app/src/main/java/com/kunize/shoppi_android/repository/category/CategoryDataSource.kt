package com.kunize.shoppi_android.repository.category

import com.kunize.shoppi_android.model.Category

interface CategoryDataSource {
    suspend fun getCategories(): List<Category>
}