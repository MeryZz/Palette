# 🧪 Pruebas de Integración - Proyecto Palette

## 📌 Objetivo
El objetivo de este documento es describir las pruebas de integración realizadas en la aplicación **Palette** para asegurar que los distintos componentes del sistema interactúan correctamente.

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

### Prueba de Integración 1: Visualización de las imágenes en el RecyclerView

**Objetivo**: Verificar que las imágenes se muestren correctamente en el `RecyclerView` de `MainActivity`.

**Procedimiento**:
1. Iniciar la aplicación y asegurarse de que `MainActivity` se muestra correctamente.
2. Verificar que el `RecyclerView` contiene todas las imágenes cargadas.
3. Comprobar que cada imagen en el `RecyclerView` tiene el tamaño y formato correcto.

**Resultado Esperado**:
- Las imágenes deben ser visibles y en el formato adecuado.
- El `RecyclerView` debe mostrar todas las imágenes sin errores.

---

### Prueba de Integración 2: Transición a `PaletteActivity`

**Objetivo**: Verificar que la transición entre actividades se realiza correctamente cuando el usuario selecciona una tarjeta.

**Procedimiento**:
1. Tocar una de las imágenes en el `RecyclerView`.
2. Verificar que la animación de transición se ejecuta correctamente.
3. Comprobar que la `PaletteActivity` se abre y muestra la imagen seleccionada.

**Resultado Esperado**:
- La imagen seleccionada debe ser mostrada en `PaletteActivity` y la animación debe funcionar sin fallos.
- La transición debe funcionar tanto en dispositivos con API 21 o superior como en los anteriores.

---

### Prueba de Integración 3: Extracción de los colores con `Palette`

**Objetivo**: Verificar que los colores extraídos de la imagen en `PaletteActivity` se aplican correctamente a los elementos de la UI (como la `Toolbar`, `StatusBar` y `TextViews`).

**Procedimiento**:
1. Abrir `PaletteActivity` tras seleccionar una imagen.
2. Verificar que los colores `Vibrant`, `Muted`, `DarkVibrant`, `LightMuted`, y otros se extraen correctamente.
3. Comprobar que los colores se aplican a los elementos adecuados:
    - `Toolbar` debe tener el color `Vibrant`.
    - `StatusBar` debe tener el color `DarkVibrant`.
    - Los `TextViews` deben tener los colores correspondientes.

**Resultado Esperado**:
- Los colores extraídos deben aplicarse a la `Toolbar`, `StatusBar`, y `TextViews` como se espera.
- Los colores deben ser visibles y cambiar correctamente.

---

## 🧩 Resultado General

En todas las pruebas de integración realizadas, los componentes de la aplicación **Palette** interactuaron correctamente entre sí, sin fallos ni comportamientos inesperados. Las imágenes se mostraron adecuadamente, las transiciones animadas funcionaron bien y los colores extraídos de las imágenes se aplicaron a la interfaz de manera coherente.

---

## 🛠️ Herramientas de Pruebas Utilizadas

- **Android Emulator**: Para probar la aplicación en diferentes versiones de Android.
- **JUnit**: Para pruebas unitarias y validación de la lógica.
- **Espresso**: Para pruebas de interacción de la UI.

---

## ✅ Conclusión

Las pruebas de integración confirmaron que los componentes de la aplicación están funcionando correctamente y se integran de forma eficiente entre sí. No se encontraron errores importantes durante las pruebas.
