package com.example.imdbapp.LinearVertical

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.imdbapp.commons.Movie
import com.example.imdbapp.databinding.ItemViewHolderMovieLinearVerticalBinding

class MovieLinearVerticalViewHolder(
    view: View
) : RecyclerView.ViewHolder(view){

    private val binding = ItemViewHolderMovieLinearVerticalBinding.bind(view)

    fun bind(model: Movie) {

        with(binding) {
            Glide.with(itemView).load(model.url).into(imageViewLinearVerticalPrincipal)
            textViewLinearVerticalTitle.text = model.title
            textViewLinearVerticalYear.text = model.year.toString()
            textViewLinearVerticalCasting.text = model.casting
        }
    }
}

