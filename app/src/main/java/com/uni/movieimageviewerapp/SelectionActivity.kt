package com.uni.movieimageviewerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SelectionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        title = resources.getString(R.string.title)

        val manager = GridLayoutManager(this, 2)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerView.layoutManager = manager
        recyclerView.adapter = ImageAdapter(this, getMovieData())
    }

    private fun getMovieData():ArrayList<MovieModel>{
        val list = ArrayList<MovieModel>()
        val array: Array<String> = resources.getStringArray(R.array.movies)
        val iterator = array.iterator()
        list.add(MovieModel(iterator.next(), R.drawable.deadpool))
        list.add(MovieModel(iterator.next(), R.drawable.fast_furious_presents_hobbs_shaw))
        list.add(MovieModel(iterator.next(), R.drawable.free_guy))
        list.add(MovieModel(iterator.next(), R.drawable.deadpool_2))
        list.add(MovieModel(iterator.next(), R.drawable.green_lantern))
        list.add(MovieModel(iterator.next(), R.drawable.life_theatrical))
        list.add(MovieModel(iterator.next(), R.drawable.pokemon_detective_pikachu))
        list.add(MovieModel(iterator.next(), R.drawable.the_amityville_horror))
        list.add(MovieModel(iterator.next(), R.drawable.the_croods))
        list.add(MovieModel(iterator.next(), R.drawable.the_hitmans_bodyguard))
        return list
    }
}