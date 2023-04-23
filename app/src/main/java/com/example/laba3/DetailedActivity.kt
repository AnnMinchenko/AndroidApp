package com.example.laba3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction

@Suppress("DEPRECATION")
class DetailedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed)

        val model = intent.getParcelableExtra<Model>("model")

        val ft: FragmentTransaction = supportFragmentManager.beginTransaction()
        val mFragment: DetailedFragment? = model?.let { DetailedFragment.newInstance(model.title, model.desc, model.image) }
        if (mFragment != null) {
            ft.replace(R.id.info_fragment, mFragment)
            ft.commit()
        }
    }
}