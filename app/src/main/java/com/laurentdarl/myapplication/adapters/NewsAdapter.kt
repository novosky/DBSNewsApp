package com.laurentdarl.myapplication.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.laurentdarl.myapplication.databinding.ItemArticlePreviewBinding
import com.laurentdarl.myapplication.models.Article


class NewsAdapter (var context: Context, var List: List<Article>):
    RecyclerView.Adapter<NewsAdapter.ArticleViewHolder>() {

    inner class ArticleViewHolder(private val binding:ItemArticlePreviewBinding):
        RecyclerView.ViewHolder(binding.root) {

            fun bind(article: Article) {
                binding.apply {
                  Glide.with(context).load(article.urlToImage).into(ivArticleImage)
                  tvTitle.text = article.title.toString()
                  tvCaption.text = article.caption.toString()
                  tvWriter.text = article.writer.toString()
                  tvDateTime.text = article.dateTime.toString()

                }
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
       val binding: ItemArticlePreviewBinding = ItemArticlePreviewBinding.inflate(LayoutInflater.from(parent.context))
        return ArticleViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        holder.bind(List[position])

    }

    override fun getItemCount(): Int {
        return List.size

    }

}