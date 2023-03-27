//The following function is for Presenter Activity which consumes data and get references from View
package com.example.learnfrench.fragment.dashboard.mvp
import android.os.Build
import androidx.annotation.RequiresApi
import io.reactivex.disposables.CompositeDisposable

class DashboardPresenter(
    private val dashboardView: DashboardView,
    private val dashboardModel: DashboardModel
) {

    @RequiresApi(Build.VERSION_CODES.O)
    fun onCreate() {
    }

}