package com.laurentdarl.myapplication.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "news article"
)
data class Article(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val writer: String,
    val title: String,
    val caption: String,
    val category: String,
    val urlToImage: String,
    val tag: List<String>,
    val url: String,
    val dateTime: Int

)