package com.sipis.movieapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

class MoviesApplication {
    @HiltAndroidApp
    class MoviesApplication : Application() {
        override fun onCreate() {
            super.onCreate()

            Timber.plant(Timber.DebugTree())
        }

    }
}