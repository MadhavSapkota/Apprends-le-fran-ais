package com.example.learnfrench.activity.splashscreen.mvp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashPresenter(
    private val splashModel: SplashModel
) {
    fun onCreateView() {
        loadDelay()
    }

   /*This functionality {@loadDelay} loads the login screen activity after 3 seconds.*/
   private fun loadDelay() {
       CoroutineScope(Dispatchers.Main).launch {
           delay(3000)
           splashModel.getLevelCheckView()
       }
   }

}