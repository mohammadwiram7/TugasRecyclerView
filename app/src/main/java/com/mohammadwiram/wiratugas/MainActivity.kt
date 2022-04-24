package com.mohammadwiram.wiratugas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // mendapatkan recyclerview dengan id-nya
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)

        // membuat vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)

        // ArrayList dari kelas ItemsViewModel
        val data = ArrayList<ItemsViewModel>()

        // Loop ini akan membuat 20 Tampilan yang berisi
        // gambar dengan hitungan tampilan
        for (i in 1..20) {
            data.add(ItemsViewModel(R.drawable.ic_baseline_folder_24, "Item " + i))
        }

        // Ini akan meneruskan ArrayList ke Adaptor
        val adapter = CustomAdapter(data)

        // Mengatur Adapter dengan recyclerview
        recyclerview.adapter = adapter
    }
}