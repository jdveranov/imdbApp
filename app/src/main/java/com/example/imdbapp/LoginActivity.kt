package com.example.imdbapp

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.imdbapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        val register = findViewById<TextView>(R.id.txt_register)

        register.setOnClickListener{
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent) }
    }

    override fun onStart() {
        super.onStart()
        with(binding){
            btnLogin.setOnClickListener {goToLinearVertical()}
        }
    }

    private fun goToLinearVertical(){
        val intent = Intent(this, GalleryActivity::class.java )
        openIntent(intent)
    }

    private fun openIntent(intent: Intent){
        startActivity(intent)
    }

}

