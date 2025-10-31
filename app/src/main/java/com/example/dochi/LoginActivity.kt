package com.example.dochi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        val loginButton = findViewById<Button>(R.id.btn_login_submit)
        val usernameEditText = findViewById<EditText>(R.id.et_username)

        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("EXTRA_NAME", username)
            startActivity(intent)
            finishAffinity()
        }
    }
}
