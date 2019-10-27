package com.example.kotlinfundamentalscodelab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val resultText: TextView = findViewById(R.id.result_text)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice(resultText) }
        resultText.text = getString(R.string.default_roll_text)

    }

    private fun rollDice(resultText: TextView) {
        val randomInt = Random().nextInt(6) + 1
        resultText.text = randomInt.toString()

        Toast.makeText(
            this, "button clicked",
            Toast.LENGTH_SHORT
        ).show()
    }
}
