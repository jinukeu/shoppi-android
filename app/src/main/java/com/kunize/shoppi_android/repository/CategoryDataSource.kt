package com.kunize.shoppi_android.repository

import com.kunize.shoppi_android.model.Category

interface CategoryDataSource {
    suspend fun getCategories(): List<Category>
}