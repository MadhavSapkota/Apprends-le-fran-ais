package com.example.learnfrench.app
import android.app.Application
import android.content.Context
import androidx.fragment.app.FragmentActivity
import androidx.multidex.MultiDex
import com.example.learnfrench.app.AppApplication.body.appcontext


class AppApplication : Application() {
    lateinit var appComponent: AppComponent
    private var instance: AppApplication? = null
    object body {
        var appcontext: AppApplication? = null
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        appcontext=this
        appComponent= DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build()
    }

    fun get(activity: FragmentActivity): AppApplication {
        return activity.application as AppApplication
    }

    fun appComponent(): AppComponent? {
        return appComponent
    }

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

    companion object {
        fun getContext(): Context? {
            return appcontext!!
        }
    }
}



