package pe.edu.cibertec.appfragmentsrestapi.retrofit.api

import pe.edu.cibertec.apprecyclerviewrest.retrofit.response.ResultPersonaje
import retrofit2.Call
import retrofit2.http.GET

interface IPersonajeService {
    //https://rickandmortyapi.com/api/character
    @GET("character")
    fun obtenerPersonajes() : Call<ResultPersonaje>

}