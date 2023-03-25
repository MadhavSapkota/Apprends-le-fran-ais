package com.example.learnfrench.activity.levelcheck.di
import androidx.appcompat.app.AppCompatActivity
import com.example.learnfrench.activity.levelcheck.mvp.LevelCheckModel
import com.example.learnfrench.activity.levelcheck.mvp.LevelCheckPresenter
import com.example.learnfrench.app.AppActivity
import com.example.learnfrench.activity.levelcheck.mvp.LevelCheckView
import dagger.Module
import dagger.Provides

@Module
class LevelCheckModule(private val appCompatActivity: AppCompatActivity) {

    @AppActivity
    @Provides
    fun getSplashView(): LevelCheckView {
        return LevelCheckView(appCompatActivity)
    }

    @Provides
    fun getLevelCheckModel(): LevelCheckModel {
        return LevelCheckModel(appCompatActivity)
    }

    @Provides
    fun getLevelCheckPresenter(
        levelCheckModel: LevelCheckModel
    ): LevelCheckPresenter {
        return LevelCheckPresenter(levelCheckModel)
    }
}