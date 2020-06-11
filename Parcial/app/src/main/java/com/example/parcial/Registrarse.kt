package com.example.parcial

import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_registrarse.*
import android.os.Bundle
import android.content.Intent




class Registrarse : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrarse)

        btnConfirmar2.setOnClickListener{
            var Gmail:String = editText11.text.toString() //creo la variable gmail del tipo string para que lo que ingrese en el editText11 lo guarde ahí
            val intent: Intent = Intent(this,RegistroExitoso::class.java)
            intent.putExtra("Gmail" , Gmail) //le pongo un nombre a la variable gmail, diciendole que ahí se guarda el gmail
            startActivity(intent)
            finish()
        }

        btnSalir3.setOnClickListener{
            val intent: Intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
