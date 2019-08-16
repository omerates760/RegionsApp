package com.monofire.regionsapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RegionAdapter(private val list: List<String>, private val customItemListener: CustomRegionItemListener) :
    RecyclerView.Adapter<RegionAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(
            parent.context
        ).inflate(R.layout.item_row, parent, false)

        val myViewHolder = MyViewHolder(v)
        v.setOnClickListener {
            customItemListener.onItemClickRegion(list[myViewHolder.adapterPosition])
        }
        return myViewHolder
    }
    override fun getItemCount(): Int = list.size
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.name.text = list[position]
    }

    class MyViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {
        val name: TextView = itemview.findViewById(R.id.txt_name)


    }

}