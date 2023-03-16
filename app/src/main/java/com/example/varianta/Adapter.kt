package com.example.varianta

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.varianta.databinding.CardDesignBinding
import kotlinx.coroutines.processNextEventInCurrentThread

class Adapter ( var mContext: Context, var list : List<Products>)
    :RecyclerView.Adapter<Adapter.CardDesignViewHolder>(){

    inner class CardDesignViewHolder (var binding: CardDesignBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignViewHolder {
        var binding = CardDesignBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardDesignViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CardDesignViewHolder, position: Int) {
        val product = list.get(position)
        holder.binding.textView3.text = product.name
        holder.binding.imageView.setImageResource(mContext.resources.getIdentifier(product.image, "drawable", mContext.packageName))
        val bundle = Bundle()
        bundle.apply{
            putSerializable("product", product)
        }
        holder.binding.detailsButton.setOnClickListener {

            findNavController(it).navigate(R.id.product_nav_graph, bundle)
        }

    }

    override fun getItemCount(): Int {
        return list.size
    }
}