package com.example.firstcreateproject


import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Link the XML layout to this activity

        // Get references to UI elements
        val greetingText = findViewById<TextView>(R.id.greetingText)
        val actionButton = findViewById<Button>(R.id.actionButton)

        // Set a click listener on the button
        actionButton.setOnClickListener {
            greetingText.text = "Button Clicked!"
        }
    }
}
