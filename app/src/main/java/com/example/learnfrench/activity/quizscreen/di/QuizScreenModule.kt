package com.example.learnfrench.activity.quizscreen.di
import androidx.appcompat.app.AppCompatActivity
import com.example.learnfrench.activity.quizscreen.mvp.QuizScreenModel
import com.example.learnfrench.activity.quizscreen.mvp.QuizScreenPresenter
import com.example.learnfrench.activity.quizscreen.mvp.QuizScreenView
import com.example.learnfrench.activity.startcheck.mvp.StartCheckView
import com.example.learnfrench.app.AppActivity
import dagger.Module
import dagger.Provides

@Module
class QuizScreenModule(private val appCompatActivity: AppCompatActivity) {
    @AppActivity
    @Provides
    fun getSplashView(): QuizScreenView {
        return QuizScreenView(appCompatActivity)
    }

    @Provides
    fun getSplashModel(): QuizScreenModel {
        return QuizScreenModel(appCompatActivity)
    }

    @Provides
    fun getSplashPresenter(
        quizScreenModel: QuizScreenModel
    ): QuizScreenPresenter {
        return QuizScreenPresenter(quizScreenModel)
    }
}