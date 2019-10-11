package com.themtgdeckgenius.gipysearcher.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.themtgdeckgenius.gipysearcher.R
import com.themtgdeckgenius.gipysearcher.networking.models.GiphyModel
import kotlinx.android.synthetic.main.giphy_item.view.*

class GiphyAdapter(val items : ArrayList<GiphyModel.Data>, val context: Context) : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.giphy_item, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.tvAnimalType?.loadUrl(items.get(position).images.preview.mp4)
    }

    // Gets the number of animals in the list
    override fun getItemCount(): Int {
        return items.size
    }


}

class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    // Holds the TextView that will add each animal to
    val tvAnimalType = view.web_view
}