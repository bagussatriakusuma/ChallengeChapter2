package com.example.challengechapter2.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.challengechapter2.Model.GojekModel
import com.example.challengechapter2.Model.GridModel
import com.example.challengechapter2.R

class GridAdapter(private val list4: List<GridModel>): RecyclerView.Adapter<GridAdapter.ViewHolder>(){
    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val gridimage = itemView.findViewById<ImageView>(R.id.gridImage)
        val gridbg = itemView.findViewById<ImageView>(R.id.gridBackground)
        val gridtitle = itemView.findViewById<TextView>(R.id.gridText)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val contactView = inflater.inflate(R.layout.grid_layout, parent, false)
        return ViewHolder(contactView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Get the data model based on position
        val message4: GridModel = list4[position]
        // Set item views based on your views and data model
        holder.gridimage.setImageResource(message4.image2)
        holder.gridbg.setImageResource(message4.image3)
        holder.gridtitle.text = message4.title1
    }

    override fun getItemCount(): Int {
        return list4.count()
    }
}