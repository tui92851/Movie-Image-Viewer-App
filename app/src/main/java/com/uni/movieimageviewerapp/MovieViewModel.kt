package com.uni.movieimageviewerapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MovieViewModel : ViewModel() {
    private val movieData: MutableLiveData<MovieModel> by lazy {
        MutableLiveData<MovieModel>()
    }

    fun getMovie(): LiveData<MovieModel> {
        return movieData
    }

    fun setMovie(movie:MovieModel) {
        movieData.value = movie
    }


}