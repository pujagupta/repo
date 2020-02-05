package com.example.my22application.myapplication1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        displayDetailText()
    }

    private fun displayDetailText() {
        val animalName = intent.getStringExtra("Animal")
        display_text.text = animalName + " is selected."
    }
}
