package com.example.learnfrench.activity.levelcheck.mvp
import androidx.appcompat.app.AppCompatActivity
import com.example.learnfrench.activity.startcheck.StartCheckActivity


class LevelCheckModel(
    private val appCompatActivity: AppCompatActivity) {

    fun getDashboardView() {
        StartCheckActivity.start(appCompatActivity)
        appCompatActivity.finish()
    }


    fun getSplashAd(){
//        SplashAdsActivity.start(appCompatActivity,1)
//        appCompatActivity.finish()
    }




}

