package com.learn.grammarenglish.app
import com.learn.grammarenglish.apputlis.UserInfo
import okhttp3.Interceptor
import okhttp3.Response
import java.io.IOException


class Inceptor : Interceptor {
    @Volatile
    private var host: String? = null
    internal var token: String? = null


    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request()



        when {
            UserInfo.loginStatus -> {
                request = request.newBuilder()
                    .header("Authorization", UserInfo.token)
                    .build()
            }
            else -> {
                request = request.newBuilder()

                    .build()
            }
        }


        val response = chain.proceed(request)
        if (response.code() == 402) {
            response.close()
            return response
        }
        return response
    }

}