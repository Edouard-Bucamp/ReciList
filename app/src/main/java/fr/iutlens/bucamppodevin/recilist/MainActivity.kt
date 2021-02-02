package fr.iutlens.bucamppodevin.recilist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import fr.iutlens.bucamppodevin.recilist.*
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


    fun Onclick(view: View) {
        when (view.id) {
            R.id.recipies_btn1 -> {
                val intent = Intent(this, PageRecette::class.java);
                startActivity(intent);
            }
            R.id.btn2 -> {
                val intent = Intent(this, PageBolo::class.java);
                startActivity(intent);
            }
            R.id.btn3 -> {
                val intent = Intent(this, PageCookies::class.java);
                startActivity(intent);
            }
            R.id.btn4 -> {
                val intent = Intent(this, PageCrepes::class.java);
                startActivity(intent);
            }
            R.id.btn5 -> {
                val intent = Intent(this, PageCrumble::class.java);
                startActivity(intent);
            }
            R.id.btn6 -> {
                val intent = Intent(this, PageFondant::class.java);
                startActivity(intent);
            }
            R.id.btn7 -> {
                val intent = Intent(this, PagePain::class.java);
                startActivity(intent);
            }
            R.id.btn8 -> {
                val intent = Intent(this, PageSalade::class.java);
                startActivity(intent);
            }
            R.id.btn9 -> {
                val intent = Intent(this, PagePancakes::class.java);
                startActivity(intent);
            }
            R.id.btn10 -> {
                val intent = Intent(this, PageTartiflette::class.java);
                startActivity(intent);
            }
            R.id.btn11 -> {
                val intent = Intent(this, PageTiramisu::class.java);
                startActivity(intent);
            }
        }
    }



}