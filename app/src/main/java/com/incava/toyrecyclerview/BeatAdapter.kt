package com.incava.toyrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.incava.toyrecyclerview.databinding.ItemNameBinding

class BeatAdapter(val itemList : MutableList<String>) : RecyclerView.Adapter<BeatAdapter.VH>() {

    inner class VH(val binding : ItemNameBinding) : ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        VH(ItemNameBinding.inflate(LayoutInflater.from(parent.context),parent,false))

    override fun getItemCount() = itemList.size

    override fun onBindViewHolder(holder: VH, position: Int) {
       holder.binding.tvName.text = itemList[position]
    }
}