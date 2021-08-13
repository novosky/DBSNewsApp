package com.laurentdarl.myapplication.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.laurentdarl.myapplication.models.Article

@Dao
interface NewsDao {
    @Insert
    suspend fun upsert(article: Article): Long

    @Query("SELECT * FROM `news article`")
    fun getAllArticles(): LiveData<List<Article>>

    @Delete
    suspend fun deleteArticle(article: Article)

}