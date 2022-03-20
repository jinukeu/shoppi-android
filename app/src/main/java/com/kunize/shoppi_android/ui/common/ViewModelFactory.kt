package com.kunize.shoppi_android.ui.common

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.kunize.shoppi_android.AssetLoader
import com.kunize.shoppi_android.repository.HomeAssetDataSource
import com.kunize.shoppi_android.repository.HomeRespository
import com.kunize.shoppi_android.ui.home.HomeViewModel

class ViewModelFactory(private val context: Context): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(HomeViewModel::class.java)) {
            val respository = HomeRespository(HomeAssetDataSource(AssetLoader(context)))
            return HomeViewModel(respository) as T
        } else {
            throw IllegalArgumentException("Fail to create ViewModel: ${modelClass.name}")
        }
    }
}