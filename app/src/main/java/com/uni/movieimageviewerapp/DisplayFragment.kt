package com.uni.movieimageviewerapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels


class DisplayFragment : Fragment() {

    private lateinit var textView2: TextView
    private lateinit var imageView2: ImageView
    private val viewModel: MovieViewModel by activityViewModels()



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_display, container, false)

        textView2 = view.findViewById(R.id.title2)
        imageView2 = view.findViewById(R.id.imageView2)

        viewModel.getMovie().observe(viewLifecycleOwner, { movie ->

            textView2.text = movie.text
            imageView2.setImageResource(movie.imageId)
        })

        return view
    }
}