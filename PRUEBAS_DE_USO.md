# 💻 Pruebas de Uso - Proyecto Palette

## 📌 Objetivo
El objetivo de este documento es describir las pruebas de uso realizadas en la aplicación **Palette** para evaluar cómo los usuarios interactúan con la aplicación y si cumple con las expectativas funcionales.

## 🚀 Entorno de Pruebas
- **Dispositivo**: Emulator Android, Pixel 4 API 30
- **Sistema Operativo**: Android 11
- **IDE**: Android Studio 2021.3.1
- **Lenguaje**: Kotlin
- **Bibliotecas**:
    - `Palette` (para extraer colores)
    - `RecyclerView` (para mostrar imágenes)
    - `ActivityOptions` (para transiciones animadas)

## 📝 Escenarios de Pruebas

### Prueba de Uso 1: Selección de una imagen y visualización en `PaletteActivity`

**Objetivo**: Evaluar si los usuarios pueden seleccionar una imagen del `RecyclerView` y visualizarla correctamente en `PaletteActivity`.

**Procedimiento**:
1. Iniciar la aplicación.
2. Navegar a la pantalla principal y seleccionar una de las imágenes del `RecyclerView`.
3. Confirmar que la imagen seleccionada se muestra en la pantalla de detalles (`PaletteActivity`).

**Resultado Esperado**:
- La imagen seleccionada debe mostrarse correctamente y sin errores.
- La transición animada debe ser fluida y visible.

---

### Prueba de Uso 2: Extracción de colores y aplicación a la interfaz

**Objetivo**: Evaluar si los colores extraídos de la imagen se aplican correctamente a los elementos de la interfaz.

**Procedimiento**:
1. Seleccionar una imagen en `MainActivity` para abrir `PaletteActivity`.
2. Comprobar que los colores extraídos de la imagen se aplican a los elementos de la interfaz, como la `Toolbar`, `StatusBar`, y los `TextViews`.

**Resultado Esperado**:
- Los colores deben ser aplicados correctamente a los elementos de la UI sin errores visuales.

---

### Prueba de Uso 3: Animación de transición al regresar a `MainActivity`

**Objetivo**: Evaluar si la animación de transición es fluida cuando el usuario regresa a `MainActivity`.

**Procedimiento**:
1. Estando en `PaletteActivity`, presionar el botón de regresar.
2. Confirmar que la animación de salida (slide) se ejecuta correctamente.
3. Verificar que `MainActivity` se muestra de nuevo sin errores.

**Resultado Esperado**:
- La animación de transición debe ser fluida.
- `MainActivity` debe mostrarse correctamente al regresar.

---

### Prueba de Uso 4: Usabilidad general del `RecyclerView`

**Objetivo**: Evaluar la interacción general de los usuarios con el `RecyclerView` en `MainActivity`.

**Procedimiento**:
1. Iniciar la aplicación y navegar a la pantalla principal con el `RecyclerView`.
2. Desplazar el `RecyclerView` hacia arriba y hacia abajo para verificar su funcionamiento.
3. Comprobar que las imágenes se cargan correctamente y la navegación es intuitiva.

**Resultado Esperado**:
- El `RecyclerView` debe desplazarse sin problemas.
- Las imágenes deben cargarse correctamente sin retrasos ni errores.

---

## 🧩 Resultado General

En las pruebas de uso realizadas, se verificó que los usuarios pudieron interactuar correctamente con los componentes de la aplicación, incluyendo la selección de imágenes, la visualización de colores extraídos, y las animaciones de transición. La aplicación cumplió con las expectativas en términos de funcionalidad y experiencia del usuario.

---

## 🛠️ Herramientas de Pruebas Utilizadas

- **Android Emulator**: Para probar la aplicación en diferentes versiones de Android.
- **JUnit**: Para pruebas unitarias y validación de la lógica.
- **Espresso**: Para pruebas de interacción de la UI.

---

## ✅ Conclusión

Las pruebas de uso confirmaron que la aplicación **Palette** es fácil de usar y funciona según lo esperado. Los usuarios pudieron seleccionar imágenes, visualizar colores, y navegar entre las pantallas sin inconvenientes. La experiencia de usuario es fluida y las interacciones son intuitivas.
