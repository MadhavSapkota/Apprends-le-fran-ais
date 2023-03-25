package com.example.learnfrench.activity.quizscreen.mvp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class QuizScreenPresenter(
    private val quizScreenModel: QuizScreenModel
) {
    fun onCreateView() {
        loadDelay()
    }

   /*This functionality {@loadDelay} loads the login screen activity after 3 seconds.*/
   private fun loadDelay() {
       CoroutineScope(Dispatchers.Main).launch {
           delay(3000)
           quizScreenModel.getDashboardView()
       }
   }

}