package com.example.imdbapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.widget.ImageView
import androidx.core.os.HandlerCompat.postDelayed
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {

    val duration: Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {

        //setTheme(R.style.Theme_IMDbApp)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.window.setFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)

        val logo = findViewById<ImageView>(R.id.logo_imdb)

        Glide.with(this).load(R.drawable.imdb_logo2016).into(logo)

        changeActivity()
    }

    private fun changeActivity(){
        Handler().postDelayed(Runnable {
            val intent = Intent (this, LoginActivity::class.java )
            startActivity(intent)
        }, duration)
    }
}