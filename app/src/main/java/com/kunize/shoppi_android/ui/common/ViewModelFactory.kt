package com.kunize.shoppi_android.ui.common

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.kunize.shoppi_android.AssetLoader
import com.kunize.shoppi_android.network.ApiClient
import com.kunize.shoppi_android.repository.CategoryRemoteDataSource
import com.kunize.shoppi_android.repository.CategoryRepository
import com.kunize.shoppi_android.repository.HomeAssetDataSource
import com.kunize.shoppi_android.repository.HomeRepository
import com.kunize.shoppi_android.ui.category.CategoryViewModel
import com.kunize.shoppi_android.ui.home.HomeViewModel

class ViewModelFactory(private val context: Context): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(HomeViewModel::class.java) -> {
                val repository = HomeRepository(HomeAssetDataSource(AssetLoader(context)))
                HomeViewModel(repository) as T
            }
            modelClass.isAssignableFrom(CategoryViewModel::class.java) -> {
                val repositroy = CategoryRepository(CategoryRemoteDataSource(ApiClient.create()))
                CategoryViewModel(repositroy) as T
            }
            else -> {
                throw IllegalArgumentException("Fail to create ViewModel: ${modelClass.name}")
            }
        }
    }
}