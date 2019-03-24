package io.jeffchang.giphy

import android.os.Bundle
import android.view.Menu
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
        return true
    }

    override fun onSupportNavigateUp() =
            findNavController(this, R.id.activity_main_nav_host_fragment).navigateUp()
}
