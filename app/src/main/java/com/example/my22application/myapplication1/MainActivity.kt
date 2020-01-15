package com.example.my22application.myapplication1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Context
import android.content.Intent

class MainActivity : AppCompatActivity() {

    val animals: ArrayList<String> = ArrayList()
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

    fun addItems() {
        animals.add("dog")
        animals.add("cat")
        animals.add("owl")
        animals.add("cheetah")
        animals.add("raccoon")
        animals.add("bird")
        animals.add("snake")
        animals.add("lizard")
        animals.add("hamster")
        animals.add("bear")
    }

    fun goToDetailPage(name: String){
        val intent = Intent(this@MainActivity,DetailActivity::class.java);
        intent.putExtra("Animal", name)
        startActivity(intent);
    }
}
