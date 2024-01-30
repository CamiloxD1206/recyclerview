package com.example.myapplication.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.Bands
import com.example.myapplication.R

class bandAdapter (private val bandslist:List<Bands>):RecyclerView.Adapter<bansViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): bansViewHolder {
val layoutInflater=LayoutInflater.from(parent.context)
        return bansViewHolder(layoutInflater.inflate(R.layout.item_bands,parent,false))
    }

    override fun onBindViewHolder(holder: bansViewHolder, position: Int) {
val item=bandslist[position]
        holder.render(item)
    }

    override fun getItemCount(): Int {
return  bandslist.size
    }
}