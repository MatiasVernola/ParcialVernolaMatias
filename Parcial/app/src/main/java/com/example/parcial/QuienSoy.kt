package com.example.parcial

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
//import android.app.ActionBar
//import android.support.v7.app.ActionBar
import kotlinx.android.synthetic.main.activity_quien_soy.*

class QuienSoy : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quien_soy)

        btnSalir2.setOnClickListener{
            val intent: Intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }


    }
}
