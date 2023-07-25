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
private const val ARG_PARAM1 = "nombre"
private const val ARG_PARAM2 = "precio"
private const val ARG_PARAM3 = "url"
private const val ARG_PARAM4 = "detalle"



/**
 * A simple [Fragment] subclass.
 * Use the [DetailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DetailFragment : Fragment() {
    fun onSomeButtonClick() {
        findNavController().navigate(R.id.action_shoesListFragment_to_fragmentDetail)
    }


    lateinit var binding : FragmentDetailBinding //

    var adapter = Adapter()
    // TODO: Rename and change types of parameters
    private var param1: String? = "nombre"
    private var param2: String? = "precio"
    private var param3: String? = "url"
    private var param4: String? = "detalle"



    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString("nombre")
            param2 = it.getString("precio")
            param3 = it.getString("url")
            param4 = it.getString("detalle")

        }

    }
    fun newInstance(param1: String, param2: String,param3: String, param4: String): DetailFragment {
        val fragment = DetailFragment()
        val args = Bundle()
        args.putString(ARG_PARAM1, param1)
        args.putString(ARG_PARAM2, param2)
        args.putString(ARG_PARAM3, param3)
        args.putString(ARG_PARAM4, param4)
        fragment.arguments = args
        return fragment
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(layoutInflater, container, false)
        Glide.with(binding.root).load(param3).into(binding.ivDetail)
        binding.tvNombre1.text = param1




        // Inflate the layout for this fragment
        return binding.root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FragmentDetail.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            DetailFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                    putString(ARG_PARAM3, param3)
                    putString(ARG_PARAM4, param4)
                }
            }
    }
}