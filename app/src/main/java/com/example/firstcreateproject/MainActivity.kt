package com.example.firstcreateproject


import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // XML layouts are linked to the corresponding activity or fragment using the
        // setContentView() method in Kotlin/Java.
        setContentView(R.layout.activity_main) // Link the XML layout to this activity

        // Get references to UI elements
        val helloWorldText = findViewById<TextView>(R.id.helloWorldText)
        val greetingText = findViewById<TextView>(R.id.greetingText)
        val actionButton = findViewById<Button>(R.id.actionButton)


        // Reference To TextViews
        val valueOne  = findViewById<TextView>(R.id.valueOne)
        val valueTwo = findViewById<TextView>(R.id.valueTwo)
        val result = findViewById<TextView>(R.id.result)

        // References to Button
        val sumButton = findViewById<Button>(R.id.sumButton)

        // Set up sum button to perform addition
        sumButton.setOnClickListener{
            //Convert values from TextViews to integers

            val num1  = valueOne.text.toString().toInt()
            val num2  = valueTwo.text.toString().toInt()

            // Perform addition
            val sum = num1 + num2

            result.text = "Sum: $sum"
        }


        // Set a click listener on the button
        actionButton.setOnClickListener {
            greetingText.text = "Button Clicked!"
        }


        val valueIncrement = findViewById<TextView>(R.id.valueIncrement)
        val valueIncrementTwo = findViewById<TextView>(R.id.valueIncrementTwo)
        val resultIncrement = findViewById<TextView>(R.id.resultIncrement)
        val increButton = findViewById<Button>(R.id.increButton)
        //increButton Listener
        increButton.setOnClickListener{
            var num1 =  valueIncrement.text.toString().toInt()
            var num2 =  valueIncrementTwo.text.toString().toInt()


            // Post Increment : num1++
            // Post Decrement : num2--
            val onePlus = ++num1
            val oneMinus =  --num2

            resultIncrement.text = "${onePlus * oneMinus}"
        }
    }
}
