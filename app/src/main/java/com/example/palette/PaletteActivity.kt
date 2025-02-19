package com.example.palette

import android.graphics.BitmapFactory
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.palette.graphics.Palette

/**
 * Actividad `PaletteActivity`, encargada de mostrar una imagen seleccionada junto con
 * una paleta de colores extraída de la misma.
 */
class PaletteActivity : AppCompatActivity() {

    /**
     * Método `onCreate`, se ejecuta al crear la actividad.
     * Se encarga de configurar la interfaz, aplicar animaciones y extraer colores de la imagen.
     * @param savedInstanceState Estado guardado de la actividad, si existe.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_palette)

        //Configurar la transición de entrada (fade)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }

        //Para recibir la imagen desde MainActivity
        val imageRes = intent.getIntExtra("imageRes", R.drawable.image1)

        //Configurar la imagen
        val imageView = findViewById<ImageView>(R.id.imageView)
        imageView.setImageResource(imageRes)

        //Usando la librería Palette para obtener los colores
        val bitmap = BitmapFactory.decodeResource(resources, imageRes)
        val palette = Palette.from(bitmap).generate()

        //Para obtener los colores principales
        val vibrant = palette.getVibrantColor(Color.BLACK)
        val darkVibrant = palette.getDarkVibrantColor(Color.BLACK)
        val lightVibrant = palette.getLightVibrantColor(Color.BLACK)
        val muted = palette.getMutedColor(Color.BLACK)
        val darkMuted = palette.getDarkMutedColor(Color.BLACK)
        val lightMuted = palette.getLightMutedColor(Color.BLACK)

        //Para actualizar la ToolBar con el color vibrant
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        toolbar.setBackgroundColor(vibrant)  // Color de la ToolBar

        //Para cambiar el color de la StatusBar solo (API 21 o superior)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = darkVibrant  // Color de la StatusBar
        }

        //Para actualizar los TextViews con los colores
        findViewById<TextView>(R.id.textViewLightVibrant).setBackgroundColor(lightVibrant)
        findViewById<TextView>(R.id.textViewMuted).setBackgroundColor(muted)
        findViewById<TextView>(R.id.textViewDarkMuted).setBackgroundColor(darkMuted)
        findViewById<TextView>(R.id.textViewLightMuted).setBackgroundColor(lightMuted)

        //Para la animación del cambio de la imagen (changeImageTransform) (API 21 o superior)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val imageView = findViewById<ImageView>(R.id.imageView)
            imageView.transitionName = "tranphoto"
        }
    }

    /**
     * Método `onBackPressed`, ejecutado cuando el usuario presiona el botón de volver atrás.
     * Se aplica una animación de salida tipo "slide".
     */
    override fun onBackPressed() {
        super.onBackPressed()

        //Para la animación de salida (slide)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
        }
    }
}
