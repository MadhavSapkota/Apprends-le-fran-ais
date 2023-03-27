package com.example.learnfrench.activity.quizscreen.mvp
import androidx.appcompat.app.AppCompatActivity
import com.example.learnfrench.activity.dashboard.DashboardActivity
import com.example.learnfrench.activity.quizscreen.QuizScreenActivity

class QuizScreenModel(
    private val appCompatActivity: AppCompatActivity) {

    fun getDashboardView() {
        DashboardActivity.start(appCompatActivity)
        appCompatActivity.finish()
    }
}