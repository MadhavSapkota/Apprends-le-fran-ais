package com.example.learnfrench.activity.quizscreen.mvp
import androidx.appcompat.app.AppCompatActivity
import com.example.learnfrench.databinding.QuizLayoutBinding

class QuizScreenView(private val appCompatActivity: AppCompatActivity) {
    var binding: QuizLayoutBinding? = null

    fun start(binding_splash: QuizLayoutBinding) {
        binding = binding_splash
    }
}