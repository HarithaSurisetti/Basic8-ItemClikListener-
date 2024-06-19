package com.example.itemclicklistener

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val ArtList: ArrayList<Art>) :
    RecyclerView.Adapter<Adapter.ArtViewHolder>() {
        var onItemClick :((Art)->Unit)?=null
    class ArtViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val textView: TextView = itemView.findViewById((R.id.textView))
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtViewHolder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.each_item,parent,false)
        return ArtViewHolder(view)
    }

    override fun getItemCount(): Int {
        return ArtList.size
    }

    override fun onBindViewHolder(holder: ArtViewHolder, position: Int) {
        val art = ArtList[position]
        holder.imageView.setImageResource(art.image)
        holder.textView.text=art.name

        holder.itemView.setOnClickListener{
            onItemClick?.invoke(art)

        }

    }

}