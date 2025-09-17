package com.example.medipal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Onboard2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_onboarding_2)  // make sure this is correct XML

        val btnNext = findViewById<Button>(R.id.btnNext1)
        val btnSkip = findViewById<Button>(R.id.btnSkip1) // ✅ must exist in XML

        btnNext.setOnClickListener {
            startActivity(Intent(this, Onboard3Activity::class.java))
        }

        btnSkip.setOnClickListener {
            startActivity(Intent(this, GetStartedActivity::class.java))
            finish() // optional: close this activity so user can’t go back
        }
    }
}
