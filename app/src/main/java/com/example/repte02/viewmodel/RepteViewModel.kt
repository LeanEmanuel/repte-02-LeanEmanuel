package com.example.repte02.viewmodel

import android.media.Image
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RepteViewModel() : ViewModel() {
    private val _currentImage = MutableLiveData<Int>(null)
    val currentImage: MutableLiveData<Int> = _currentImage

    private val _nombre = MutableLiveData<String>("")
    val nombre: MutableLiveData<String> = _nombre


    fun seleccionarImage(imageRes: Int) {
        _currentImage.value = imageRes
    }

    fun setNombre(nombre: String) {
        _nombre.value = nombre
    }
}