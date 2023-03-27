package com.example.learnfrench.activity.dashboard.mvp
import androidx.appcompat.app.AppCompatActivity


class DashboardPresenter(
    private val dashboardView: DashboardView,
    private val dashboardModel: DashboardModel, private val appCompatActivity: AppCompatActivity
) {
    fun onCreateView() {
        onClick()
    }

    fun onClick(){}

}