package com.example.laba3

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class FavouriteActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favourite)

        var model1 = Model("a", "a" , "https://i.pinimg.com/originals/56/bd/3d/56bd3d196b190c2dcfadaa74d01dbdf3.jpg")
        var list=ArrayList<Model>()
        list.add(model1)

        val adapter=AdapterAnime(this, list)
        val recyclerView: RecyclerView = findViewById(R.id.favAnimeRv)
        recyclerView.adapter=adapter
    }
}