package com.example.learnfrench.activity.startcheck.mvp
import androidx.appcompat.app.AppCompatActivity
import com.example.learnfrench.databinding.StartTestlayoutBinding


class StartCheckView(private val appCompatActivity: AppCompatActivity) {
    var binding: StartTestlayoutBinding? = null

    fun start(binding_splash: StartTestlayoutBinding) {
        binding = binding_splash
    }
}