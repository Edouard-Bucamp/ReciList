package com.example.recilist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottom_navigation.setOnNavigationItemSelectedListener { item ->
            when(item.itemId) {
                R.id.vosRecettes -> {
                    Log.d("menu","choix 1")
                    true
                }
                R.id.add_icon -> {
                    Log.d("menu","choix 2")
                    true
                }
                else -> false
            }
        }

}

    fun Onclick(view: View) {
        val intent = Intent (this, PageRecette::class.java);
        startActivity(intent);
    }

}