package com.example.learnfrench.activity.splashscreen.mvp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity

import android.graphics.Color
import android.text.TextPaint

import android.graphics.LinearGradient
import android.graphics.Shader

import androidx.core.content.ContextCompat
import androidx.core.graphics.alpha
import com.example.learnfrench.databinding.ActivitySplashBinding


class SplashView(private val appCompatActivity: AppCompatActivity) {
    var binding: ActivitySplashBinding? = null

    fun start(binding_splash: ActivitySplashBinding) {
        binding = binding_splash
        getGetStartedTextTransition()
    }

    @SuppressLint("ResourceType")
    private fun getGetStartedTextTransition() {
        binding!!.tvGetStarted.setText("Get Started")
        val paint: TextPaint =  binding!!.tvGetStarted.getPaint()
        val width = paint.measureText("Get Started")
        val textShader: Shader = LinearGradient(
            0F, 0F, width,  binding!!.tvGetStarted.getTextSize(), intArrayOf(
                Color.parseColor("#F97C3C"),
                Color.parseColor("#FDB54E"),
                Color.parseColor("#64B678"),
                Color.parseColor("#478AEA"),
                Color.parseColor("#8446CC")
            ), null, Shader.TileMode.CLAMP
        )
        binding!!.tvGetStarted.setTextColor( Color.parseColor("#F97C3C"))
        binding!!.tvGetStarted.getPaint().setShader(textShader)
        paint.alpha = 255
    }


}