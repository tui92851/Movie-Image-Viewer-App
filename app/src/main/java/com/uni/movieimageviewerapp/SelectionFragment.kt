package com.uni.movieimageviewerapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SelectionFragment() : Fragment() {

    private val viewModel: MovieViewModel by activityViewModels()

    companion object {
        private const val MOVIES = "MOVIES"
        fun newInstance(movies: ArrayList<MovieModel>) = SelectionFragment().apply {
            arguments = bundleOf(MOVIES to movies)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_selection, container, false)
        activity?.title = resources.getString(R.string.title)

        val manager = GridLayoutManager(activity, 2)
        val recyclerView = view?.findViewById<RecyclerView>(R.id.recyclerview)

        recyclerView?.layoutManager = manager
        val movies = arguments?.get("MOVIES") as ArrayList<MovieModel>
        recyclerView?.adapter = ImageAdapter(activity as MainActivity, movies, viewModel)
        return view
    }
}