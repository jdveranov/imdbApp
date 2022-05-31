package com.example.imdbapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.imdbapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val duration: Long = 3000

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        this.window.setFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)

        val logo = findViewById<ImageView>(R.id.logo_imdb)
        val loader = findViewById<ImageView>(R.id.loader_imdb)

        Glide.with(this).load(R.drawable.imdb_logo).into(logo)
        Glide.with(this).load(R.drawable.loader).into(loader)

        changeActivity()
    }

    private fun changeActivity(){
        Handler(Looper.myLooper()!!).postDelayed(Runnable {
            val intent = Intent (this, LoginActivity::class.java )
            startActivity(intent)
        }, duration)
    }
}