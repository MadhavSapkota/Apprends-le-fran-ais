package com.example.learnfrench.activity.levelcheck.mvp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity

import android.graphics.Color
import android.text.TextPaint

import android.graphics.LinearGradient
import android.graphics.Shader

import com.example.learnfrench.databinding.ActivitySplashBinding
import com.example.learnfrench.databinding.LevelcheckLayoutBinding


class LevelCheckView(private val appCompatActivity: AppCompatActivity) {
    var binding: LevelcheckLayoutBinding? = null

    fun start(binding_splash: LevelcheckLayoutBinding) {
        binding = binding_splash
//        getGetStartedTextTransition()
    }

}