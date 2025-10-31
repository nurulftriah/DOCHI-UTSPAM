package com.example.dochi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SuccessActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success)
        supportActionBar?.hide()

        val fullName = intent.getStringExtra("EXTRA_NAME") ?: "Pengguna"
        val haloName = findViewById<TextView>(R.id.tv_halo_name_success)
        haloName.text = "Halo $fullName,"

        val kirimButton = findViewById<Button>(R.id.btn_kirim_success)
        kirimButton.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("EXTRA_NAME", fullName)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
            finishAffinity()
        }
    }
}
