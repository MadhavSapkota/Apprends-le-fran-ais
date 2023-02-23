package com.learn.grammarenglish.app
import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides


@AppScope
@Module
open class AppModule(application: Application) {
    private val context: Context=application.applicationContext

    @Provides
    @AppScope
    fun context(): Context {
        return context
    }
}