package com.example.a77777

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SevenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seven)

        val button9 = findViewById<Button>(R.id.button9)

        button9.setOnClickListener {
            startActivity(Intent(this, EightActivity::class.java))
        }
    }
}