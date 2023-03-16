package com.example.varianta

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.varianta.databinding.FragmentProductsBinding


class ProductsFragment : Fragment() {
    private lateinit var binding: FragmentProductsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentProductsBinding.inflate(layoutInflater, container, false)

         var product  = Products("Mocha",
             "caffè mocha is based on espresso and hot milk but with added chocolate flavouring and sweetener, typically in the form of cocoa powder and sugar.",
                      3.5f,
                       "mocha")
        var list = ArrayList<Products>()
        list.add(product)

        val adapter = Adapter(requireContext(), list)
        binding.rv.adapter = adapter
        binding.rv.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        return binding.root
    }


}