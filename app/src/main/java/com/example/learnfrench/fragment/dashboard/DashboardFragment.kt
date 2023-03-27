package com.example.learnfrench.fragment.dashboard
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.learnfrench.fragment.dashboard.di.DaggerDashboardComponent
import com.example.learnfrench.app.AppApplication
import com.example.learnfrench.databinding.DashboardDataBinding
import com.example.learnfrench.databinding.FragmentDashboardBinding
import com.example.learnfrench.fragment.dashboard.di.DashboardModule
import com.example.learnfrench.fragment.dashboard.mvp.DashboardPresenter
import com.example.learnfrench.fragment.dashboard.mvp.DashboardView
import kotlinx.android.synthetic.main.fragment_dashboard.*
import kotlinx.coroutines.*
import javax.inject.Inject


class DashboardFragment : Fragment() {
    @Inject
    lateinit var dashboardView: DashboardView
    @Inject
    lateinit var dashboardPresenter: DashboardPresenter
    lateinit var binding: DashboardDataBinding

    //the followung function is to intialize and inflate views
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val hrApplication = AppApplication()
        DaggerDashboardComponent.builder()
            .appComponent(hrApplication.get(requireActivity()).appComponent)
            .dashboardModule((activity as AppCompatActivity?)?.let { DashboardModule(it) })
            .build()
            .inject(this)

        binding = DashboardDataBinding.inflate(layoutInflater,container,false)
        val view = binding.root
        dashboardView.start(binding)
        dashboardPresenter.onCreate()
        return view
    }

    //this function is called to resume an activity
    override fun onResume() {
        super.onResume()
    }


    companion object {
        fun start(): DashboardFragment {
            val fragment = DashboardFragment()
            return fragment
        }
    }
}




