package com.themtgdeckgenius.gipysearcher.ui.random

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.themtgdeckgenius.gipysearcher.R

class RandomFragment : Fragment() {

    private lateinit var randomViewModel: RandomViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        randomViewModel = ViewModelProviders.of(this).get(RandomViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_random, container, false)
        val textView: TextView = root.findViewById(R.id.text_dashboard)
        randomViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}