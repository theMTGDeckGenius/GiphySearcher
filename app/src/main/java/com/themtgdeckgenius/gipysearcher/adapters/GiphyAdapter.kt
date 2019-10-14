package com.themtgdeckgenius.gipysearcher.adapters

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.transition.Transition
import com.themtgdeckgenius.gipysearcher.R
import com.themtgdeckgenius.gipysearcher.networking.models.GiphyModel
import com.themtgdeckgenius.gipysearcher.ui.search.SearchViewModel
import kotlinx.android.synthetic.main.giphy_item.view.*
import pl.droidsonroids.gif.GifDrawable
import pl.droidsonroids.gif.GifImageView

class GiphyAdapter(val viewModel: SearchViewModel) : RecyclerView.Adapter<ViewHolder>() {
    private var items: List<GiphyModel.Data> = listOf()
    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.giphy_item, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        Glide.with(context)
            .asGif()
            .load(items[position].images.original.url)
            .thumbnail(0.1f)
            .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
            .centerCrop()
            .into(object : CustomTarget<com.bumptech.glide.load.resource.gif.GifDrawable>() {
                override fun onResourceReady(
                    resource: com.bumptech.glide.load.resource.gif.GifDrawable,
                    transition: Transition<in com.bumptech.glide.load.resource.gif.GifDrawable>?
                ) {
                    holder.imageView.setImageDrawable(resource)
                    resource.start()
                }

                override fun onLoadCleared(placeholder: Drawable?) {

                }
            })
    }

    // Gets the number of animals in the list
    override fun getItemCount(): Int {
        return items.size
    }

}

class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    // Holds the TextView that will add each animal to
    val imageView: ImageView = view.gif_drawable
}