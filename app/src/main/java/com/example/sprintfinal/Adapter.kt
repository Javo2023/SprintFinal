package com.example.sprintfinal

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.sprintfinal.databinding.ActivityMainBinding
import com.example.sprintfinal.databinding.ItemLayoutBinding

class Adapter : RecyclerView.Adapter<Adapter.ViewHolder>(){
    var shoesList = mutableListOf<Shoes>()
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = shoesList[position]
        holder.bind(item)

        holder.itemView.setOnClickListener {
            // Obtener el NavController desde el Fragmento actual
            val navController = findNavController(it)

            // Navegar al FragmentDetalle y pasar datos como argumentos

                val bundle = Bundle().apply {
                    putString("nombre", item.nombre)
                    putString("precio", item.precio.toString())
                    putString("url", item.url)
                    putString("detalle",item.detalle)

                }
            navController.navigate(R.id.action_shoesListFragment_to_fragmentDetail, bundle)

        }
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return shoesList.size
    }

    fun setData(shoeList: List<Shoes>){
        this.shoesList = shoeList.toMutableList()
    }


    class ViewHolder (val binding: ItemLayoutBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(shoe: Shoes) {
            binding.tvNombre.text = shoe.nombre
            binding.tvPrecio.text = shoe.precio.toString()
            binding.imageView.load(shoe.url)

    }


}



}
