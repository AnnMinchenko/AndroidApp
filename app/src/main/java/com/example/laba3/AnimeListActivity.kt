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

        var model1 = Model("a", "a" , "https://i.etsystatic.com/24426965/r/il/a2c3f6/2528263563/il_fullxfull.2528263563_fiq4.jpg")
        var model2 = Model("b", "b" , "https://imagesyoulike.com/images/00000/32x24/61406.jpg")
        var model3 = Model("c", "c" , "https://imagesxfhdhyyoulike.com/images/00000/32x24/61406.jpg")
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