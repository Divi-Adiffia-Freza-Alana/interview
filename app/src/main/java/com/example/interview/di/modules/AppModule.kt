package com.example.interview.di.modules

import android.app.Application
import android.content.Context
import dagger.Binds
import dagger.Module

// Needed for the Application Context

@Module
abstract class AppModule {

    @Binds
    abstract fun bindContext(application: Application): Context

}