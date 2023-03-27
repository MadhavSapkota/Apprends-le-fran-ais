//This is View Class of Dashboard Activity
package com.example.learnfrench.fragment.dashboard.mvp
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.learnfrench.databinding.DashboardDataBinding
import com.example.learnfrench.databinding.FragmentDashboardBinding


class DashboardView(
    val appCompatActivity: AppCompatActivity,
) : FrameLayout(appCompatActivity) {
    private var binding: DashboardDataBinding?=null

    //this binds data with layout with data binding
    fun start(dashboardBinding: DashboardDataBinding) {
        binding=dashboardBinding
    }

}