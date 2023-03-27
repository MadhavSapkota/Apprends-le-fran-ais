package com.example.learnfrench.fragment.dashboard.di
import androidx.appcompat.app.AppCompatActivity
import com.example.learnfrench.app.AppActivity
import com.example.learnfrench.fragment.dashboard.mvp.DashboardModel
import com.example.learnfrench.fragment.dashboard.mvp.DashboardPresenter
import com.example.learnfrench.fragment.dashboard.mvp.DashboardView
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
        DashboardView: DashboardView,
        DashboardModel: DashboardModel
    ): DashboardPresenter {
        return DashboardPresenter(DashboardView, DashboardModel)
    }
}
