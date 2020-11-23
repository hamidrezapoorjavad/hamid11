package com.example.my11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGo.setOnClickListener {
           var random = getRandom()
            textRandom.text = random
            when(random) {
                "1" -> imgDice.setImageResource(R.drawable.dice_1)
                "2" -> imgDice.setImageResource(R.drawable.dice_2)
                "3" -> imgDice.setImageResource(R.drawable.dice_3)
                "4" -> imgDice.setImageResource(R.drawable.dice_4)
                "5" -> imgDice.setImageResource(R.drawable.dice_5)
                else -> imgDice.setImageResource(R.drawable.dice_6)


            }

        }

        }

    private fun getRandom(): String {
        val randomNumber = Random.nextInt(6)+1
        return randomNumber.toString()

    }


}
