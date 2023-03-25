package com.example.learnfrench.activity.startcheck.mvp
import com.example.learnfrench.activity.startcheck.mvp.StartCheckModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class StartCheckPresenter(
    private val startCheckModel: StartCheckModel
) {
    fun onCreateView() {
        loadDelay()
    }

   /*This functionality {@loadDelay} loads the login screen activity after 3 seconds.*/
   private fun loadDelay() {
       CoroutineScope(Dispatchers.Main).launch {
           delay(3000)
           startCheckModel.getDashboardView()
       }
   }

}