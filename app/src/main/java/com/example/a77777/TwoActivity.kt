package com.example.a77777

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TwoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        val button2 = findViewById<Button>(R.id.button2)

        button2.setOnClickListener {
            startActivity(Intent(this, ThreeActivity::class.java))
        }

        val button4 = findViewById<Button>(R.id.button4)

        button4.setOnClickListener {
            startActivity(Intent(this, FourActivity::class.java))
        }
    }
}