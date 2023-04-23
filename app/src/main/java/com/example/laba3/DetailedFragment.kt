package com.example.laba3

import android.accounts.AuthenticatorDescription
import android.icu.text.CaseMap.Title
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

private const val ARG_PARAM1 = "title"
private const val ARG_PARAM2 = "description"
private const val ARG_PARAM3 = "image"

class DetailedFragment : Fragment() {
    private var title: String? = null
    private var description: String? = null
    private var image: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            title = it.getString(ARG_PARAM1)
            description = it.getString(ARG_PARAM2)
            image = it.getString(ARG_PARAM3)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detailed, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance(title: String, description: String, image: String) =
            DetailedFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, title)
                    putString(ARG_PARAM2, description)
                    putString(ARG_PARAM3, image)
                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
            val title1 : TextView = view.findViewById(R.id.detTitleTv)
            val description1 : TextView = view.findViewById(R.id.detDescriptionTv)
            val image1 : ImageView = view.findViewById(R.id.detailedIv)

            title1.text = title
            description1.text = description
            Picasso.get().load(image).resize(286, 318).centerCrop().into(image1)
    }
}