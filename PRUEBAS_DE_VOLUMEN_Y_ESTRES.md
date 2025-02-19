# 🚧 Pruebas de Volúmenes y Estrés - Proyecto Palette

## 📌 Objetivo
El objetivo de este documento es describir las pruebas de volumen y estrés realizadas en la aplicación **Palette** para evaluar cómo se comporta la aplicación bajo condiciones de uso intensivo o de carga pesada.

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

### Prueba de Volumen 1: Carga de imágenes en el `RecyclerView`

**Objetivo**: Evaluar cómo la aplicación maneja un gran número de imágenes dentro del `RecyclerView`.

**Procedimiento**:
1. Iniciar la aplicación y cargar un `RecyclerView` con más de 100 imágenes.
2. Verificar si las imágenes se cargan sin errores y si el rendimiento se mantiene estable.
3. Comprobar si se produce algún retraso o cuelgue de la aplicación al cargar o desplazar el `RecyclerView` con muchas imágenes.

**Resultado Esperado**:
- Las imágenes deben cargarse correctamente y mostrarse en el `RecyclerView`.
- El rendimiento debe ser fluido y sin retardos notables, incluso con un volumen alto de imágenes.

---

### Prueba de Estrés 1: Transición entre actividades con múltiples imágenes

**Objetivo**: Evaluar el comportamiento de la aplicación cuando se realiza una transición entre actividades con una gran cantidad de imágenes seleccionadas.

**Procedimiento**:
1. Cargar un gran número de imágenes en `MainActivity`.
2. Seleccionar varias imágenes de forma consecutiva.
3. Navegar entre actividades (`MainActivity` a `PaletteActivity`) repetidamente para comprobar la fluidez de las transiciones y el manejo de la carga de datos.

**Resultado Esperado**:
- Las transiciones deben ser fluidas sin que la aplicación se bloquee o presente errores.
- No debe haber retrasos en la carga de las imágenes o la visualización de los colores extraídos.

---

### Prueba de Volumen 2: Carga intensiva de colores en `PaletteActivity`

**Objetivo**: Evaluar el rendimiento de la aplicación al extraer y mostrar muchos colores de diversas imágenes en la actividad `PaletteActivity`.

**Procedimiento**:
1. Seleccionar una serie de imágenes con una amplia variedad de colores.
2. Abrir `PaletteActivity` para cada imagen seleccionada.
3. Verificar que los colores extraídos se muestren correctamente en los diferentes elementos de la UI (como la `Toolbar`, `StatusBar`, `TextViews`), y evaluar si la aplicación sigue funcionando de manera eficiente.

**Resultado Esperado**:
- La extracción y aplicación de colores debe realizarse sin fallos.
- La aplicación debe ser capaz de manejar la carga de datos de manera eficiente sin experimentar caídas de rendimiento.

---

### Prueba de Estrés 2: Sobrecarga de la memoria al cargar múltiples imágenes y transiciones

**Objetivo**: Evaluar cómo la aplicación maneja el uso intensivo de memoria al cargar muchas imágenes y realizar múltiples transiciones entre actividades.

**Procedimiento**:
1. Cargar más de 100 imágenes en el `RecyclerView` de `MainActivity`.
2. Realizar múltiples interacciones, como seleccionar imágenes, navegar entre actividades y desplazarse por el `RecyclerView`.
3. Verificar si la aplicación presenta caídas de rendimiento, errores o se detiene debido a la falta de memoria.

**Resultado Esperado**:
- La aplicación debe ser capaz de manejar la carga sin bloqueos o caídas de rendimiento.
- La memoria debe ser gestionada correctamente y no debe haber fugas de memoria.

---

## 🧩 Resultado General

Las pruebas de volumen y estrés indicaron que la aplicación **Palette** es capaz de manejar un volumen alto de imágenes y transiciones entre actividades sin experimentar caídas de rendimiento o fallos importantes. Sin embargo, en situaciones extremas de uso intensivo, la aplicación podría experimentar retrasos mínimos en la carga de imágenes.

---

## 🛠️ Herramientas de Pruebas Utilizadas

- **Android Emulator**: Para probar la aplicación en diferentes configuraciones de hardware y versiones de Android.
- **Profiler de Android Studio**: Para monitorear el uso de memoria y rendimiento de la aplicación durante las pruebas de estrés.
- **JUnit**: Para validaciones de pruebas automatizadas y funcionales.

---

## ✅ Conclusión

Las pruebas de volumen y estrés confirmaron que la aplicación **Palette** es relativamente robusta y capaz de manejar grandes cantidades de imágenes y transiciones sin fallos graves. Se recomienda optimizar la gestión de memoria y el rendimiento para cargas extremadamente altas de datos y actividades, aunque no se presentaron fallos críticos durante las pruebas.
