package com.example.imdbapp

import android.os.Bundle
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.imdbapp.LinearVertical.MovieLinearVerticalAdapter
import com.example.imdbapp.commons.Movie
import com.example.imdbapp.databinding.ActivityGalleryBinding


class GalleryActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGalleryBinding

    private lateinit var adapterMovies: MovieLinearVerticalAdapter

    private val data = mutableListOf<Movie>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGalleryBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.scroll.isFocusableInTouchMode= true
        binding.scroll.descendantFocusability= ViewGroup.FOCUS_BEFORE_DESCENDANTS
    }

    override fun onStart() {
        super.onStart()
        initRecyclerView()
        initData()
    }

    private fun initRecyclerView() {
        adapterMovies = MovieLinearVerticalAdapter(data)
        with(binding.recyclerView) {
            layoutManager = LinearLayoutManager(this@GalleryActivity)
            adapter = adapterMovies
        }
    }
        private fun initData() {
            val newData = getData()
            data.clear()
            data.addAll(newData)
            adapterMovies.notifyDataSetChanged()
        }

        fun getData(): List<Movie> {
            return listOf(
                Movie(
                    url = "https://image.tmdb.org/t/p/original/dXNAPwY7VrqMAo51EKhhCJfaGb5.jpg",
                    title = "Matrix",
                    year = 1999,
                    casting = "Keanu Reeves, Carrie-Anne Moss"
                ),
                Movie(
                    url = "https://m.media-amazon.com/images/M/MV5BMjAxMzY3NjcxNF5BMl5BanBnXkFtZTcwNTI5OTM0Mw@@._V1_FMjpg_UX1000_.jpg",
                    title = "Inception",
                    year = 2010,
                    casting = "Leonardo Di Caprio, Joseph Gordon-Levitt"
                ),
                Movie(
                    url = "https://m.media-amazon.com/images/I/51ZYgABA-+L._AC_.jpg",
                    title = "Blade Runner",
                    year = 1982,
                    casting = "Harrison Ford, Sean Young"
                ),
                Movie(
                    url = "https://esculpiendoeltiempocom.files.wordpress.com/2016/11/arrival_poster_by_vranckx-dat79ag.jpg",
                    title = "Arrival",
                    year = 2016,
                    casting = "Amy Adams, Jeremy Renner"
                ),
                Movie(
                    url = "https://m.media-amazon.com/images/I/61vwWxZmLWL._AC_.jpg",
                    title = "Enter the Void",
                    year = 2009,
                    casting = "Nathaniel Brown, Paz de la Huerta"
                ),
                Movie(
                    url = "https://m.media-amazon.com/images/M/MV5BN2Y2OWU4MWMtNmIyMy00YzMyLWI0Y2ItMTcyZDc3MTdmZDU4XkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_.jpg",
                    title = "Twelve monkeys",
                    year = 1995,
                    casting = "Bruce Willis, Brat Pitt"
                ),
                Movie(
                    url = "https://m.media-amazon.com/images/I/51zEzhi+n1L._AC_.jpg",
                    title = "District 9",
                    year = 2009,
                    casting = "Sharlto Copley, Jason Cope"
                )
            )
        }
}
