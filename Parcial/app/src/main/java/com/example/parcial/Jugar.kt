package com.example.parcial

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_jugar_juego.*
import android.widget.Toast.makeText as makeText1
import android.widget.TextView


class Jugar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val numeroSecreto = (Math.random() * 100).toInt() //Establezco el número secreto
        var contador = 0; //Establezco el contador de intentos en 0
        //TextView pista = new TextView(this); pista.setText(0)


        btnMostrarNumero.setOnClickListener {
             this.pista.text = numeroSecreto.toString()  // Si aprieta en el btnMostrarNumero revelo el número secreto en el TextView pista
        }

        btnSalir4.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        //botón para volver al main activity


         makeText1(this, "Tienes 10 intentos para adivinar el número Secreto ", Toast.LENGTH_LONG).show() //Le digo al jugador cuantos intenos tiene
        //contador = contador + 1;


        //textoFijo.text="Comenzando"
        BtnConfirmar
        BtnConfirmar.setOnClickListener {
            //botón para verificar el número
            if (NumeroIngresado.text.toString().toInt() > 100) //Compruebo que número ue ingresó el usuario sea menor a 100 para que sea válido,
            // en caso de que no lo sea le aviso de que no cuenta y sumo un intento al contador
            {
                makeText1(this, "Los valores mayores a 100 no son válidos ", Toast.LENGTH_LONG).show()
                contador += 1;
            }

            if (NumeroIngresado.toString().toInt() < 0) //Compruebo que el número que ingresó el usuario no sea negativo,
            //en caso de que lo sea le aviso y sumo un intento al contador
            {
                makeText1(this, "Los valores negativos no son válidos ", Toast.LENGTH_LONG).show()
                contador += 1;
            }



            if (numeroSecreto.toString() == NumeroIngresado.text.toString())
            {
                makeText1(this, "sos un genio adivinaste el número ", Toast.LENGTH_LONG).show()
                this.pista.text = ("Tu cantidad de intentos fue: ") ; contador.toString()
                var Record1: String = contador.toString() //creo la variable Record1 del tipo string para que lo que quede en contador lo guarde ahí
                val intent: Intent = Intent(this, mayoresPuntajes::class.java)
                intent.putExtra("Record1", Record1) //le pongo un nombre a la variable Record1, diciendole que ahí se guarda el mayor puntaje (1 intentos)
                startActivity(intent)
                finish()

                // agrego un if para ver si el contador quedó en menos de 5, si es así se lo paso a la pantalla "Records" para que lo muestre
                if (contador <= 5)
                    run {
                          var Record2: String = contador.toString() //creo la variable Record1 del tipo string para que lo que quede en contador lo guarde ahí
                          val intent: Intent = Intent(this, mayoresPuntajes::class.java)
                          intent.putExtra("Record2", Record2) //le pongo un nombre a la variable Record1, diciendole que ahí se guarda el gmail
                          startActivity(intent)
                          finish()
                         }
            } else
               {
                  if (numeroSecreto.toString() > NumeroIngresado.text.toString())
                   {
                       this.pista.text = ("El número que ingresaste es menor al número secreto ")
                    }
                      else
                        {
                           this.pista.text = ("El número que ingresaste es mayor al número secreto ")
                        }

                if (contador == 10) //le aviso al jugador que le queda un solo intento por si no adivinó el número antes
                 {
                    makeText1(this, "Llegaste a 10 intentos, El juego se reiniciará automáticamente cuando salgas de esta pantalla y vuelvas a entrargo ", Toast.LENGTH_LONG).show()
                     this.pista.text = ("Tu cantidad de intentos fue: ") ; contador.toString()
                     this.pista.text = numeroSecreto.toString()

                 }
               }
        }
    }
}
// debo comparar y mostrar un mensaje
// Toast.makeTex
