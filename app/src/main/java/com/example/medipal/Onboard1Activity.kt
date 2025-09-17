package com.example.medipal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Onboard1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_onboarding_1) // your XML filename

        // Find buttons
        val btnNext = findViewById<Button>(R.id.btnNext)
        val btnSkip = findViewById<Button>(R.id.btnSkip)

        // Handle Next button click → go to Onboard2Activity
        btnNext.setOnClickListener {
            val intent = Intent(this, Onboard2Activity::class.java)
            startActivity(intent)
        }

        // Handle Skip button click → go to ActivityOnboard
        btnSkip.setOnClickListener {
            val intent = Intent(this, GetStartedActivity::class.java)
            startActivity(intent)
            finish()  // optional: close this activity so user can’t go back
        }
    }
}
