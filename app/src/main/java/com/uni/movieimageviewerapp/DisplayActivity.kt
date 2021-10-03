package com.uni.movieimageviewerapp

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.uni.movieimageviewerapp.databinding.ActivityDisplayBinding

class DisplayActivity : AppCompatActivity() {
    private lateinit var textView2: TextView
    private lateinit var imageView2: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        textView2 = findViewById(R.id.title2)
        textView2.text = intent.getStringExtra("DisplayText").toString()

        imageView2 = findViewById(R.id.imageView2)
        imageView2.setImageResource(intent.getIntExtra("DisplayImage", R.drawable.deadpool))

    }
}