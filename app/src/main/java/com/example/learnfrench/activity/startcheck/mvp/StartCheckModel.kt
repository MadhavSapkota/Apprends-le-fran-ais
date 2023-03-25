package com.example.learnfrench.activity.startcheck.mvp
import androidx.appcompat.app.AppCompatActivity
import com.example.learnfrench.activity.quizscreen.QuizScreenActivity

class StartCheckModel(
    private val appCompatActivity: AppCompatActivity) {

    fun getDashboardView() {
        QuizScreenActivity.start(appCompatActivity)
        appCompatActivity.finish()
    }




}