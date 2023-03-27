package com.example.learnfrench.activity.dashboard.di
import com.example.learnfrench.activity.dashboard.DashboardActivity
import com.example.learnfrench.app.AppActivity
import com.example.learnfrench.app.AppComponent
import dagger.Component

@AppActivity
@Component(modules=[(DashboardModule::class)], dependencies=[(AppComponent::class)])
interface DashboardComponent {
    abstract fun inject(dashboardActivity: DashboardActivity)
}