package com.example.varianta

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.varianta.databinding.FragmentProductDetailBinding


class ProductDetailFragment : Fragment() {
    private lateinit var binding: FragmentProductDetailBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var binding = FragmentProductDetailBinding.inflate(layoutInflater, container, false)


        return binding.root
    }


}