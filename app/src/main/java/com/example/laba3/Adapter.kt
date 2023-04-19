package com.example.laba3

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.laba3.databinding.ActivityAnimeListBinding
import com.example.laba3.databinding.ActivityMainBinding
import com.example.laba3.databinding.RowAnimeBinding

class AdapterAnime(private val context: Context, private val animeArrayList: ArrayList<Model>):RecyclerView.Adapter<AdapterAnime.HolderAnime>(){

    var onItemClick : ((Model) ->Unit)? = null

  //  private lateinit var binding: RowAnimeBinding

    /*
    constructor(animeArrayList: ArrayList<Model>, context: Context) : super() {
        this.animeArrayList = animeArrayList
        this.context = context
    }*/

    inner class HolderAnime(animeBinding: RowAnimeBinding):RecyclerView.ViewHolder(animeBinding.root){
      //Zz  val imageView=binding.imageView

  //      private val binding= RowAnimeBinding
        val titleTv=animeBinding.titleTv
        val descTv=animeBinding.descTv
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderAnime {
        val binding=RowAnimeBinding.inflate(LayoutInflater.from(context),parent, false)
        return HolderAnime(binding)
    }

    override fun getItemCount(): Int {
        return animeArrayList.size
    }

    override fun onBindViewHolder(holder: HolderAnime, position: Int) {
        val model=animeArrayList[position]
        val title=model.title
        val desc=model.desc
       // val image=model.image

        holder.titleTv.text=title
        holder.descTv.text=desc
       // holder.imageView.src=image

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(model)
        }

    }


}