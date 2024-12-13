package com.example.repte02.viewmodel

import android.media.Image
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.repte02.R

class RepteViewModel() : ViewModel() {
    private val _currentImage = MutableLiveData<Image>()
    val currentImage: MutableLiveData<Image> = _currentImage

    private val _nombre = MutableLiveData<String>()
    val nombre: MutableLiveData<String> = _nombre




    fun seleccionarImage(){

    }

    fun nombre(){

    }



}