package com.udacity.shoestore.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe

class AppViewModel : ViewModel() {
    var shoesList: MutableList<Shoe> = arrayListOf<Shoe>()
    val shoeList = MutableLiveData<MutableList<Shoe>>()
    val name = MutableLiveData<String>()
    val size = MutableLiveData<String>()
    val company = MutableLiveData<String>()
    val desc = MutableLiveData<String>()

    fun addShoe() {
        val oneShoe = Shoe(name = name.value.toString(), size = size.value?.toDouble()?: 0.0 , company = company.value.toString(), description = desc.value.toString(), arrayListOf<String>())
        shoesList.add(oneShoe)
        shoeList.postValue(shoesList)
    }
}