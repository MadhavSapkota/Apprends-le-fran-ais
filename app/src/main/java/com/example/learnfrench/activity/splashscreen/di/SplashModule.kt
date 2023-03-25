package com.example.learnfrench.activity.splashscreen.di
import androidx.appcompat.app.AppCompatActivity
import com.example.learnfrench.app.AppActivity
import com.example.learnfrench.activity.splashscreen.mvp.SplashModel
import com.example.learnfrench.activity.splashscreen.mvp.SplashPresenter
import com.example.learnfrench.activity.splashscreen.mvp.SplashView
import dagger.Module
import dagger.Provides

@Module
class SplashModule(private val appCompatActivity: AppCompatActivity) {

    @AppActivity
    @Provides
    fun getSplashView(): SplashView {
        return SplashView(appCompatActivity)
    }

    @Provides
    fun getSplashModel(): SplashModel {
        return SplashModel(appCompatActivity)
    }

    @Provides
    fun getSplashPresenter(
        splashModel: SplashModel
    ): SplashPresenter {
        return SplashPresenter(splashModel)
    }
}