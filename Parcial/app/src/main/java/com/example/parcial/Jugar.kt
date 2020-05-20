package com.example.parcial

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_jugar_juego.*
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Toast.makeText as makeText1

class Jugar : AppCompatActivity()
    {

       override fun onCreate(savedInstanceState: Bundle?) {
           val numeroSecreto = (Math.random() * 100).toInt() //Establezco el número secreto
           var contador = 0; //Establezco el contador de chances en 0

           super.onCreate(savedInstanceState)
           setContentView(R.layout.activity_main)

           //textoFijo.text="Comenzando"
           BtnConfirmar
           BtnConfirmar.setOnClickListener();
           //botón para verificar el número

           BtnSalir
           BtnSalir.setOnClickListener() //botón para salir y volver a la pantalla anterior
           makeText1(this, "El número secreto es: ", numeroSecreto.toString())


           // textoFijo.text=txtNombre.text
           lblAyuda.text = numeroSecreto.toString()
           makeText1(this, "Tienes 10 intentos para adivinar el número Secreto ", Toast.LENGTH_LONG).show() //Le digo al jugador cuantos intenos tiene
           contador = contador + 1;

           if (NumeroIngresado.text.String.toInt() > 100) //Compruebo que número ue ingresó el usuario sea menor a 100 para que sea válido,
           // en caso de que no lo sea le aviso de que no cuenta y sumo un intento al contador
           {
               makeText1(this, "Los valores mayores a 100 no son válidos ", Toast.LENGTH_LONG).show()
               contador = contador + 1;
           }

           if (NumeroIngresado.String.toInt() < 0) //Compruebo que el número que ingresó el usuario no sea negativo,
           //en caso de que lo sea le aviso y sumo un intento al contador
           {
               makeText1(this, "Los valores negativos no son válidos ", Toast.LENGTH_LONG).show()
               contador = contador + 1;
           }



           if (numeroSecreto.toString() == NumeroIngresado.text.toString())
            {
               makeText1(this, "sos un genio adivinaste el número ", Toast.LENGTH_LONG).show()
                Toast.makeText(this, "Tu cantidad de intentos fue ", Toast.LENTH_LONG, contador()).show()
           } else
            {
               if (numeroSecreto.toString() > NumeroIngresado.text.toString()) {
                   makeText1(this, "El número que ingresaste es menor al número secreto ", Toast.LENGTH_LONG).show()


               } else {
                   makeText1(this, "El número que ingresaste es menor al número secreto ", Toast.LENGTH_LONG).show()

               }

               if (contador == 9) //le aviso al jugador que le queda un solo intento por si no adivinó el número antes
               {
                   makeText1(this, "Te queda un sólo intento, no los desperdicies ", Toast.LENGTH_LONG).show()
               }
             }
       }
    }
// debo comparar y mostrar un mensaje
// Toast.makeTex
