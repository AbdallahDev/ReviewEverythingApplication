package com.example.abdallahsarayrah.revieweverythingapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_check_box.*

class CheckBoxActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box)

        buttonCheckBox.setOnClickListener {
            var array = ArrayList<String>()
            if (checkBox.isChecked) array.add(checkBox.text.toString())
            if (checkBox2.isChecked) array.add(checkBox2.text.toString())
            if (checkBox3.isChecked) array.add(checkBox3.text.toString())

            var string = ""
            for (x in array) string += x + "\n"

            textView.text = string
        }
    }
}
