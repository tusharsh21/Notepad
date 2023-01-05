package com.example.depressure

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import kotlinx.coroutines.delay

class SplashScrenn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screnn)

        supportActionBar?.hide()

         Handler(Looper.getMainLooper()).postDelayed(Runnable {
            //code here will run after 2000 mili seconds
            startActivity(Intent(this, MainActivity::class.java))
        }, 2000)


    }
}