package com.example.medipal

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Delay for 2 seconds then go to Onboarding
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, Onboard1Activity::class.java))
            finish()
        }, 3000)
    }
}