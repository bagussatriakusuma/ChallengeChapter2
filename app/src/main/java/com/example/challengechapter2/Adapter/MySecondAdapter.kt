package com.example.challengechapter2.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.challengechapter2.Model.MySecondModel
import com.example.challengechapter2.R

class MySecondAdapter(private val list2: List<MySecondModel>): RecyclerView.Adapter<MySecondAdapter.ViewHolder>(){
    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val imageCover = itemView.findViewById<ImageView>(R.id.itemImage)
        val titlePrice = itemView.findViewById<TextView>(R.id.textPrice)
        val titleDiscount = itemView.findViewById<TextView>(R.id.textDiscount)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val contactView = inflater.inflate(R.layout.item_layout, parent, false)
        return ViewHolder(contactView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Get the data model based on position
        val message2: MySecondModel = list2[position]
        // Set item views based on your views and data model
        holder.imageCover.setImageResource(message2.itemImage)
        holder.titlePrice.text = message2.itemPrice
        holder.titleDiscount.text = message2.itemDiscount
    }

    override fun getItemCount(): Int {
        return list2.count()
    }
}