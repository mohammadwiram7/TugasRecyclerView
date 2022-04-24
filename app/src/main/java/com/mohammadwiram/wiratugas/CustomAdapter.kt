package com.mohammadwiram.wiratugas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val mList: List<ItemsViewModel>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    // buat tampilan baru
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // card_view_design digunakan untuk menyimpan daftar item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_view_design, parent, false)

        return ViewHolder(view)
    }

    // binds list items ke dalam view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ItemsViewModel = mList[position]

        // sets gambar ke dalam imageview dari class itemHolder
        holder.imageView.setImageResource(ItemsViewModel.image)

        // sets text ke dalam textview dari class itemHolder
        holder.textView.text = ItemsViewModel.text

    }

    // mengembalikan jumlah item dalam daftar
    override fun getItemCount(): Int {
        return mList.size
    }

    // menambahkan teks dan gambar
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageview)
        val textView: TextView = itemView.findViewById(R.id.textView)
    }
}