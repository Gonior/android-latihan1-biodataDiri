package com.example.biodatadiri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val b = Bio()
        tvNama.text = b.nama
        tvNim.text = b.nim
        tvAddrs.text = b.addrs
        tvJK.text = b.jk
        tvTTL.text = b.ttl
        tvKelas.text = b.kelas
        tvGolDar.text = b.gol_darah
        tvFood.text = b.food
        tvDrink.text = b.drink
        tvHobi.text = b.drink
        tvSong.text = b.song
        tvFilm.text = b.film
        tvJob.text = b.wish_job
    }
}