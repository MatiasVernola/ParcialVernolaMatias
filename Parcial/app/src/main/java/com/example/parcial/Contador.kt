package com.example.parcial

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_contador.*

class Contador : AppCompatActivity() {

    var contador=0

    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contador)

        val txtMuestroNumero: TextView =findViewById<TextView>(R.id.txtMuestroNumero) //nombre de la variable != tipo de la variable

        
        btnSumar.setOnClickListener { //Botón de sumar uno al contador
            this.contador = this.contador + 1
            this.txtMuestroNumero.text = contador.toString()
        }

        btnRestar.setOnClickListener { //Botón de restar uno al contador
            this.contador = this.contador - 1
            this.txtMuestroNumero.text = contador.toString()
        }

        btnVolver3.setOnClickListener{
                val intent:Intent= Intent(this,MainActivity::class.java)
                startActivity(intent)
                finish()
            }


    }
}
