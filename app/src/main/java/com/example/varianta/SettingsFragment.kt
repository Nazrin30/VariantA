package com.example.varianta

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.varianta.databinding.FragmentSettingsBinding


class SettingsFragment : Fragment() {
    private lateinit var binding: FragmentSettingsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentSettingsBinding.inflate(layoutInflater, container, false)
         binding.button.setOnClickListener {
           val intent = Intent(requireContext(), ProfileActivity::class.java)
             startActivity(intent)
         }

        return binding.root
    }


}