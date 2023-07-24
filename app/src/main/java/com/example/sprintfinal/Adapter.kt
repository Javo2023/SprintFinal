package com.example.sprintfinal

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.net.toUri
import androidx.recyclerview.widget.RecyclerView
import com.example.sprintfinal.databinding.ItemLayoutBinding

class Adapter : RecyclerView.Adapter<Adapter.ViewHolder>(){


    var shoesList = mutableListOf<Shoes>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {
        val binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        val item = shoesList[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return shoesList.size
    }

    class ViewHolder (val binding: ItemLayoutBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(shoe: Shoes) {
            binding.tvNombre.text = shoe.nombre
            binding.tvPrecio.text = shoe.precio.toString()


        }


    }
}