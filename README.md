# lab1progra

# Ejercicio en Clase 3 – Modularización en Java
## Curso: Programación 1

---


---

## Parte 1 – Análisis del Programa Original

En esta sección deben analizar el programa entregado.

## Identificación de Tareas Repetitivas

Responder:

- ¿Qué partes del código pueden convertirse en métodos?
 Las partes de codigo que se han convertido a metodos fueron las opciones.
- ¿Qué bloques de código se repiten?
 No hay ninguno.

- ¿Qué responsabilidades pueden separarse?

 Posibles tareas:

- Agregar estudiante.
- Mostrar estudiantes.
- Calcular promedio.
- Mostrar estudiante con mayor calificación.

Explicar por qué dividir estas tareas mejora el programa.
Al dividirlas el programa se hace mas entendible y se puede mejor de una menera mas eficas
---

# ¿Qué variables deberían ser globales?

Las variables estudiantes, calificaciones y scanner deben ser globales porque son necesarias en varios métodos a lo largo de toda la ejecución del programa. Los datos de los estudiantes deben persistir desde que se agregan hasta que se consultan o se calcula el promedio, por lo que no pueden perderse al terminar un método.

¿Cuáles deberían ser locales?
Variables como nombre, calificacion, suma, promedio, maxCalificacion y opcion deben ser locales, ya que solo tienen sentido dentro del método donde se usan y no necesitan ser compartidas con el resto del programa.
¿Por qué?

Alcance (scope): Una variable global es visible y accesible desde cualquier método de la clase, mientras que una variable local solo existe dentro del método donde fue declarada. Usar variables locales cuando sea posible reduce la posibilidad de interferencias entre métodos.

Tiempo de vida: Las variables locales se crean cuando el método inicia y se eliminan cuando el método termina, liberando memoria automáticamente. Las globales permanecen en memoria durante toda la ejecución del programa, por lo que deben usarse solo cuando realmente sea necesario.

Riesgos de modificar datos globales accidentalmente: Al ser accesibles desde cualquier método, las variables globales pueden ser modificadas sin intención, causando errores difíciles de detectar. Por ejemplo, si un método modifica la lista de estudiantes de forma inesperada, todos los demás métodos que dependen de esa lista se verán afectados.
---


 # Parte 4 – Preguntas de Reflexión

Responder con sus propias palabras.

¿Qué ventajas tiene dividir el código en métodos?

Organización: Al dividir el código en métodos, cada uno tiene una responsabilidad clara y específica, lo que hace que el programa esté mejor estructurado y sea más fácil de navegar. En lugar de tener todo el código en un solo bloque, cada tarea tiene su propio espacio definido.

Reutilización: Un método creado para una tarea específica puede ser llamado desde diferentes partes del programa sin necesidad de reescribir el código. Por ejemplo, el método pausa() se reutiliza después de cada opción del menú sin duplicar código.

Mantenimiento: Si se necesita corregir un error o mejorar una funcionalidad, solo se modifica el método correspondiente sin afectar el resto del programa. Esto hace que las actualizaciones sean más rápidas y menos propensas a introducir nuevos errores.

Claridad: Al estar el código dividido en métodos con nombres descriptivos, cualquier persona que lo lea puede entender qué hace cada parte sin necesidad de analizar cada línea. El main queda limpio y funciona como un resumen del flujo general del programa, facilitando su comprensión tanto para el programador original como para otros que trabajen con él en el futuro.
---

¿Por qué no es recomendable usar muchas variables globales?

Posibilidad de errores inesperados: Cualquier método puede modificar una variable global en cualquier momento, incluso sin intención. Esto puede causar que el programa se comporte de manera extraña y difícil de predecir, ya que un cambio en un método puede afectar el funcionamiento de otro sin que sea evidente.

Dificultad para depurar: Cuando una variable global tiene un valor incorrecto, es necesario revisar todos los métodos que la utilizan para encontrar dónde ocurrió el error. Esto hace que encontrar y corregir fallos sea mucho más lento y complicado que si la variable fuera local.

Dependencia entre métodos: Al compartir variables globales, los métodos dejan de ser independientes entre sí. Esto significa que si se modifica un método, puede afectar el comportamiento de otros, haciendo el programa más frágil y difícil de mantener o reutilizar en el futuro.

