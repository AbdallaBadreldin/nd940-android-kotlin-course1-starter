package com.udacity.shoestore.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe

class AppViewModel : ViewModel() {
    var shoesList: MutableList<Shoe> = arrayListOf<Shoe>()
    val shoeList = MutableLiveData<MutableList<Shoe>>()
    val emptyShoe=Shoe("", 0.0, "", "", arrayListOf())
    val oneShoe =MutableLiveData<Shoe>(emptyShoe)
    fun addShoe() {
       shoesList.add(oneShoe.value?: emptyShoe)
        shoeList.postValue(shoesList)
    }
}