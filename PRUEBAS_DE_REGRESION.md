# 🔄 Pruebas de Regresión - Proyecto Palette

## 📌 Objetivo
El objetivo de este documento es describir las pruebas de regresión realizadas en la aplicación **Palette** para asegurarse de que los cambios recientes no hayan introducido nuevos errores en funcionalidades previamente validadas.

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

### Prueba de Regresión 1: Animación de transición al volver a `MainActivity`

**Objetivo**: Verificar que la animación de salida (al presionar el botón "Atrás") no ha sido afectada por los cambios recientes.

**Procedimiento**:
1. En `PaletteActivity`, presionar el botón de volver atrás.
2. Comprobar que la animación de salida se ejecute correctamente.
3. Asegurarse de que `MainActivity` se muestra sin errores y las imágenes se mantienen visibles.

**Resultado Esperado**:
- La animación de salida debe ser fluida y sin interrupciones.
- `MainActivity` debe mostrarse correctamente tras la animación.

---

### Prueba de Regresión 2: Integración de funcionalidades anteriores

**Objetivo**: Verificar que las funcionalidades previas, como la integración con el `RecyclerView`, la correcta apertura de las actividades y la correcta visualización de las imágenes y colores, no se hayan visto afectadas por recientes cambios.

**Procedimiento**:
1. Probar la funcionalidad del `RecyclerView` para asegurarse de que las imágenes se siguen mostrando correctamente.
2. Verificar que la funcionalidad de transición a `PaletteActivity` sigue funcionando correctamente.
3. Comprobar que la paleta de colores se extrae y se aplica correctamente a la interfaz.

**Resultado Esperado**:
- Todas las funcionalidades anteriores deben funcionar correctamente sin errores.
- No debe haber regresión en ninguna parte de la aplicación.

---

## 🧩 Resultado General

Todas las funcionalidades de la aplicación **Palette** fueron validadas correctamente durante las pruebas de regresión. No se encontraron errores ni comportamientos inesperados en las funcionalidades previamente implementadas. La integración de cambios recientes no ha afectado las funcionalidades anteriores.

---

## 🛠️ Herramientas de Pruebas Utilizadas

- **Android Emulator**: Para realizar las pruebas en diferentes dispositivos virtuales.
- **JUnit**: Para pruebas unitarias y validación de la lógica.
- **Espresso**: Para pruebas de interacción de la UI.

---

## ✅ Conclusión

Las pruebas de regresión confirmaron que no se han introducido errores en las funcionalidades existentes tras los cambios recientes en la aplicación **Palette**. La aplicación sigue funcionando como se esperaba en todos los escenarios validados.
