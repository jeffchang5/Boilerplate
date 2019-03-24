package io.jeffchang.giphy

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.widget.SearchView
import androidx.navigation.Navigation.findNavController
import dagger.android.support.DaggerAppCompatActivity
import io.jeffchang.challenge.R

class GiphySearchActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_giphy_search)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.giphy_search_options_menu, menu)
        val searchView = menu.findItem(R.id.gif_search).actionView as SearchView

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                submitSearch(query)
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                // no-opt
                return false
            }

        })

        return true
    }

    // Ugly code but documented in https://stackoverflow.com/a/53396780 to access fragments in
    // Navigation Component.
    private fun submitSearch(query: String) {
        (supportFragmentManager
                .findFragmentById(R.id.activity_main_nav_host_fragment)
                ?.childFragmentManager
                ?.primaryNavigationFragment
                as? GiphySearchFragment)
                ?.giphyViewModel
                ?.getSearchItems(query)
    }

    override fun onSupportNavigateUp() =
            findNavController(this, R.id.activity_main_nav_host_fragment).navigateUp()
}
