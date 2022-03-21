package com.kunize.shoppi_android.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kunize.shoppi_android.model.Banner
import com.kunize.shoppi_android.model.Title
import com.kunize.shoppi_android.repository.HomeRepository

class HomeViewModel(private val homeRespository: HomeRepository) : ViewModel() {

    private val _title = MutableLiveData<Title>()
    val title: LiveData<Title> = _title

    private val _topBanners = MutableLiveData<List<Banner>>()
    val topBanners: LiveData<List<Banner>> = _topBanners

    init {
        loadHomeData()
    }

    private fun loadHomeData() {
        val homeData = homeRespository.getHomeData()
        homeData?.let { homeData ->  
            _title.value = homeData.title
            _topBanners.value = homeData.topBanners
        }
    }
}