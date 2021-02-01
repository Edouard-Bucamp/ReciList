package fr.iutlens.bucamppodevin.recilist

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.inputmethod.EditorInfo
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recilist.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.bottom_navigation
import kotlinx.android.synthetic.main.activity_page_ajout_recette.*

class page_ajout_recette : AppCompatActivity(), TextView.OnEditorActionListener {
    val list = mutableListOf<String>()

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_ajout_recette)
        recycler.setNestedScrollingEnabled(false)

        recyclerView.layoutManager = LinearLayoutManager(this)

        recyclerView.adapter = list_ingredients(list, R.layout.list_ingredients, null, null)


        editText.setOnEditorActionListener(this)
        list.add("essai")


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

        recyclerView.adapter =
            list_ingredients(
                list,
                R.layout.list_ingredients,
                null,
                this::removeAt
            )
    }

    override fun onEditorAction(textView: TextView?, actionId: Int, keyEvent: KeyEvent?): Boolean {
        if(actionId == EditorInfo.IME_ACTION_DONE){ // Si on a validé le texte saisi
            list.add(editText.text.toString()) // On ajoute le texte àla liste
                    recyclerView.adapter?.notifyDataSetChanged() // On prévientque la liste a changé et doit être réaffichée
            editText.text.clear(); // On efface le texte, pour faire dela place pour le prochain élément
                    return true;
        }
        return false;
    }

    private fun removeAt(pos: Int): Boolean {
        list.removeAt(pos)
        recyclerView.adapter?.notifyDataSetChanged()
        return true
    }

}