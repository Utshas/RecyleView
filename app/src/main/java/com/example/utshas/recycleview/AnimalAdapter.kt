package com.example.utshas.recycleview

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.recyclerview_item_row.view.*

class AnimalAdapter(val items : ArrayList<String>,val types : ArrayList<String>, val context: Context) : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.recyclerview_item_row, parent, false)) //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvAnimal.text = items.get(position)
        if(position<4)
            holder.tvAnimalType.text = types.get(0)
        else if(position<10)
            holder.tvAnimalType.text = types.get(1)
        else if(position<17)
            holder.tvAnimalType.text = types.get(2)
        else
            holder.tvAnimalType.text = types.get(3)
//        for safe call (not null value)
//        holder?.tvAnimalType?.text = types.get(3)
        //To change body of created functions use File | Settings | File Templates.
    }

    // Gets the number of animals in the list
    override fun getItemCount(): Int {
        return items.size
    }
    // Inflates the item views
}

class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    // Holds the TextView that will add each animal to
    val tvAnimal = view.tv_animal
    val tvAnimalType = view.tv_animal_type
}