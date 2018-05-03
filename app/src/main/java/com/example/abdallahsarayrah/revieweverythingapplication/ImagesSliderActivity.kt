package com.example.abdallahsarayrah.revieweverythingapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_images_slider.*
import android.view.Gravity
import android.view.Menu
import android.view.MenuItem


class ImagesSliderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_images_slider)


        var toast = Toast.makeText(this, "Image One", Toast.LENGTH_SHORT)
        toast.show()
        toast.setGravity(Gravity.CENTER, 0, -650)
        var indexImage = 1

        buttonNext.setOnClickListener {
            when (indexImage) {
                1 -> {
                    imageViewSlider.setImageResource(R.drawable.n1)
                    var toast = Toast.makeText(this, "Image One", Toast.LENGTH_SHORT)
                    toast.show()
                    toast.setGravity(Gravity.CENTER, 0, -650)
                    indexImage = 2
                }
                2 -> {
                    imageViewSlider.setImageResource(R.drawable.n2)
                    var toast = Toast.makeText(this, "Image Two", Toast.LENGTH_SHORT)
                    toast.show()
                    toast.setGravity(Gravity.CENTER, 0, -650)
                    indexImage = 3
                }
                3 -> {
                    imageViewSlider.setImageResource(R.drawable.n3)
                    var toast = Toast.makeText(this, "Image Three", Toast.LENGTH_SHORT)
                    toast.show()
                    toast.setGravity(Gravity.CENTER, 0, -650)
                    indexImage = 1
                }
            }
        }

        buttonPrevious.setOnClickListener {
            when (indexImage) {
                3 -> {
                    imageViewSlider.setImageResource(R.drawable.n3)
                    var toast = Toast.makeText(this, "Image Three", Toast.LENGTH_SHORT)
                    toast.show()
                    toast.setGravity(Gravity.CENTER, 0, -650)
                    indexImage = 2
                }
                2 -> {
                    imageViewSlider.setImageResource(R.drawable.n2)
                    var toast = Toast.makeText(this, "Image Two", Toast.LENGTH_SHORT)
                    toast.show()
                    toast.setGravity(Gravity.CENTER, 0, -650)
                    indexImage = 1
                }
                1 -> {
                    imageViewSlider.setImageResource(R.drawable.n1)
                    var toast = Toast.makeText(this, "Image One", Toast.LENGTH_SHORT)
                    toast.show()
                    toast.setGravity(Gravity.CENTER, 0, -650)
                    indexImage = 3
                }
            }
        }
    }

    //the code bellow to insert the menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.mainActivity -> {
                var intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }

        return super.onOptionsItemSelected(item)
    }
}
