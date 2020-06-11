package com.example.parcial

import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_registro_exitoso.*
import android.os.Bundle
import android.content.Intent



class RegistroExitoso : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_exitoso)

        val objetoIntent: Intent= intent //creo un objeto del tipo intent
        var Gmail = objetoIntent.getStringExtra("Gmail") //creo la variable Gmail para obtener con el metodo get.String lo que me envían desde el activty registrarse
        textView3.text = "¡Bienvenido $Gmail !"
        //Muestro en pantalla el saludo con la variable Gmail. Para que me diga "Bienvenido Jose" por ejemplo


        btnJugar2.setOnClickListener {
            val intent: Intent = Intent(this, Jugar::class.java)
            startActivity(intent)
            finish()
        }


        btnContador.setOnClickListener {
            val intent: Intent = Intent(this, Contador::class.java)
            startActivity(intent)
            finish()
        }

    }

}
