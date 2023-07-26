package com.example.sprintfinal

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.bumptech.glide.Glide
import com.example.sprintfinal.databinding.ItemLayoutBinding

class Adapter : RecyclerView.Adapter<Adapter.ViewHolder>() {
    var shoesList = mutableListOf<Shoes>()

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = shoesList[position]
        holder.bind(item)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return shoesList.size
    }

    fun setData(shoeList: List<Shoes>) {
        this.shoesList = shoeList.toMutableList()
    }

    class ViewHolder(val binding: ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(shoe: Shoes) {
            binding.tvNombre.text = shoe.nombre
            binding.tvPrecio.text = shoe.precio.toString()
            binding.imageView.load(shoe.url)
            Glide.with(binding.root).load(shoe.url).into(binding.imageView)

            binding.cvData.setOnClickListener {
          Log.d("Adapter", "Item clicked: ${shoe.nombre}")
          // Obtener el NavController desde el Fragmento actual


          // Navegar al FragmentDetail y pasar datos como argumentos
          val bundle = Bundle().apply {
              putString("nombre", shoe.nombre)
              putString("precio", shoe.precio.toString())
              putString("url", shoe.url)
              putString("detalle", shoe.detalle)
          }
         Navigation.findNavController(binding.root).navigate(R.id.action_shoesListFragment_to_fragmentDetail, bundle)
      }
        }
    }
}