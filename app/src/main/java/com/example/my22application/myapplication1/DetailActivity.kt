package com.example.my22application.myapplication1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        textView = findViewById(R.id.display_text) as TextView
        displayDetailText()
    }

    private fun displayDetailText() {
        val animalName = intent.getStringExtra("Animal")
        textView.text = animalName + " is selected."
    }
}
