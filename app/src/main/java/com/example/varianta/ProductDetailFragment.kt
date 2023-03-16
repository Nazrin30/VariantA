package com.example.varianta

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.varianta.databinding.FragmentProductDetailBinding


class ProductDetailFragment : Fragment() {
    private lateinit var binding: FragmentProductDetailBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var binding = FragmentProductDetailBinding.inflate(layoutInflater, container, false)

        val bundle : ProductDetailFragmentArgs by navArgs()
        var product = bundle.product
        binding.productName.text = product.name
        binding.imageView2.setImageResource(requireContext()
            .resources.getIdentifier(product.image, "drawable", requireContext().packageName))
        binding.description.text = product.description
        binding.price.text = product.price.toString()
        return binding.root


    }
}
