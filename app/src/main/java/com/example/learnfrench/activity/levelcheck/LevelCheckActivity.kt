package com.example.learnfrench.activity.levelcheck
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.learnfrench.activity.levelcheck.di.DaggerLevelCheckComponent
import com.example.learnfrench.app.AppApplication
import com.example.learnfrench.activity.levelcheck.di.LevelCheckModule
import com.example.learnfrench.activity.levelcheck.mvp.LevelCheckPresenter
import com.example.learnfrench.activity.levelcheck.mvp.LevelCheckView
import com.example.learnfrench.databinding.LevelcheckLayoutBinding


import javax.inject.Inject

class LevelCheckActivity : AppCompatActivity() {

    @Inject
    lateinit var levelCheckView: LevelCheckView

    @Inject
    lateinit var levelCheckPresenter: LevelCheckPresenter

    private lateinit var binding: LevelcheckLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mvpKotlinApplication= AppApplication()
        DaggerLevelCheckComponent.builder()
            .appComponent(mvpKotlinApplication.get(this).appComponent)
            .levelCheckModule(LevelCheckModule(this))
            .build()
            .inject(this)
        binding=LevelcheckLayoutBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)
        levelCheckView.start(binding)
        levelCheckPresenter.onCreateView()
    }
    //Splash Activity is started.
    companion object {
        fun start(context: Context) {
            context.startActivity(Intent(context, LevelCheckActivity::class.java))
        }
    }
}
