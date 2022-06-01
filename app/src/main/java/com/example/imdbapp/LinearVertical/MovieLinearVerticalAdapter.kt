package com.example.imdbapp.LinearVertical

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.imdbapp.R
import com.example.imdbapp.commons.Movie

class MovieLinearVerticalAdapter (
    val data: List<Movie>
    ) : RecyclerView.Adapter<MovieLinearVerticalViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieLinearVerticalViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
         return  MovieLinearVerticalViewHolder(
             layoutInflater.inflate(
                 R.layout.item_view_holder_movie_linear_vertical,
                 parent,
                 false
             )
         )
    }

    override fun onBindViewHolder(holder: MovieLinearVerticalViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = data.size
    }