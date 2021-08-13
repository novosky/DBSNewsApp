package com.laurentdarl.myapplication.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.laurentdarl.myapplication.models.Article

@Database(
    entities = [Article::class],
    version = 1
)
abstract class NewsDatabase: RoomDatabase() {
    abstract fun getArticleDao()
    companion object{
        private fun createDatabase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                NewsDatabase::class.java,
                "news_db.db"
            ).build()
    }

}