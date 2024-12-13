package com.example.repte02.viewmodel

import android.media.Image
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RepteViewModel() : ViewModel() {
    private val _currentImage = MutableLiveData<Image>()
    val currentImage: MutableLiveData<Image> = _currentImage

    private val _nombre = MutableLiveData<String>()
    var nombre: MutableLiveData<String> = _nombre




    fun seleccionarImage(){

    }

    fun setNombre(){
        _nombre.value = nombre.toString()
    }



}