package fr.iutlens.bucamppodevin.recilist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import fr.iutlens.bucamppodevin.recilist.R

class list_ingredients(private val dataSet: List<String>,
                       private val list_ingredients_layout: Int,
                       private val onItemClickListener: ((Int) -> Unit)?,
                       private val onItemLongClickListener: ((Int) -> Boolean)?):
    RecyclerView.Adapter<list_ingredients.ViewHolder>() {


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.textView)
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(list_ingredients_layout, viewGroup, false)

        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.textView.text =dataSet[position]

        // Set listeners on item (?.let content is executed only when listener is not null)
        onItemClickListener?.let {
            viewHolder.itemView.setOnClickListener { it(position) }
        }

        onItemLongClickListener?.let {
            viewHolder.itemView.setOnLongClickListener { it(position) }
        }
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataSet.size
}