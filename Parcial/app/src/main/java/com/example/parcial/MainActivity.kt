package com.example.parcial

import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import android.os.Bundle
import android.content.Intent


class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //esta línea no se para que es

        BtnRegistrarse.setOnClickListener{
            val intent:Intent= Intent(this,Registrarse::class.java)
                startActivity(intent)
                finish()

        }


        BtnSesion.setOnClickListener{
            val intent:Intent= Intent(this,Login::class.java)
            startActivity(intent)
            finish()
        }


        BtnJugar.setOnClickListener{
            val intent:Intent= Intent(this,Jugar::class.java)
            startActivity(intent)
            finish()
        }


        BtnContador.setOnClickListener{
            val intent:Intent= Intent(this,Contador::class.java)
            startActivity(intent)
            finish()
        }


        btnAcercaDeMi.setOnClickListener{
            val intent:Intent= Intent(this,QuienSoy::class.java)
            startActivity(intent)
            finish()
        }


        ;

        //btnVerificar.setOnClickListener
        //botón para verificar el número
    }
}
// debo comparar y mostrar un mensaje
// Toast.makeTex

