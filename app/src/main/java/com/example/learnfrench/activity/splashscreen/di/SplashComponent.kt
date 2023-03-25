package com.example.learnfrench.activity.splashscreen.di
import com.example.learnfrench.activity.splashscreen.SplashActivity
import com.example.learnfrench.app.AppActivity
import com.example.learnfrench.app.AppComponent
import dagger.Component

@AppActivity
@Component(modules=[(SplashModule::class)], dependencies=[(AppComponent::class)])
interface SplashComponent {
    abstract fun inject(splashActivity: SplashActivity)
}