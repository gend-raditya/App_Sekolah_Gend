package com.example.app_sekolah_gend.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.app_sekolah_gend.DetailSekolahActivity
import com.example.app_sekolah_gend.R
import com.example.app_sekolah_gend.model.ModelSekolah


class AdapterSekolah(
    //data di ambil dari model
    val listItemSekolah: List<ModelSekolah>
) : RecyclerView.Adapter<AdapterSekolah.MyViewHolder>() {
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //layout pada widget//
        val imgSekolah : ImageView = itemView.findViewById(R.id.imgSekolah)
        val tvNamaSekolah : TextView = itemView.findViewById(R.id.tvNamaSekolah)
        val tvNoTelpon : TextView = itemView.findViewById(R.id.tvNoTelpon)
        val cvSekolah : CardView = itemView.findViewById(R.id.cvSekolah)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_sekolah, parent,false)
        return MyViewHolder(nView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currenItem = listItemSekolah[position]
        holder.imgSekolah.setImageResource(currenItem.fotoSekolah)
        holder.tvNamaSekolah.text = (currenItem.namaSekolah)
        holder.tvNoTelpon.text = (currenItem.noTelpon)
        //event klik pada cardView
        holder.cvSekolah.setOnClickListener(){
            val intentDetailSekolah = Intent(holder.itemView.context,DetailSekolahActivity::class.java)
            //kirim data list item wisata ke DetailWisataActicity//
            intentDetailSekolah.putExtra("namaSekolah",currenItem.namaSekolah)
            intentDetailSekolah.putExtra("fotoSekolah",currenItem.fotoSekolah)
            intentDetailSekolah.putExtra("alamatSekolah",currenItem.alamatSekolah)
            intentDetailSekolah.putExtra("deskripsiSekolah",currenItem.deskripsiSekolah)
            intentDetailSekolah.putExtra("noTelpon",currenItem.noTelpon)
            intentDetailSekolah.putExtra("latSekolah",currenItem.latSekolah)
            intentDetailSekolah.putExtra("longSekolah",currenItem.longSekolah)
            //start intent startActivity
            holder.itemView.context.startActivity(intentDetailSekolah)
        }
    }

    override fun getItemCount(): Int {
        return listItemSekolah.size
    }

}