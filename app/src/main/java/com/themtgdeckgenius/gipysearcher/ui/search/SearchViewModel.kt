package com.themtgdeckgenius.gipysearcher.ui.search

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.themtgdeckgenius.gipysearcher.networking.models.GiphyModel

class SearchViewModel : ViewModel() {

    private val _title = MutableLiveData<String>().apply {
        value = "Let's Look for it!"
    }

    private val _searchTerm = MutableLiveData<String>().apply {
        value = ""
    }

    private val _gifList = MutableLiveData<List<GiphyModel.Data>>().apply {
        value = null
    }

    val searchTerm: LiveData<String> = _searchTerm

    fun updateSearchTerm(result: String) {
        _searchTerm.value = result
        if (result.isNotEmpty()){
            updateTitle(result)
        } else{
            resetTitle()
        }
    }

    private fun updateTitle(result: String) {
        _title.value = "Searching: $result"
    }

    private fun resetTitle(){
        _title.value = "Let's Look for it!"
    }

    fun updateGifList(result: List<GiphyModel.Data>){
        _gifList.value = result
    }

    val title: LiveData<String> = _title

    val gifList: LiveData<List<GiphyModel.Data>> = _gifList
}