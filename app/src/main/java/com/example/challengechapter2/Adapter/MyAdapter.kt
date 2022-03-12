package com.example.challengechapter2.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.challengechapter2.R
import com.example.challengechapter2.Model.MyModel

class MyAdapter(private val list: List<MyModel>): RecyclerView.Adapter<MyAdapter.ViewHolder>(){
    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val imgGrid = itemView.findViewById<ImageView>(R.id.imageGrid)
        val titleGrid = itemView.findViewById<TextView>(R.id.titleGrid)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val contactView = inflater.inflate(R.layout.card_layout, parent, false)
        return ViewHolder(contactView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Get the data model based on position
        val message: MyModel = list[position]
        // Set item views based on your views and data model
        holder.imgGrid.setImageResource(message.image)
        holder.titleGrid.text = message.title
    }

    override fun getItemCount(): Int {
        return list.count()
    }
}