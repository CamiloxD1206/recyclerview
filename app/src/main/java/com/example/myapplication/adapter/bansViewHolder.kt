package com.example.myapplication.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.Bands
import com.example.myapplication.R

class bansViewHolder(view: View):RecyclerView.ViewHolder(view) {



    val nameBand=view.findViewById<TextView>(R.id.tvbandName)
    val gender=view.findViewById<TextView>(R.id.tvbandGender)
    val origin=view.findViewById<TextView>(R.id.tvbandOrigin)
    val state=view.findViewById<TextView>(R.id.tvbandState)
    val recordLabel=view.findViewById<TextView>(R.id.tvbandRecordLable)
    val photo=view.findViewById<ImageView>(R.id.ivbands)

fun render(bands: Bands){
    nameBand.text=bands.nameBand
    gender.text=("Genero: ${bands.gender}")
    origin.text=("Origen ${bands.origin}")
    state.text=("Estado: ${bands.state}")
    recordLabel.text=("Discografica ${bands.recordLabel}")
      Glide.with(photo.context).load(bands.photo).into(photo)
}

}