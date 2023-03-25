package com.example.learnfrench.activity.startcheck
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.learnfrench.activity.startcheck.di.DaggerStartCheckComponent
import com.example.learnfrench.app.AppApplication
import com.example.learnfrench.activity.startcheck.di.StartCheckModule
import com.example.learnfrench.activity.startcheck.mvp.StartCheckPresenter
import com.example.learnfrench.activity.startcheck.mvp.StartCheckView
import com.example.learnfrench.databinding.StartTestlayoutBinding


import javax.inject.Inject

class StartCheckActivity : AppCompatActivity() {

    @Inject
    lateinit var startCheckView: StartCheckView

    @Inject
    lateinit var startCheckPresenter: StartCheckPresenter

    private lateinit var binding: StartTestlayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mvpKotlinApplication= AppApplication()
        DaggerStartCheckComponent.builder()
            .appComponent(mvpKotlinApplication.get(this).appComponent)
            .startCheckModule(StartCheckModule(this))
            .build()
            .inject(this)
        binding=StartTestlayoutBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)
        startCheckView.start(binding)
        startCheckPresenter.onCreateView()
    }
    //Splash Activity is started.
    companion object {
        fun start(context: Context) {
            context.startActivity(Intent(context, StartCheckActivity::class.java))
        }
    }
}
