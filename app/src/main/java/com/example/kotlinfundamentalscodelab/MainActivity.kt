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
        resultText.text = getString(R.string.default_roll_text)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice(resultText) }

        val countUpButton: Button = findViewById(R.id.count_up)
        countUpButton.setOnClickListener { countUp(resultText) }

    }

    private fun rollDice(resultText: TextView) {
        val randomInt = Random().nextInt(6) + 1
        resultText.text = randomInt.toString()
    }

    private fun countUp(resultText: TextView) {
        when (resultText.text.toString()) {
            getString(R.string.default_roll_text) -> resultText.text = "1"
            else -> {
                val currentRoll = resultText.text.toString().toInt()
                if (currentRoll < 6) {
                    val upCount: Int = currentRoll + 1
                    resultText.text = upCount.toString()
                }
            }
        }
    }
}
