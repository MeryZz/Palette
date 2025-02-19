package com.example.palette

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.appcompat.widget.Toolbar
import android.app.ActivityOptions
import android.os.Build
import android.util.Pair

/**
 * Actividad principal que muestra una lista de imágenes en un RecyclerView.
 * Al seleccionar una imagen, se abre `PaletteActivity` mostrando la imagen con su paleta de colores.
 */
class MainActivity : AppCompatActivity() {

    /**
     * Método llamado al crear la actividad. Inicializa la interfaz y configura el RecyclerView.
     * @param savedInstanceState Estado guardado de la actividad, si existe.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.appbar)
        setSupportActionBar(toolbar)

        val items = ArrayList<Tarjeta>()
        items.add(Tarjeta(R.drawable.image1))
        items.add(Tarjeta(R.drawable.image2))
        items.add(Tarjeta(R.drawable.image3))
        items.add(Tarjeta(R.drawable.image4))
        items.add(Tarjeta(R.drawable.image5))
        items.add(Tarjeta(R.drawable.image6))
        items.add(Tarjeta(R.drawable.image7))
        items.add(Tarjeta(R.drawable.image8))

        val recView = findViewById<RecyclerView>(R.id.recview)
        recView.setHasFixedSize(true)

        val adaptador = CardsAdapter(items)
        recView.adapter = adaptador
        recView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        /**
         * Manejar el clic en una tarjeta para abrir `PaletteActivity`.
         * Se pasa la imagen seleccionada y se utiliza una transición compartida en API >= 21.
         */
        adaptador.onClick = { tarjeta ->
            val intent = Intent(this, PaletteActivity::class.java)
            intent.putExtra("imageRes", tarjeta.imagen)  //Paso la imagen seleccionada

            //Para API >=21
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                // Definir la transición compartida para la imagen
                val imageView = findViewById<ImageView>(R.id.image1)
                val options = ActivityOptions.makeSceneTransitionAnimation(
                    this,
                    Pair.create(imageView, "tranphoto")  //El nombre de la transición debe coincidir con el nombre en el XML
                )

                startActivity(intent, options.toBundle())
            } else {
                startActivity(intent)
            }
        }
    }
}
