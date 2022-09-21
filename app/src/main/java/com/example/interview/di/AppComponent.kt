package com.example.interview.di

import android.content.Context
import com.example.interview.MainActivity
import com.example.interview.di.modules.ApiModule
import com.example.interview.di.modules.AppModule
import com.example.interview.ui.detail.DetailFragment
import com.example.interview.ui.home.HomeFragment
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, ApiModule::class])
interface AppComponent {

    // Factory to create instances of the AppComponent
    @Component.Factory
    interface Factory {
        // With @BindsInstance, the Context passed in will be available in the graph
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun inject(activity: MainActivity)
    fun inject(fragment: HomeFragment)
    fun inject(fragment: DetailFragment)

}