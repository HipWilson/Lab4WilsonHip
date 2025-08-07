package com.example.lab4WilsonHip

data class Mascota(
    val nombre: String,
    val raza: String,
    val imagenResId: Int
)

val mascotas = listOf(
    Mascota("Luna", "Golden Retriever", R.drawable.perro1),
    Mascota("Milo", "Pastor Aleman", R.drawable.perro2),
    Mascota("Kira", "Huskie", R.drawable.perro3),
    Mascota("Toby", "basenji", R.drawable.perro4),
    Mascota("Max", "Terrier", R.drawable.perro5)
)
