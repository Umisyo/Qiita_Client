package com.example.qiita.view

import android.content.Context
import android.graphics.Color.RED
import android.media.Image
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import com.example.qiita.R
import com.example.qiita.model.Article

class ArticleView: FrameLayout{
    constructor(context: Context?) : super(context)
    constructor(context: Context?,
    attributeSet: AttributeSet?): super(context, attributeSet)
    constructor(context: Context?,
                attributeSet: AttributeSet?,
                defStyleAttributeSet: Int): super(context, attributeSet, defStyleAttributeSet)
    constructor(context: Context?,
                attributeSet: AttributeSet?,
                defStyleAttributeSet: Int,
                defStyleRes: Int): super(context, attributeSet, defStyleAttributeSet, defStyleRes)

    var plofileImageView: ImageView? = null
    var titleTextView: TextView? = null
    var userNameTextView: TextView? = null

    init {
        LayoutInflater.from(context).inflate(R.layout.view_article, this)
        plofileImageView = findViewById(R.id.profile_image_view) as ImageView
        titleTextView = findViewById(R.id.title_text_view) as TextView
        userNameTextView = findViewById(R.id.user_name_text_view) as TextView
    }

    fun setArticle(article: Article){
        titleTextView?.text = article.title
        userNameTextView?.text = article.user.name

        plofileImageView?.setBackgroundColor(RED)
    }
}