package com.example.learnfrench.activity.dashboard
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.learnfrench.activity.dashboard.di.DaggerDashboardComponent
import com.example.learnfrench.activity.dashboard.di.DashboardModule
import com.example.learnfrench.activity.dashboard.mvp.DashboardPresenter
import com.example.learnfrench.app.AppApplication
import com.example.learnfrench.databinding.MaindashboardActivityBinding
import com.example.learnfrench.activity.dashboard.mvp.DashboardView
import javax.inject.Inject

class DashboardActivity : AppCompatActivity() {

    @Inject
    lateinit var dashboardView: DashboardView

    @Inject
    lateinit var dashboardPresenter: DashboardPresenter
    private val TAG = "MainActivity"
    private lateinit var binding: MaindashboardActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mvpKotlinApplication = AppApplication()
        DaggerDashboardComponent.builder()
            .appComponent(mvpKotlinApplication.get(this).appComponent)
            .dashboardModule(DashboardModule(this))
            .build()
            .inject(this)
        binding = MaindashboardActivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        dashboardView.start(binding)
        dashboardPresenter.onCreateView()

    }

    //Splash Activity is started.
    companion object {
        fun start(context: Context) {
            context.startActivity(Intent(context, DashboardActivity::class.java))
        }
    }

    public override fun onResume() {
        super.onResume()
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when {
            dashboardView.actionBarDrawerToggle?.onOptionsItemSelected(item)!!.equals(true) -> {
                true
            }
            else -> {
                super.onOptionsItemSelected(item)
            }
        }
        return false
    }
}




