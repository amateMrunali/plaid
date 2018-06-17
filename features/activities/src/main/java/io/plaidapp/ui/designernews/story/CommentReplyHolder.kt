package io.plaidapp.ui.designernews.story

import android.support.design.widget.TextInputLayout
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton

import io.plaidapp.activities.R
import io.plaidapp.designernews.data.api.model.Comment

class CommentReplyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val commentVotes: Button = itemView.findViewById(R.id.comment_votes)
    val replyLabel: TextInputLayout = itemView.findViewById(R.id.comment_reply_label)
    val commentReply: EditText = itemView.findViewById(R.id.comment_reply)
    val postReply: ImageButton = itemView.findViewById(R.id.post_reply)

    fun bindCommentReply(comment: Comment) {
        commentVotes.text = comment.vote_count.toString()
        commentVotes.isActivated = comment.upvoted != null && comment.upvoted
    }

}