package com.example.learnfrench.activity.levelcheck.di
import com.example.learnfrench.activity.levelcheck.LevelCheckActivity
import com.example.learnfrench.app.AppActivity
import com.example.learnfrench.app.AppComponent
import dagger.Component

@AppActivity
@Component(modules=[(LevelCheckModule::class)], dependencies=[(AppComponent::class)])
interface LevelCheckComponent {
    abstract fun inject(levelCheckActivity: LevelCheckActivity)
}