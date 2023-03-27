package com.example.learnfrench.activity.dashboard.di
import androidx.appcompat.app.AppCompatActivity
import com.example.learnfrench.activity.dashboard.mvp.DashboardModel
import com.example.learnfrench.activity.dashboard.mvp.DashboardPresenter
import com.example.learnfrench.app.AppActivity
import com.example.learnfrench.activity.dashboard.mvp.DashboardView
import dagger.Module
import dagger.Provides

@Module
class DashboardModule(private val appCompatActivity: AppCompatActivity) {

    @AppActivity
    @Provides
    fun getDashboardView(): DashboardView {
        return DashboardView(appCompatActivity)
    }

    @Provides
    fun getDashboardModel(): DashboardModel {
        return DashboardModel(appCompatActivity)
    }

    @Provides
    fun getDashboardPresenter(
        dashboardView: DashboardView,
        dashboardModel: DashboardModel
    ): DashboardPresenter {
        return DashboardPresenter(dashboardView,dashboardModel,appCompatActivity)
    }
}