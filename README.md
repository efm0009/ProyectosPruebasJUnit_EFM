# ProyectoPruebasJUnit
Este proyecto demuestra cómo configurar y usar pruebas unitarias con JUnit en Eclipse. Utilizamos una clase sencilla llamada `Calculadora` y escribimos pruebas unitarias para verificar su correcto funcionamiento.

## Estructura del Proyecto
ProyectoPruebasJUnit/ 
├── src/ │ └── Calculadora.java └── test/ (o en src/test/java si usas Maven/Gradle) └── CalculadoraTest.java


## Pasos para Configuración Inicial

1. **Crear un proyecto en Eclipse**  
   - File > New > Java Project.
   - Nombra el proyecto: `ProyectoPruebasJUnit`.
   - Agregar JUnit al classpath:  
     Haz clic derecho en el proyecto > Build Path > Add Libraries... > Selecciona JUnit (versión 4 o 5).

2. **Crear la clase a probar**  
   - Crea una clase llamada `Calculadora` en `src/`.

```java
public class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }
}

