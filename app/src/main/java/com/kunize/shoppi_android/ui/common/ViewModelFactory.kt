package com.kunize.shoppi_android.ui.common

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.kunize.shoppi_android.AssetLoader
import com.kunize.shoppi_android.network.ApiClient
import com.kunize.shoppi_android.repository.category.CategoryRemoteDataSource
import com.kunize.shoppi_android.repository.category.CategoryRepository
import com.kunize.shoppi_android.repository.categorydetail.CategoryDetailRemoteDataSource
import com.kunize.shoppi_android.repository.categorydetail.CategoryDetailRepository
import com.kunize.shoppi_android.repository.home.HomeAssetDataSource
import com.kunize.shoppi_android.repository.home.HomeRepository
import com.kunize.shoppi_android.ui.category.CategoryViewModel
import com.kunize.shoppi_android.ui.categorydetail.CategoryDetailViewModel
import com.kunize.shoppi_android.ui.home.HomeViewModel

class ViewModelFactory(private val context: Context): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(HomeViewModel::class.java) -> {
                val repository = HomeRepository(HomeAssetDataSource(AssetLoader(context)))
                HomeViewModel(repository) as T
            }
            modelClass.isAssignableFrom(CategoryViewModel::class.java) -> {
                val repository = CategoryRepository(CategoryRemoteDataSource(ApiClient.create()))
                CategoryViewModel(repository) as T
            }
            modelClass.isAssignableFrom(CategoryDetailViewModel::class.java) -> {
                val repository = CategoryDetailRepository(CategoryDetailRemoteDataSource(ApiClient.create()))
                CategoryDetailViewModel(repository) as T
            }
            else -> {
                throw IllegalArgumentException("Fail to create ViewModel: ${modelClass.name}")
            }
        }
    }
}