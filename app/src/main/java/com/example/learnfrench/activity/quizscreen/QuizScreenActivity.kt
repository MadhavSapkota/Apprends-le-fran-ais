package com.example.learnfrench.activity.quizscreen
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.learnfrench.activity.quizscreen.di.DaggerQuizScreenComponent
import com.example.learnfrench.activity.quizscreen.di.QuizScreenModule
import com.example.learnfrench.app.AppApplication
import com.example.learnfrench.activity.quizscreen.mvp.QuizScreenPresenter
import com.example.learnfrench.activity.quizscreen.mvp.QuizScreenView
import com.example.learnfrench.databinding.QuizLayoutBinding


import javax.inject.Inject

class QuizScreenActivity : AppCompatActivity() {

    @Inject
    lateinit var quizCheckView: QuizScreenView

    @Inject
    lateinit var quizScreenPresenter: QuizScreenPresenter

    private lateinit var binding: QuizLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mvpKotlinApplication= AppApplication()
        DaggerQuizScreenComponent.builder()
            .appComponent(mvpKotlinApplication.get(this).appComponent)
            .quizScreenModule(QuizScreenModule(this))
            .build()
            .inject(this)
        binding=QuizLayoutBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)
        quizCheckView.start(binding)
        quizScreenPresenter.onCreateView()
    }
    //Splash Activity is started.
    companion object {
        fun start(context: Context) {
            context.startActivity(Intent(context, QuizScreenActivity::class.java))
        }
    }
}
