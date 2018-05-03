package com.example.abdallahsarayrah.revieweverythingapplication

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_alert_dialog.*
import kotlinx.android.synthetic.main.activity_radio_button.*

class AlertDialogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog)

        buttonChangeColor.setOnClickListener {
            var alertDialog = AlertDialog.Builder(this).create()

            alertDialog.setTitle("Change Color")
            alertDialog.setMessage("Do you want to change the background color?")
            alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Yes", { dialog: DialogInterface?, which: Int -> mainChangeColor.setBackgroundColor(Color.parseColor("#FF8E16AD")) })
            alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "No", { dialog: DialogInterface?, which: Int -> alertDialog.dismiss() })

            alertDialog.show()
        }
    }
}
