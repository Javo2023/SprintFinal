package com.example.sprintfinal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.sprintfinal.databinding.FragmentDetailBinding
import com.example.sprintfinal.databinding.FragmentShoesListBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [DetailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DetailFragment : Fragment() {
      lateinit var binding : FragmentDetailBinding //

    var adapter = Adapter()
    // TODO: Rename and change types of parameters
    private var param1: String? = ""
    private var param2: String? = ""
    private var param3: String? = ""
    private var param4: String? = ""



    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString("nombre")
            param2 = it.getString("url")
            param3 = it.getString("precio")
            param4 = it.getString("detalle")

        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(layoutInflater, container, false)
        Glide.with(binding.root).load(param2).into(binding.ivDetail)
        binding.tvNombre1.text = param1
        binding.tvDetail.text = param4
        binding.tvPrecio1.text = param3

        binding.buttonAddToCart.setOnClickListener(){

        }



        // Inflate the layout for this fragment
        return binding.root
    }


}