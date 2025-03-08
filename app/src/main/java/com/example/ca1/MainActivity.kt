package com.example.ca1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonOne = findViewById<Button>(R.id.button_yoga)
        val buttonTwo = findViewById<Button>(R.id.button_aero)
        val buttonThree = findViewById<Button>(R.id.button_zumba)

        buttonOne.setOnClickListener {
            Toast.makeText(this, "Button Yoga clicked", Toast.LENGTH_SHORT).show()
            intent = Intent(this, YogaActivity::class.java)
            startActivity(intent)
        }

        buttonTwo.setOnClickListener {
            Toast.makeText(this, "Button Aerobics clicked", Toast.LENGTH_SHORT).show()
            intent = Intent(this, AerobicsActivity::class.java)
            startActivity(intent)
        }

        buttonThree.setOnClickListener {
            Toast.makeText(this, "Button Zumba clicked", Toast.LENGTH_SHORT).show()
            intent = Intent(this, ZumbaActivity::class.java)
            startActivity(intent)

        }
    }
}