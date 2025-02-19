# 📱 Proyecto Palette

**Palette** es una aplicación para dispositivos Android que permite cargar imágenes, extraer colores dominantes de las imágenes y visualizar estos colores de manera dinámica en la interfaz de usuario. La aplicación utiliza el `Palette API` para extraer colores y aplicar diferentes combinaciones de colores a elementos de la UI como la barra de herramientas y la barra de estado.

---

## 🚀 Objetivo

El objetivo principal del proyecto es crear una aplicación móvil que permita a los usuarios interactuar con imágenes y extraer colores dominantes de manera fluida y eficiente. Además, el proyecto incluye pruebas rigurosas para garantizar el buen funcionamiento del sistema bajo diferentes escenarios.

---

## 🛠️ Funcionalidades Principales

- **Visualización de imágenes**: Se utilizan imágenes cargadas desde recursos internos para mostrarlas en un `RecyclerView`.
- **Extracción de colores**: La aplicación extrae y muestra colores dominantes (como `Vibrant`, `Muted`, `DarkVibrant`, etc.) de las imágenes usando la biblioteca `Palette`.
- **Transiciones animadas**: Se implementan transiciones animadas entre actividades al seleccionar imágenes.
- **Interacción del usuario**: El usuario puede seleccionar imágenes y visualizar los colores dominantes extraídos.

---

## 📋 Requisitos

- **Dispositivo**: Emulator Android, Pixel 4 API 30
- **Sistema Operativo**: Android 11
- **IDE**: Android Studio 2021.3.1
- **Lenguaje**: Kotlin
- **Bibliotecas**:
    - `Palette` (para extraer colores)
    - `RecyclerView` (para mostrar imágenes)
    - `ActivityOptions` (para transiciones animadas)

---

## 📂 Documentación

- [Documentación](./DOCUMENTACION.md) 📖: Documentación del proyecto Palette.

---

## 🏗️ Estrategias de Pruebas

Hay un plan de pruebas para garantizar la calidad y el rendimiento de la aplicación en los diferentes escenarios posibles que puedan haber:

- [Pruebas de Integración](./PRUEBAS_INTEGRACION.md) 
- [Pruebas de Regresión](./PRUEBAS_REGRESION.md) 
- [Pruebas de Volumen y Estrés](./PRUEBAS_VOLUMEN_ESTRES.md) 
- [Pruebas de Seguridad](./PRUEBAS_SEGURIDAD.md) 
- [Pruebas de Uso](./PRUEBAS_USO.md) 

---

## 🧩 Resultado General

En todas las pruebas realizadas, la aplicación **Palette** mostró un rendimiento estable y consistente, sin errores graves o caídas de rendimiento. Las funcionalidades de visualización de imágenes, extracción de colores, y transiciones animadas se comportaron correctamente, incluso bajo condiciones de carga pesada.

---

## ✅ Conclusión

Las pruebas realizadas han asegurado que la aplicación **Palette** funciona correctamente en distintos escenarios de uso, manejo de grandes volúmenes de datos y bajo pruebas de estrés. La aplicación es robusta y no presenta fallos significativos en su flujo de trabajo o en la interacción con el usuario.

---

## 📱 Cómo Ejecutar el Proyecto

1. Clona el repositorio del proyecto.
2. Abre el proyecto en Android Studio.
3. Compila y ejecuta la aplicación en el emulador o en un dispositivo Android físico.
