package com.example.sprintfinal

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sprintfinal.databinding.ItemLayoutBinding

class AdapterCart : RecyclerView.Adapter<Adapter.ViewHolder>() {

    var shoesCart = mutableListOf<Shoes>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {
        val binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Adapter.ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return shoesCart.size
    }

    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        val item = shoesCart[position]
        holder.bind(item)
    }
    fun setData(shoeCart: List<Shoes>) {
        this.shoesCart = shoeCart.toMutableList()
    }
}