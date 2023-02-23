package com.example.learnfrench.app
import android.content.Context
import dagger.Component
import dagger.android.AndroidInjectionModule


@AppScope
@Component(modules=[AndroidInjectionModule::class, AppModule::class])
interface AppComponent {
    fun context(): Context
}
