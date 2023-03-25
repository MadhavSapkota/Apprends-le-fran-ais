package com.example.learnfrench.activity.quizscreen.di
import com.example.learnfrench.activity.quizscreen.QuizScreenActivity
import com.example.learnfrench.app.AppActivity
import com.example.learnfrench.app.AppComponent
import dagger.Component

@AppActivity
@Component(modules=[(QuizScreenModule::class)], dependencies=[(AppComponent::class)])
interface QuizScreenComponent {
    abstract fun inject(quizScreenActivity: QuizScreenActivity)
}