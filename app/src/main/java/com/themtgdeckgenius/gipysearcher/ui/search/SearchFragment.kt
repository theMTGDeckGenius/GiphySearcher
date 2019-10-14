package com.themtgdeckgenius.gipysearcher.ui.search

import android.content.Context
import android.os.Bundle
import android.text.Editable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.Group
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.themtgdeckgenius.gipysearcher.BuildConfig
import com.themtgdeckgenius.gipysearcher.R
import com.themtgdeckgenius.gipysearcher.adapters.GiphyAdapter
import com.themtgdeckgenius.gipysearcher.networking.GiphyApiService
import com.themtgdeckgenius.gipysearcher.networking.models.GiphyModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class SearchFragment : Fragment() {

    private lateinit var searchViewModel: SearchViewModel
    private lateinit var giphyDisplay: RecyclerView
    private lateinit var giphyAdapter: GiphyAdapter
    private var disposable: Disposable? = null
    private lateinit var linearLayoutManager: LinearLayoutManager
    private val giphyApiServe by lazy {
        GiphyApiService.create()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        searchViewModel = ViewModelProviders.of(this).get(SearchViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_search, container, false)
        val titalText: TextView = root.findViewById(R.id.text_search_title)
        searchViewModel.title.observe(this, Observer {
            titalText.text = it
        })

        val primaryInputTerm: EditText = root.findViewById(R.id.editText_search_term_primary) as EditText
        searchViewModel.searchTerm.observe(this, Observer {
            primaryInputTerm.text = Editable.Factory.getInstance().newEditable(it)
        })

        val secondaryInputTerm: EditText = root.findViewById(R.id.editText_search_term_secondary) as EditText
        searchViewModel.searchTerm.observe(this, Observer {
            secondaryInputTerm.text = Editable.Factory.getInstance().newEditable(it)
        })

        val primarySearchGroup: Group = root.findViewById(R.id.primary_search_input)
        val secondarySearchGroup: Group = root.findViewById(R.id.secondary_search_input)

        val primarySearchButton: Button = root.findViewById(R.id.button_search_primary) as Button
        primarySearchButton.setOnClickListener {
            searchViewModel.updateSearchTerm(primaryInputTerm.text.toString())
            primarySearchGroup.visibility = View.GONE
            secondarySearchGroup.visibility = View.VISIBLE
            beginSearch(searchViewModel.searchTerm.value.toString())

        }

        val secondarySearchButton: Button = root.findViewById(R.id.button_search_secondary) as Button
        secondarySearchButton.setOnClickListener {
            searchViewModel.updateSearchTerm(secondaryInputTerm.text.toString())
            beginSearch(searchViewModel.searchTerm.value.toString())
        }

        giphyDisplay = root.findViewById(R.id.recycler_view_search) as RecyclerView
        linearLayoutManager = LinearLayoutManager(context)
        giphyDisplay.layoutManager = linearLayoutManager
        giphyAdapter = GiphyAdapter(searchViewModel)
        giphyDisplay.adapter = giphyAdapter

        return root
    }

    private fun beginSearch(searchString: String) {
        disposable =
            giphyApiServe.getGifList(BuildConfig.GIPHY_API_KEY, searchString, 25, 0, "G", "en")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { result ->
                    searchViewModel.updateGifList(result.data)
                    giphyAdapter.notifyDataSetChanged()

                }
    }
}