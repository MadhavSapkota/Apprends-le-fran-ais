package com.example.learnfrench.activity.dashboard.mvp
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.learnfrench.R
import com.example.learnfrench.databinding.MaindashboardActivityBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.example.learnfrench.activity.dashboard.mvp.DashboardView.getNavigationView.tab
import com.example.learnfrench.fragment.dashboard.DashboardFragment


class DashboardView(
    val appCompatActivity: AppCompatActivity
) {
    var binding: MaindashboardActivityBinding? = null
    var actionBarDrawerToggle: ActionBarDrawerToggle? = null



    fun start(binding_dashboard: MaindashboardActivityBinding) {
        binding = binding_dashboard
        getNavigationListner()
        tab = binding!!.bottomNavigation
        loadFragment(DashboardFragment())
    }




    fun getTabPosition(): Boolean {
        when {
            tab!!.selectedItemId == R.id.navigation_home -> return true
            else -> return false
        }
    }

    fun gotoHome() {
        tab!!.selectedItemId = R.id.navigation_home
    }

    /*This {@loadFragment} functionality is to load the fragment with the transcations operations. */
    fun loadFragment(fragment: Fragment) {
        val transaction = appCompatActivity.supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container_view_dashboard, fragment)
        transaction.commit()
    }

   private fun getNavigationListner() {
        binding!!.bottomNavigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {

                R.id.navigation_home -> {
                    loadFragment(DashboardFragment())
                    return@setOnNavigationItemSelectedListener true
                }

//                R.id.navigation_bottomnavigation -> {
//                    showChangeLanguageBottomSheetDialog()
//                    return@setOnNavigationItemSelectedListener true
//                }
//                R.id.navigation_favourite -> {
//                    FavActivity.start(appCompatActivity)
//                    return@setOnNavigationItemSelectedListener true
//                }


            }
            false
        }
    }


    object getNavigationView {
        var tab: BottomNavigationView? = null
    }

}




