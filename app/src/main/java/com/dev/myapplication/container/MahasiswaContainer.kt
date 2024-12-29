package com.dev.myapplication.container

import com.dev.myapplication.repository.MahasiswaRepository
import com.dev.myapplication.repository.NetworkMahasiswaRepository
import com.dev.myapplication.service.MahasiswaService
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit

interface AppContainer{
    val mahasiswaRepository: MahasiswaRepository
}

