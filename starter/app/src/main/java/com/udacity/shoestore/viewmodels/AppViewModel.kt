package com.udacity.shoestore.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe

class AppViewModel: ViewModel(){

    val shoeList = MutableLiveData<MutableList<Shoe>>()

    fun addShoe(shoe: Shoe) {
      shoeList.value?.add(shoe)
    }
}