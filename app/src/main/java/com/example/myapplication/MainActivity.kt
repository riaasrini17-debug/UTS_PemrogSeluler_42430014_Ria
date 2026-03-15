package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nama = findViewById<EditText>(R.id.etNama)
        val matkul = findViewById<EditText>(R.id.etMataKuliah)
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        btnLogin.setOnClickListener {

            if(nama.text.toString().isEmpty() || matkul.text.toString().isEmpty()){
                Toast.makeText(this,"Isi data terlebih dahulu",Toast.LENGTH_SHORT).show()
            }else{

                val intent = Intent(this, GeneratorActivity::class.java)

                intent.putExtra("NAMA_DOSEN", nama.text.toString())
                intent.putExtra("MATKUL", matkul.text.toString())

                startActivity(intent)

            }
        }
    }
}