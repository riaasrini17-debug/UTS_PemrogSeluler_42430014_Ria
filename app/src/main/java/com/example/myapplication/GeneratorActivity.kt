package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class GeneratorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generator)

        val tvSapaan = findViewById<TextView>(R.id.tvSapaan)
        val jumlah = findViewById<EditText>(R.id.jumlahMahasiswa)
        val nilai = findViewById<EditText>(R.id.rataNilai)
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val txtHasil = findViewById<TextView>(R.id.txtHasil)

        val namaDosen = intent.getStringExtra("NAMA_DOSEN")
        val matkul = intent.getStringExtra("MATKUL")

        tvSapaan.text = "Selamat bertugas, Dosen $namaDosen\nMata Kuliah: $matkul"

        btnGenerate.setOnClickListener {

            val jml = jumlah.text.toString().toInt()
            val rata = nilai.text.toString().toInt()

            var status = ""

            // IF ELSE
            if(rata >= 80){
                status = "Sangat Baik"
            }
            else if(rata >= 60){
                status = "Cukup"
            }
            else{
                status = "Kurang"
            }

            var daftar = ""

            // FOR LOOP
            for(i in 1..jml){
                daftar += "Mahasiswa $i : __________\n"
            }

            txtHasil.text = "Status Kelas : $status\n\nDaftar Absen:\n$daftar"
        }
    }
}