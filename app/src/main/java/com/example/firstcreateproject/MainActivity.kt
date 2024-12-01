package com.example.firstcreateproject


import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.*


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
        val valueOne = findViewById<TextView>(R.id.valueOne)
        val valueTwo = findViewById<TextView>(R.id.valueTwo)
        val result = findViewById<TextView>(R.id.result)

        // References to Button
        val sumButton = findViewById<Button>(R.id.sumButton)

        // Set up sum button to perform addition
        sumButton.setOnClickListener {
            //Convert values from TextViews to integers

            val num1 = valueOne.text.toString().toInt()
            val num2 = valueTwo.text.toString().toInt()

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
        increButton.setOnClickListener {
            var num1 = valueIncrement.text.toString().toInt()
            var num2 = valueIncrementTwo.text.toString().toInt()


            // Post Increment : num1++
            // Post Decrement : num2--
            val onePlus = ++num1
            val oneMinus = --num2

            resultIncrement.text = "${onePlus * oneMinus}"
        }


        // Reference to EditText and TextView
        val inputNameField = findViewById<EditText>(R.id.inputNameField)
        val inputDOBField = findViewById<EditText>(R.id.inputDOBField)
        val showDobButton = findViewById<Button>(R.id.DOBButton)
        val yourAge = findViewById<TextView>(R.id.yourAge)


        showDobButton.setOnClickListener {
            val inputName = inputNameField.text.toString()
            val inputDOBString = inputDOBField.text.toString()


            if (inputDOBString.isNotEmpty() && inputDOBString.toIntOrNull() != null) {
                val inputDOB = inputDOBString.toInt()
                val currentYear = getCurrentYear()


                yourAge.text = "$inputName's approximate age is ${currentYear - inputDOB}"
            } else {
                // Show an error if DOB is invalid
                yourAge.text = "Please enter a valid year of birth"
            }
        }


        val ratingInput = findViewById<TextView>(R.id.ratingInput)

        val ratingRes = findViewById<TextView>(R.id.ratingRes)

        val showRating = findViewById<Button>(R.id.showRating)

        showRating.setOnClickListener {
            val ratingInputText = ratingInput.text.toString()
            val ratingValue = ratingInputText.toIntOrNull()

            if (ratingValue != null) {
                rating(ratingValue, ratingRes)
            } else {
                ratingRes.text = "Please enter a valid rating (1-5)"
                ratingRes.setTextColor(Color.RED)
            }
        }


    }

    private fun getCurrentYear(): Int {
        val calendar = Calendar.getInstance()
        return calendar.get(Calendar.YEAR)
    }


    private fun rating(rating: Int, textView: TextView) {
        when (rating) {
            1 -> {
                textView.text = "BAD! Rating = $rating stars"
                textView.setTextColor(Color.CYAN)
            }

            2 -> {
                textView.text = "NOT GOOD! Rating = $rating stars"
                textView.setTextColor(Color.GREEN)
            }

            3 -> {
                textView.text = "OKAY! Rating = $rating stars"
                textView.setTextColor(Color.MAGENTA)
            }

            4 -> {
                textView.text = "GOOD! Rating = $rating stars"
                textView.setTextColor(Color.BLUE)
            }

            5 -> {
                textView.text = "AMAZING! Rating = $rating stars"
                textView.setTextColor(Color.DKGRAY)
            }

            else -> {
                textView.text = "Invalid Rating = $rating stars"
                textView.setTextColor(Color.RED)
            }
        }
    }
}
