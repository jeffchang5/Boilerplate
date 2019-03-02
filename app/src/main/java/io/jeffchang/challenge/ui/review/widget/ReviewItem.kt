package io.jeffchang.challenge.ui.review.widget

import android.content.Context
import android.util.AttributeSet
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import io.jeffchang.challenge.R
import io.jeffchang.challenge.ui.common.span
import kotlinx.android.synthetic.main.review_item.view.*


/**
 * Custom view that lists pull requests in a list.
 */
class ReviewItem  @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0)
    : ConstraintLayout(context, attrs, defStyleAttr) {

    var title: String? = null
        set(title) {
            pull_request_item_title_text_view.text = title
            field = title
        }

    var author: String? = null
        set(value) {
            pull_request_item_author_text_view.text =
                    span {
                        +context.getString(R.string.opened_by)
                        +" "
                        foregroundColor(ContextCompat.getColor(context, R.color.colorPrimary)) {
                            +value!!
                        }
                    }.build()
            field = value
        }

    init {
        inflate(context, R.layout.review_item, this)
        layoutParams = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT)
    }

}