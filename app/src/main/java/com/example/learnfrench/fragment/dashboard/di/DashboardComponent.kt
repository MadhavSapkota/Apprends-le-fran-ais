package com.example.learnfrench.fragment.dashboard.di
import com.example.learnfrench.app.AppActivity
import com.example.learnfrench.app.AppComponent
import com.example.learnfrench.fragment.dashboard.DashboardFragment
import dagger.Component

@AppActivity
@Component(modules=[(DashboardModule::class)], dependencies = [(AppComponent::class)])
interface DashboardComponent {
    abstract fun inject(dashboardFragment: DashboardFragment)
}