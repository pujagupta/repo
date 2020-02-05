package com.example.my22application.myapplication1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.adapter_recyclerview.view.*

class AnimalAdapter(val items : ArrayList<String>, val context: Context) : RecyclerView.Adapter<ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvAnimalType.text = items.get(position)
        holder.bind(items.get(position));
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.adapter_recyclerview, parent, false), context)
    }

    // Gets the number of animals in the list
    override fun getItemCount(): Int {
        return items.size
    }
}

class ViewHolder (itemView: View, val context: Context) : RecyclerView.ViewHolder(itemView) {
    // Holds the TextView that will add each animal to
    val tvAnimalType = itemView.tv_animal_type
    fun bind(itemClickced: String) {
        itemView.setOnClickListener(View.OnClickListener {
            (context as MainActivity).goToDetailPage(itemClickced)

        })
    }
}
