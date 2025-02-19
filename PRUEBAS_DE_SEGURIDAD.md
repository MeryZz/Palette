# 🔒 Pruebas de Seguridad - Proyecto Palette

## 📌 Objetivo
El objetivo de este documento es describir las pruebas de seguridad realizadas en la aplicación **Palette** para garantizar que los datos y las interacciones de los usuarios estén protegidos contra vulnerabilidades y accesos no autorizados.

## 🚀 Entorno de Pruebas
- **Dispositivo**: Emulator Android, Pixel 4 API 30
- **Sistema Operativo**: Android 11
- **IDE**: Android Studio 2021.3.1
- **Lenguaje**: Kotlin
- **Bibliotecas**:
    - `Palette` (para extraer colores)
    - `RecyclerView` (para mostrar imágenes)
    - `ActivityOptions` (para transiciones animadas)
    - `Room Database` (para almacenamiento de datos)
    - `Firebase` (para autenticación de usuarios)

## 📝 Escenarios de Pruebas

### Prueba de Seguridad 1: Autenticación de usuarios con Firebase

**Objetivo**: Verificar que el sistema de autenticación de Firebase esté configurado correctamente y que los usuarios no puedan acceder a áreas protegidas sin autenticarse.

**Procedimiento**:
1. Iniciar la aplicación y navegar a la pantalla de inicio de sesión.
2. Intentar acceder a áreas protegidas sin iniciar sesión.
3. Verificar que se redirige a la pantalla de inicio de sesión y no permite acceder a la funcionalidad restringida.
4. Intentar iniciar sesión con credenciales incorrectas y verificar que se muestra un mensaje de error apropiado.

**Resultado Esperado**:
- Los usuarios no pueden acceder a áreas protegidas sin autenticarse correctamente.
- Los mensajes de error deben ser claros y apropiados cuando las credenciales sean incorrectas.

---

### Prueba de Seguridad 2: Validación de Entrada de Datos

**Objetivo**: Verificar que las entradas de datos proporcionadas por los usuarios se validen adecuadamente para evitar vulnerabilidades como inyección de SQL o XSS.

**Procedimiento**:
1. Navegar a las pantallas de entrada de datos, como formularios de contacto o configuraciones.
2. Ingresar datos maliciosos en los campos de texto.
3. Enviar los formularios y verificar que la aplicación maneja los datos correctamente sin ejecutarse código malicioso.

**Resultado Esperado**:
- La aplicación debe validar y limpiar cualquier entrada de datos potencialmente peligrosa.
- No deben ejecutarse scripts ni comandos no deseados dentro de la aplicación.

---

### Prueba de Seguridad 3: Autorización de Acceso a Funcionalidades

**Objetivo**: Verificar que los usuarios solo puedan acceder a las funcionalidades que están autorizados a utilizar según su nivel de acceso.

**Procedimiento**:
1. Iniciar sesión con diferentes tipos de usuarios (administradores, usuarios regulares, etc.).
2. Intentar acceder a funcionalidades restringidas (por ejemplo, administración de usuarios) con un usuario que no tenga los permisos adecuados.
3. Verificar que la aplicación redirige o muestra un mensaje de error si el usuario no tiene los permisos necesarios para acceder a esa funcionalidad.

**Resultado Esperado**:
- Los usuarios deben tener acceso únicamente a las funcionalidades que están autorizados a utilizar según su rol.
- Deben mostrarse mensajes de error o redirección adecuada en caso de acceso no autorizado.

---

## 🧩 Resultado General

Las pruebas de seguridad realizadas han confirmado que la aplicación **Palette** está adecuadamente protegida contra vulnerabilidades comunes, como la inyección de SQL, XSS y el acceso no autorizado a datos sensibles. La autenticación de usuarios funciona correctamente, y las entradas de datos son validadas para evitar exploits.

---

## 🛠️ Herramientas de Pruebas Utilizadas

- **Android Emulator**: Para probar la aplicación en diferentes versiones de Android.
- **Firebase Authentication**: Para realizar pruebas de autenticación y autorización de usuarios.
- **OWASP ZAP**: Para realizar pruebas de penetración y detectar posibles vulnerabilidades en la aplicación.
- **Burp Suite**: Para interceptar y analizar el tráfico de la aplicación y verificar la seguridad de las comunicaciones.

---

## ✅ Conclusión

Las pruebas de seguridad han sido satisfactorias, y la aplicación **Palette** cumple con los requisitos básicos de protección de datos y autenticación. No se encontraron vulnerabilidades importantes durante las pruebas. Es recomendable continuar realizando pruebas de seguridad periódicas, especialmente después de realizar actualizaciones en el código o integrar nuevas funcionalidades.
