package com.example.learnfrench.activity.splashscreen.mvp
import androidx.appcompat.app.AppCompatActivity
import com.example.learnfrench.activity.levelcheck.LevelCheckActivity


class SplashModel(
    private val appCompatActivity: AppCompatActivity) {

    fun getLevelCheckView() {
        LevelCheckActivity.start(appCompatActivity)
//        appCompatActivity.overridePendingTransition(0, 0)
        appCompatActivity.finish()
    }


    fun getSplashAd(){
//        SplashAdsActivity.start(appCompatActivity,1)
//        appCompatActivity.finish()
    }




}

