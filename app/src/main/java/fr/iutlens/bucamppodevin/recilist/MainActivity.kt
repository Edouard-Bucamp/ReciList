package fr.iutlens.bucamppodevin.recilist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.recilist.R
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottom_navigation.setOnNavigationItemSelectedListener { item ->
            when(item.itemId) {
                R.id.add_icon -> {
                    val intent = Intent (this, page_ajout_recette::class.java);
                    startActivity(intent);
                    true
                }
                else -> false
            }
        }
    }


    fun Onclick_carbo(view: View) {
        val intent = Intent(this, PageRecette::class.java);
        startActivity(intent);
    }

    fun Onclick_pain(view: View) {
        val intent = Intent(this, PagePain::class.java);
        startActivity(intent);
    }

    fun Onclick_crumble(view: View) {
        val intent = Intent(this, PageCrumble::class.java);
        startActivity(intent);
    }

    fun Onclick_crepes(view: View) {
        val intent = Intent(this, PageCrepes::class.java);
        startActivity(intent);
    }

    fun Onclick_bolo(view: View) {
        val intent = Intent(this, PageBolo::class.java);
        startActivity(intent);
    }

    fun Onclick_pancakes(view: View) {
        val intent = Intent(this, PagePancakes::class.java);
        startActivity(intent);
    }

}