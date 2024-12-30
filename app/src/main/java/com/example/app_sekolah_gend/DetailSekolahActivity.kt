package com.example.app_sekolah_gend

import android.content.Intent
import android.content.res.Resources
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.app_sekolah_gend.databinding.ActivityDetailSekolahBinding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MapStyleOptions
import com.google.android.gms.maps.model.MarkerOptions


class DetailSekolahActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityDetailSekolahBinding

    private lateinit var tvNamaSekolah: TextView
    private lateinit var imgSekolah: ImageView
    private lateinit var tvDeskripsiSekolah: TextView
    private lateinit var btnLokasi: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailSekolahBinding.inflate(layoutInflater)
        setContentView(binding.root)

        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Initialize views
        tvNamaSekolah = findViewById(R.id.tvNamaSekolah)
        imgSekolah = findViewById(R.id.imgSekolah)
        tvDeskripsiSekolah = findViewById(R.id.tvDeskripsiSekolah)
        btnLokasi = findViewById(R.id.btnLokasi)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Fetch data from intent
        val namaSekolah = intent.getStringExtra("namaSekolah")
        val fotoSekolah = intent.getIntExtra("fotoSekolah", 0)
        val deskripsiSekolah = intent.getStringExtra("deskripsiSekolah")
        val latSekolah = intent.getDoubleExtra("latSekolah", 0.0)
        val longSekolah = intent.getDoubleExtra("longSekolah", 0.0)

        // Set values to the views
        tvNamaSekolah.text = namaSekolah
        imgSekolah.setImageResource(fotoSekolah)
        tvDeskripsiSekolah.text = deskripsiSekolah

        //event click button Map Wisata
        btnLokasi.setOnClickListener {
            val intentMapSekolahActivity = Intent(this,MapSekolahActivity::class.java)
            //kirim lat dan long
            intentMapSekolahActivity.putExtra("latSekolah",latSekolah)
            intentMapSekolahActivity.putExtra("longSekolah",longSekolah)
            intentMapSekolahActivity.putExtra("namaSekolah",namaSekolah)
            startActivity(intentMapSekolahActivity)
        }
        //panggil method style map//
        setStylesMap(mMap)

        // Add a marker and move the camera to the location
        val koordinatWisata = LatLng(-latSekolah, longSekolah)
        mMap.addMarker(MarkerOptions().position(koordinatWisata).title(namaSekolah))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(koordinatWisata, 15f))
    }
    private fun setStylesMap(mMap: GoogleMap) {

        try {
            val newMap = mMap.setMapStyle(
                MapStyleOptions.loadRawResourceStyle(this
                    ,R.raw.map_style))
            if (!newMap){
                Toast.makeText(this,"Style Map tidak ditemukan", Toast.LENGTH_LONG).show()
            }
        }catch (e: Resources.NotFoundException){
            Toast.makeText(this,"Error : $e", Toast.LENGTH_LONG).show()
        }

    }
}