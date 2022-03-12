package com.example.challengechapter2.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.challengechapter2.Model.GojekModel
import com.example.challengechapter2.Model.MySecondModel
import com.example.challengechapter2.R

class GojekAdapter(private val list3: List<GojekModel>): RecyclerView.Adapter<GojekAdapter.ViewHolder>(){
    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val gojekCover = itemView.findViewById<ImageView>(R.id.imageGojek)
        val gojekTitle = itemView.findViewById<TextView>(R.id.titleGojek)
        val gojekPrice = itemView.findViewById<TextView>(R.id.saldoGojek)
        val gojekText = itemView.findViewById<TextView>(R.id.textGojek)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val contactView = inflater.inflate(R.layout.card_gojek, parent, false)
        return ViewHolder(contactView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Get the data model based on position
        val message3: GojekModel = list3[position]
        // Set item views based on your views and data model
        holder.gojekCover.setImageResource(message3.imgGojek)
        holder.gojekTitle.text = message3.ttlGojek
        holder.gojekPrice.text = message3.prcGojek
        holder.gojekText.text = message3.txtGojek
    }

    override fun getItemCount(): Int {
        return list3.count()
    }
}