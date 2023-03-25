package com.example.learnfrench.activity.startcheck.di
import androidx.appcompat.app.AppCompatActivity
import com.example.learnfrench.activity.startcheck.mvp.StartCheckModel
import com.example.learnfrench.activity.startcheck.mvp.StartCheckPresenter
import com.example.learnfrench.activity.startcheck.mvp.StartCheckView
import com.example.learnfrench.app.AppActivity
import dagger.Module
import dagger.Provides

@Module
class StartCheckModule(private val appCompatActivity: AppCompatActivity) {

    @AppActivity
    @Provides
    fun getSplashView(): StartCheckView {
        return StartCheckView(appCompatActivity)
    }

    @Provides
    fun getSplashModel(): StartCheckModel {
        return StartCheckModel(appCompatActivity)
    }

    @Provides
    fun getSplashPresenter(
        startCheckModel: StartCheckModel
    ): StartCheckPresenter {
        return StartCheckPresenter(startCheckModel)
    }
}