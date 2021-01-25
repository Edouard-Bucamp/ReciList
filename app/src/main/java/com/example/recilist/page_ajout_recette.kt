package com.example.recilist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class page_ajout_recette : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_ajout_recette)

        bottom_navigation.setOnNavigationItemSelectedListener { item ->
            when(item.itemId) {
                R.id.vosRecettes -> {
                    val intent = Intent (this, MainActivity::class.java);
                    startActivity(intent);
                    true
                }
                else -> false
            }
        }
    }
}