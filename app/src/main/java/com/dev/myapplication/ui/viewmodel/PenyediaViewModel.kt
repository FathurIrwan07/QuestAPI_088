package com.dev.myapplication.ui.viewmodel

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.dev.myapplication.MahasiswaApplications

object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer { HomeViewModel(aplikasiKontak().container.MahasiswaRepository) }
        initializer { InsertViewModel(aplikasiKontak().container.MahasiswaRepository) }
        initializer { DetailViewModel(createSavedStateHandle(),aplikasiKontak().container.MahasiswaRepository) }
        initializer { UpdateViewModel(createSavedStateHandle(),aplikasiKontak().container.MahasiswaRepository) }
    }
}

fun CreationExtras.aplikasiKontak(): MahasiswaApplications =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as MahasiswaApplications)