package io.jeffchang.giphy.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import io.jeffchang.challenge.R
import io.jeffchang.giphy.data.model.SearchItem
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.giphy_item.*

@SuppressLint("SimpleDateFormat")
class GiphyRecyclerViewAdapter : ListAdapter<
        SearchItem,
        GiphyRecyclerViewAdapter.GiphyViewHolder>(GiphyCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GiphyViewHolder {
        val view = LayoutInflater
                .from(parent.context)
                .inflate(
                        R.layout.giphy_item,
                        parent,
                        false)

        return GiphyViewHolder(view)
    }

    override fun onBindViewHolder(holder: GiphyViewHolder, position: Int) {
        val searchItem = getItem(position)
        holder.bind(searchItem)
    }

    inner class GiphyViewHolder(itemView: View) :
            RecyclerView.ViewHolder(itemView), LayoutContainer {

        override val containerView: View? get() = itemView

        fun bind(searchItem: SearchItem) {
            itemView.apply {
                Glide.with(context)
                        .load(searchItem.images.original.url)
                        .into(giphy_item_profile_image_view)
                giphy_item_gif_title_textview.text = searchItem.title
//                Picasso
//                        .get()
//                        .load(searchResult.multimedia.src)
//                        .into(review_item_profile_image_view)
//                review_item_movie_title_textview.text = searchResult.displayTitle
//                review_item_byline_textview.text = searchResult.byline
//                review_item_mpaa_textview.text =
//                        if (searchResult.mpaaRating.isEmpty())
//                            context.getString(R.string.mpaa_empty)
//                        else searchResult.mpaaRating
//                review_item_headline_textview.text = searchResult.headline
//                review_item_desc_textview.text = searchResult.summaryShort
            }

        }
    }

    internal class GiphyCallback : DiffUtil.ItemCallback<SearchItem>() {

        override fun areItemsTheSame(oldItem: SearchItem, newItem: SearchItem) =
                oldItem == newItem

        override fun areContentsTheSame(oldItem: SearchItem, newItem: SearchItem) =
                oldItem == newItem
    }

}