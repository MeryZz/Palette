package com.example.palette

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import kotlin.Unit as Unit

/**
 * Adaptador para el RecyclerView que maneja una lista de tarjetas con imágenes.
 * Se encarga de enlazar los datos con las vistas y manejar los clics en cada tarjeta.
 */
class CardsAdapter(var items: ArrayList<Tarjeta>) : RecyclerView.Adapter<CardsAdapter.TarjViewHolder>() {

    /**
     * Función lambda para manejar el clic en una tarjeta.
     * Recibe como parámetros el objeto Tarjeta y la ImageView asociada, útil para transiciones compartidas.
     */
    lateinit var onClick: (Tarjeta) -> Unit  //Para pasar el objeto Tarjeta

    init {
        this.items = items
    }

    /**
     * ViewHolder que representa cada tarjeta dentro del RecyclerView.
     * Se encarga de enlazar los elementos de la vista con los datos de la tarjeta.
     */
    class TarjViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imagen: ImageView = itemView.findViewById(R.id.image1)

        /**
         * Asigna los datos de la tarjeta a la vista y configura el clic en la tarjeta.
         * @param t Objeto Tarjeta que contiene la imagen.
         * @param onClick Función lambda que maneja el clic en la tarjeta.
         */
        fun bindTarjeta(t: Tarjeta, onClick: (Tarjeta) -> Unit) = with(itemView) {
            imagen.setImageResource(t.imagen)
            setOnClickListener { onClick(t) }  //Llamo al onClick pasando el objeto Tarjeta
        }
    }

    /**
     * Crea una nueva vista para cada tarjeta cuando sea necesario.
     * @param viewGroup El ViewGroup padre donde se añadirá la vista.
     * @param viewType Tipo de vista (no usado en este caso).
     * @return Un nuevo ViewHolder con la vista inflada.
     */
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): TarjViewHolder {
        //Inflar el layout de la tarjeta
        val itemView = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_cards, viewGroup, false)
        return TarjViewHolder(itemView)
    }

    /**
     * Asigna los datos de la tarjeta correspondiente a su ViewHolder.
     * @param viewHolder ViewHolder que se actualizará con los datos.
     * @param pos Posición de la tarjeta en la lista.
     */
    override fun onBindViewHolder(viewHolder: TarjViewHolder, pos: Int) {
        val item = items[pos]
        viewHolder.bindTarjeta(item, onClick) //Para enlazar el objeto Tarjeta con su vista
    }

    /**
     * Devuelve el número total de tarjetas en la lista.
     * @return Número total de tarjetas.
     */
    override fun getItemCount(): Int {
        return items.size
    }
}
