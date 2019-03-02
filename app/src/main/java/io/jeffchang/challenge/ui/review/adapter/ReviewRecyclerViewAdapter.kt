package io.jeffchang.challenge.ui.review.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import io.jeffchang.challenge.data.model.Review
import io.jeffchang.challenge.ui.review.widget.ReviewItem

class ReviewRecyclerViewAdapter: ListAdapter<
        Review,
        ReviewRecyclerViewAdapter.ReviewViewHolder>(ReviewCallback()) {

    var onReviewClickedListener: OnReviewClickedListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReviewViewHolder {
        val viewHolder = ReviewViewHolder(ReviewItem(parent.context))
        viewHolder.itemView.setOnClickListener {
            val review = getItem(viewHolder.adapterPosition)
            onReviewClickedListener?.onReviewClicked(review)
        }
        return viewHolder
    }

    override fun onBindViewHolder(holder: ReviewViewHolder, position: Int) {
        val pullRequest = getItem(position)
        holder.bind(pullRequest)
    }

    inner class ReviewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(review: Review) {
            (itemView as ReviewItem).apply {

            }
        }
    }

    internal class ReviewCallback: DiffUtil.ItemCallback<Review>() {

        override fun areItemsTheSame(oldItem: Review, newItem: Review) =
                oldItem == newItem

        override fun areContentsTheSame(oldItem: Review, newItem: Review) =
                oldItem == newItem
    }

    interface OnReviewClickedListener {

        fun onReviewClicked(review: Review)

    }

}