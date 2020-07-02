package com.example.parcial

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_mayores_puntajes.*

class mayoresPuntajes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mayores_puntajes)


        val objetoIntent: Intent = intent //creo un objeto del tipo intent
        var Record1 = objetoIntent.getStringExtra("Record1") //creo la variable REcord1 para obtener con el metodo get.String lo que me envían desde el jugar
        TextView21.text = "Puesto N°1 : " + Record1
        //Muestro en pantalla el mayor puntaje con la variable Record1

        val objetoIntent2: Intent = intent //creo un objeto del tipo intent
        var Record2 = objetoIntent.getStringExtra("Record2") //creo la variable Record2 para obtener con el metodo get.String lo que me envían desde el jugar
        TextView22.text = "Puesto N°2 : " + Record2
        //Muestro en pantalla el mayor puntaje con la variable Record2

        btnSalir10.setOnClickListener{
            val intent: Intent = Intent(this, Jugar::class.java)
            startActivity(intent)
            finish()
        }
        //botón para volver a jugar

    }
}
