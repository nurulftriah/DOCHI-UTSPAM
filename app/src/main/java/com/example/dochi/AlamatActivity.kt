package com.example.dochi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AlamatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alamat)
        supportActionBar?.hide()

        val fullName = intent.getStringExtra("EXTRA_NAME") ?: "Pengguna"

        val btnSubmit = findViewById<Button>(R.id.btn_order_kirim_submit)
        val etNama = findViewById<EditText>(R.id.et_full_name_alamat)
        val etAlamat = findViewById<EditText>(R.id.et_alamat)
        val etPatokan = findViewById<EditText>(R.id.et_patokan_alamat)

        etNama.setText(fullName)

        btnSubmit.setOnClickListener {
            val nama = etNama.text.toString()
            val alamat = etAlamat.text.toString()
            val patokan = etPatokan.text.toString()

            if (nama.isNotEmpty() && alamat.isNotEmpty() && patokan.isNotEmpty()) {
                val intent = Intent(this, SuccessActivity::class.java)
                intent.putExtra("EXTRA_NAME", nama)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Harap isi semua data", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
