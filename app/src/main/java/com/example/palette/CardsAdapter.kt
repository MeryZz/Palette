package com.example.palette

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import kotlin.Unit as Unit

class CardsAdapter(var items: ArrayList<Tarjeta>) : RecyclerView.Adapter<CardsAdapter.TarjViewHolder>() {

    lateinit var onClick: (Tarjeta) -> Unit  //Para pasar el objeto Tarjeta

    init {
        this.items = items
    }

    class TarjViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imagen: ImageView = itemView.findViewById(R.id.image1)

        fun bindTarjeta(t: Tarjeta, onClick: (Tarjeta) -> Unit) = with(itemView) {
            imagen.setImageResource(t.imagen)
            setOnClickListener { onClick(t) }  //Llamo al onClick pasando el objeto Tarjeta
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): TarjViewHolder {
        val itemView = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_cards, viewGroup, false)
        return TarjViewHolder(itemView)
    }

    override fun onBindViewHolder(viewHolder: TarjViewHolder, pos: Int) {
        val item = items[pos]
        viewHolder.bindTarjeta(item, onClick)
    }

    override fun getItemCount(): Int {
        return items.size
    }
}
