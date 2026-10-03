package pe.edu.cibertec.apprecyclerviewrest.retrofit.response

data class Personaje(
    val id: Int,
    val name: String,
    val species: String,
    val status: String,
    val gender: String,
    val image: String
)
