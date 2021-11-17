package com.example.a77777

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FourActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four)

        val button5 = findViewById<Button>(R.id.button5)

        button5.setOnClickListener {
            startActivity(Intent(this, ThreeActivity::class.java))
        }

        val button7 = findViewById<Button>(R.id.button7)

        button7.setOnClickListener {
            startActivity(Intent(this, FiveActivity::class.java))
        }

    }
}