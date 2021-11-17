package com.example.a77777

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThreeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)
        val button3 = findViewById<Button>(R.id.button3)

        button3.setOnClickListener {
            startActivity(Intent(this,FourActivity::class.java))
        }

        val button8 = findViewById<Button>(R.id.button8)

        button8.setOnClickListener {
            startActivity(Intent(this, FiveActivity::class.java))
        }
    }
}