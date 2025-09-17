package com.example.medipal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Onboard3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_onboarding_3)

        val btnNext = findViewById<Button>(R.id.btnNext1)

        btnNext.setOnClickListener {
            startActivity(Intent(this, GetStartedActivity::class.java))
            finish()
        }
    }
}
