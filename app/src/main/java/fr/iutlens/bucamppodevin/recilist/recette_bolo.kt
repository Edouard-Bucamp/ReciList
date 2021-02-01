package fr.iutlens.bucamppodevin.recilist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recilist.R
import kotlinx.android.synthetic.main.activity_main.*

class PageBolo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_recette)

        bottom_navigation.setOnNavigationItemSelectedListener { item ->
            when(item.itemId) {
                R.id.vosRecettes -> {
                    val intent = Intent (this, MainActivity::class.java);
                    startActivity(intent);
                    true
                }
                R.id.add_icon -> {
                    val intent = Intent (this, page_ajout_recette::class.java);
                    startActivity(intent);
                    true
                }
                else -> false
            }
        }
    }
}