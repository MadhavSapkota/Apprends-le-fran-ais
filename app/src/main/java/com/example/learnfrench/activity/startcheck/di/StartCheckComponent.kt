package com.example.learnfrench.activity.startcheck.di
import com.example.learnfrench.activity.startcheck.StartCheckActivity
import com.example.learnfrench.app.AppActivity
import com.example.learnfrench.app.AppComponent
import dagger.Component

@AppActivity
@Component(modules=[(StartCheckModule::class)], dependencies=[(AppComponent::class)])
interface StartCheckComponent {
    abstract fun inject(startCheckActivity: StartCheckActivity)
}