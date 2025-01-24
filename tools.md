# Tools

## Introducción
Este documento describe las herramientas y tecnologías utilizadas en el desarrollo y ejecución del proyecto **Practica3_2**, incluyendo su propósito y configuraciones específicas.

---

## Herramientas Utilizadas

### 1. Java SE
- **Descripción:** Entorno de desarrollo para aplicaciones escritas en el lenguaje de programación Java.
- **Versión:** Java SE 22.
- **Propósito:** Proporciona el runtime y las bibliotecas estándar necesarias para ejecutar el proyecto.
- **Enlace:** [Java SE](https://www.oracle.com/java/technologies/javase-downloads.html)

### 2. JavaFX
- **Descripción:** Framework para desarrollar interfaces gráficas de usuario (GUIs) en Java.
- **Propósito:** Facilita la creación de la interfaz gráfica del proyecto, como se observa en el archivo `Sample.fxml`.
- **Enlace:** [JavaFX](https://openjfx.io)

### 3. JUnit 5
- **Descripción:** Framework para pruebas unitarias en Java.
- **Propósito:** Usado para realizar pruebas unitarias de las clases y métodos del proyecto, como `SampleControllerTest.java`.
- **Enlace:** [JUnit 5](https://junit.org/junit5/)

### 4. IDE Eclipse
- **Descripción:** Entorno de desarrollo integrado para escribir, depurar y gestionar proyectos Java.
- **Propósito:** Desarrollo y gestión del código fuente del proyecto, incluyendo su integración con JavaFX y JUnit.
- **Enlace:** [Eclipse](https://www.eclipse.org/)

---

## Estructura del Proyecto

### Directorio `src`
Contiene el código fuente de la aplicación:
- **`Main.java`:** Punto de entrada principal de la aplicación.
- **`SampleController.java`:** Clase controladora para gestionar los eventos en la interfaz gráfica.
- **`Sample.fxml`:** Archivo que define la interfaz gráfica usando JavaFX.
- **`application.css`:** Archivo para estilizar la interfaz gráfica.
- **`SampleControllerTest.java`:** Clase de pruebas unitarias.

### Dependencias Externas
- **JRE System Library:** Librerías estándar de Java.
- **JavaFX SDK:** Librerías necesarias para ejecutar aplicaciones JavaFX.
- **JUnit 5:** Framework para pruebas unitarias.

---

## Configuración

### JavaFX
1. Descarga e instala el SDK de JavaFX desde [JavaFX Downloads](https://openjfx.io).
2. Configura el `module-path` y añade `--add-modules javafx.controls,javafx.fxml` a las opciones de ejecución.

### JUnit 5
1. Añade las librerías de JUnit 5 al classpath del proyecto.
2. Verifica que los tests se ejecuten correctamente desde el IDE.

---

## Notas Adicionales
- Asegúrate de usar la versión correcta de JavaFX compatible con Java SE 22.
- La estructura del proyecto sigue el estándar modular de Java con un archivo `module-info.java`.
