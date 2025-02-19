# Documentación del Proyecto Palette

## 📌 Descripción
Palette es una aplicación para visualizar imágenes y generar su paleta de colores dominante utilizando la biblioteca **Android Palette**. La aplicación permite seleccionar una imagen y ver los colores extraídos de ella.

## 🛠️ Tecnologías Utilizadas
- **Lenguaje**: Kotlin
- **IDE**: Android Studio
- **Bibliotecas**:
    - `Palette` para extraer colores de las imágenes
    - `RecyclerView` para mostrar una lista de imágenes
    - `ActivityOptions` para transiciones animadas

## 🚀 Características
- Mostrar una lista de imágenes en un `RecyclerView`.
- Al seleccionar una imagen, se abre una nueva actividad (`PaletteActivity`) mostrando la imagen y su paleta de colores.
- Transiciones animadas entre actividades.
- Cambio de color en la `Toolbar` y `StatusBar` según los colores extraídos.

## 📂 Estructura del Proyecto
/com.example.palette
│── MainActivity.kt # Pantalla principal con el RecyclerView
│── PaletteActivity.kt # Muestra la imagen seleccionada y su paleta de colores
│── CardsAdapter.kt # Adaptador para el RecyclerView
│── Tarjeta.kt # Modelo de datos para las tarjetas
│── res/layout/activity_main.xml
│── res/layout/activity_palette.xml
│── res/layout/item_cards.xml
│── res/drawable/ # Imágenes de prueba

## Clases Principales

### 🔹 `MainActivity`
Encargada de mostrar un `RecyclerView` con imágenes en forma de tarjetas.  
**Funciones principales**:
- Configurar la `Toolbar`.
- Inicializar la lista de imágenes (`ArrayList<Tarjeta>`).
- Manejar la navegación a `PaletteActivity` con una transición animada.

### 🔹 `PaletteActivity`
Muestra la imagen seleccionada y extrae los colores utilizando `Palette`.  
**Funciones principales**:
- Aplicar animaciones de entrada/salida.
- Extraer los colores `Vibrant`, `Muted`, `DarkVibrant`, `LightMuted`, etc.
- Aplicar los colores extraídos a la `Toolbar`, `StatusBar` y `TextViews`.

### 🔹 `CardsAdapter`
Adaptador para gestionar la lista de imágenes en `RecyclerView`.  
**Funciones principales**:
- Inflar el diseño de cada tarjeta (`item_cards.xml`).
- Asignar la imagen correspondiente.
- Manejar el evento `onClick` para abrir `PaletteActivity`.

## 🎨 Uso de la Biblioteca `Palette`
La clase `PaletteActivity` utiliza la API `Palette` para analizar los colores dominantes de la imagen seleccionada.