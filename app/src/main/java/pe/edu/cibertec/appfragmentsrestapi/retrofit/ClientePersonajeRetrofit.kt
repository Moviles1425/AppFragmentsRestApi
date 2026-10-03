package pe.edu.cibertec.appfragmentsrestapi.retrofit

import okhttp3.OkHttpClient
import pe.edu.cibertec.appfragmentsrestapi.retrofit.api.IPersonajeService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


object ClientePersonajeRetrofit {

    private var okHttpClient = OkHttpClient.Builder()
        .connectTimeout(1, TimeUnit.MINUTES)
        .readTimeout(30, TimeUnit.SECONDS)
        .writeTimeout(30, TimeUnit.SECONDS)
        .build()

    private fun buildRetrofit() = Retrofit
        .Builder()
        .baseUrl("https://rickandmortyapi.com/api/")
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val retrofitPersonajeService: IPersonajeService by lazy {
        buildRetrofit().create(IPersonajeService::class.java)
    }

}