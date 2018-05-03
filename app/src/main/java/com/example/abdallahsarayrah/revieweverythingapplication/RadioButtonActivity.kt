package com.example.abdallahsarayrah.revieweverythingapplication

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_radio_button.*

class RadioButtonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_button)

        radioButtonColor1.setOnClickListener { main.setBackgroundColor(Color.parseColor("#FF7A0505")) }
        radioButtonColor2.setOnClickListener { main.setBackgroundColor(Color.parseColor("#FF060C85")) }
        radioButtonColor3.setOnClickListener { main.setBackgroundColor(Color.parseColor("#FF065B0B")) }
    }
}
