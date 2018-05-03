package com.example.abdallahsarayrah.revieweverythingapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_list_view.*

class ListViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        var array = ArrayList<String>()
        array.add("Kotlin")
        array.add("Java")
        array.add("C#")

        var adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, array)

        listView.adapter = adapter
        listView.setOnItemClickListener { parent: AdapterView<*>?, view: View?, position: Int, id: Long -> Toast.makeText(this, array[position], Toast.LENGTH_SHORT).show() }
        listView.setOnItemLongClickListener { parent: AdapterView<*>?, view: View?, position: Int, id: Long ->
            var alertDialog = AlertDialog.Builder(this).create()
            alertDialog.setTitle("Delete")
            alertDialog.setMessage("Do you wnat do delete it?")
            alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Yes", { dialog, which ->
                adapter.remove(array[position])
            })
            alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "No", { dialog, which -> alertDialog.dismiss() })
            alertDialog.show()

            true
        }
    }
}
