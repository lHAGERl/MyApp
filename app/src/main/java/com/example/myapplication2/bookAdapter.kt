package com.example.myapplication2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView


class bookAdapter(val data: List<book>)
    : ListAdapter<book, bookAdapter.MyViewHolder>(UserItemDiffCallback()) {

    class MyViewHolder(val row: View) : RecyclerView.ViewHolder(row) {
        val tvName = row.findViewById<TextView>(R.id.tv_name)
        val tvAuthor= row.findViewById<TextView>(R.id.tv_Author)
        val image= row.findViewById<ImageView>(R.id.iv_bookimage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.itembook,
            parent, false)
        return MyViewHolder(layout)

    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvName.text = data.get(position).name
        holder.tvAuthor.text = data.get(position).Author
        holder.image.setImageResource(data.get(position).Image)
    }
}

class UserItemDiffCallback: DiffUtil.ItemCallback<book>() {
    override fun areItemsTheSame(oldItem: book, newItem: book): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: book, newItem: book): Boolean {
        return oldItem == newItem
    }

}

