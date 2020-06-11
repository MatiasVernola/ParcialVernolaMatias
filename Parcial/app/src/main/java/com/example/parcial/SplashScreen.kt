package com.example.parcial

import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_splash_screen.*
import android.os.Bundle
import android.content.Intent

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        btnAvanzar.setOnClickListener{
            val intent: Intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }



        
    }
}
