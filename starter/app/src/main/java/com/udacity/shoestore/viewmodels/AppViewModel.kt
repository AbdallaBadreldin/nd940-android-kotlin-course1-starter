package com.udacity.shoestore.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe

class AppViewModel: ViewModel(){
var shoesList:MutableList<Shoe> = arrayListOf<Shoe>()
    val shoeList = MutableLiveData<MutableList<Shoe>>()
    fun addShoe(shoe: Shoe) {
      shoesList.add(shoe)
        shoeList.postValue(shoesList)
    }
}