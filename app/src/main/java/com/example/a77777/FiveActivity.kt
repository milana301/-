package com.example.a77777

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FiveActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_five)

        val button6 = findViewById<Button>(R.id.button6)

        button6.setOnClickListener {
            startActivity(Intent(this, SevenActivity::class.java))
        }
    }
}