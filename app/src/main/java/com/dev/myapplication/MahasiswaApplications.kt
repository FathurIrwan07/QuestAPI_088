package com.dev.myapplication

import android.app.Application
import com.dev.myapplication.container.AppContainer
import com.dev.myapplication.container.MahasiswaContainer

class MahasiswaApplications:Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = MahasiswaContainer()
    }
}