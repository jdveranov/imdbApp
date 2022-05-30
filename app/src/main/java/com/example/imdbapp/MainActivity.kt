package com.example.imdbapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {

    val duration: Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {

        //setTheme(R.style.Theme_IMDbApp)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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