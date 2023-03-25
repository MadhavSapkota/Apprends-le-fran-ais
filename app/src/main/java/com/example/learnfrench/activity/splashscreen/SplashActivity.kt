package com.example.learnfrench.activity.splashscreen
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.learnfrench.activity.splashscreen.di.DaggerSplashComponent
import com.example.learnfrench.app.AppApplication
import com.example.learnfrench.activity.splashscreen.di.SplashModule
import com.example.learnfrench.activity.splashscreen.mvp.SplashPresenter
import com.example.learnfrench.activity.splashscreen.mvp.SplashView
import com.example.learnfrench.databinding.ActivitySplashBinding
import javax.inject.Inject

class SplashActivity : AppCompatActivity() {

    @Inject
    lateinit var splashView: SplashView

    @Inject
    lateinit var splashPresenter: SplashPresenter

    private lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mvpKotlinApplication= AppApplication()
        DaggerSplashComponent.builder()
            .appComponent(mvpKotlinApplication.get(this).appComponent)
            .splashModule(SplashModule(this))
            .build()
            .inject(this)
        binding=ActivitySplashBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)
        splashView.start(binding)
        splashPresenter.onCreateView()
    }
    //Splash Activity is started.
    companion object {
        fun start(context: Context) {
            context.startActivity(Intent(context, SplashActivity::class.java))
        }
    }
}
