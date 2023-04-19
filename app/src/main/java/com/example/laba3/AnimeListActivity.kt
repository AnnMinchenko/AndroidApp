package com.example.laba3

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView

class AnimeListActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anime_list)

        var model1 = Model("a", "a")
        var model2 = Model("b", "b")
        var model3 = Model("c", "c")
        var list=ArrayList<Model>()
        list.add(model1)
        list.add(model2)
        list.add(model3)

        val adapter=AdapterAnime(this, list)
        val recyclerView: RecyclerView = findViewById(R.id.animeRv)
        recyclerView.adapter=adapter

        adapter.onItemClick = {
            val intent = Intent(this, DetailedActivity::class.java)
            intent.putExtra("model", it)
            startActivity(intent)
        }
    }
}