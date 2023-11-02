package com.woodland.android

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import java.time.Year

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println(usuario+", "+direccion)
    }
    data class Usuario (val imagen:String = "", val nombre:String="", val apellido:String="",val email: String="", val direccion: String="", val FechaNacimiento:String ="")
    data class Direccion (val calle:String="",val cp:String = "", val ciudad:String="")

    var usuario:Usuario=Usuario("img","Jordi", "A", "a@a.a", "Repartidor", "10/05/1999")
    var direccion:Direccion=Direccion("Repartidor", "08023","Barcelona" )





}
