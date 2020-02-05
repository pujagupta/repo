package com.example.my22application.myapplication1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Context
import android.content.Intent
import android.content.res.Resources
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    //var animals: ArrayList<String> = ArrayList()
    var animals = ArrayList<String>()
    private lateinit var context: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        context = this
        recycler_view.layoutManager = LinearLayoutManager(this)
        addItems()
        setAdapter()
    }

    private fun setAdapter() {
        recycler_view.adapter = AnimalAdapter(animals, this)
    }

    private fun addItems() {
        animals = ArrayList<String>(Arrays.asList(*resources.getStringArray(R.array.animal_list)))
    }

    fun goToDetailPage(name: String) {
        val intent = Intent(this@MainActivity, DetailActivity::class.java);
        intent.putExtra("Animal", name)
        startActivity(intent);
    }
}
