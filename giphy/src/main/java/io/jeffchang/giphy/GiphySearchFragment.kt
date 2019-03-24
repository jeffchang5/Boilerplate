package io.jeffchang.giphy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.android.support.DaggerFragment
import io.jeffchang.base.common.GridItemDecoration
import io.jeffchang.giphy.adapter.GiphyRecyclerViewAdapter
import io.jeffchang.giphy.viewmodel.GiphyViewModel
import kotlinx.android.synthetic.main.fragment_giphy_search.*
import javax.inject.Inject
import android.content.Intent
import android.net.Uri
import io.jeffchang.challenge.R


class GiphySearchFragment : DaggerFragment() {

    @Inject
    lateinit var giphyViewModel: GiphyViewModel

    private val searchItemRecyclerViewAdapter by lazy {
        GiphyRecyclerViewAdapter()
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?) =
            inflater.inflate(R.layout.fragment_giphy_search, container, false)!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        subscribeUi()
        initRecyclerView()
    }

    private fun initRecyclerView() {
        fragment_pull_request_recyclerview.apply {
            layoutManager = LinearLayoutManager(context)

            // If the device has at least a screen width of 600 dp, show 3 instead of 2.
            val numberOfColumns = if (resources.getBoolean(R.bool.isTablet)) 3 else 2
            layoutManager = GridLayoutManager(context, numberOfColumns)

            addItemDecoration(GridItemDecoration(8))

            adapter = searchItemRecyclerViewAdapter
        }
    }

    private fun subscribeUi() {
        giphyViewModel.textDataLiveData.observe(this, Observer {
            fragment_pull_request_loading_view.textData = it
        })
        giphyViewModel.searchResult.observe(this, Observer {
            searchItemRecyclerViewAdapter.submitList(it)
        })
    }

    // Directs to either the browser or New York Times app to read the article.
    private fun startNewYorkTimesArticle(articleUrl: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(articleUrl))
        startActivity(intent)
    }

}