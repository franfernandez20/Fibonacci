# Fibonacci Service

Se ha implementado un Servicio REST con SpringBoot + Tomcat embebido.
Se ha tratado de seguir un patrón MVC haciendo uso en este caso de controllador y servicio. 
En relación a la funcion de fibonacci he creado 3 diferentes implementaciones. Las 3 clases que implementan la función implementan una interfaz que es la que se inyecta en el servicio distinguiendo la implementación en cada caso gracias a la anotación de Spring @Qualifier
 
 Se capturan 3 peticiones GET:
* http://localhost:8080/fibonacci/recursive /{num}
* http://localhost:8080/fibonacci/recursive-cached /{num}
* http://localhost:8080/fibonacci/iterative/{num}
 
## Implementaciones
#### Fibonacci Recursiva
Función muy poco eficiente se añade a modo de comprobacion de la mejora que produce el uso de algún método de memorización. 

### Fibonacci Recursiva con cache
Para esta implementación se utiliza un HashMap estático a modo de ejemplo de concepto de cache. Se usa este método para no complicar el ejemplo no me parece una solución en un caso real. 
Gracias a mantener calculos previos reducimos la complejidad de la función de O(2^N) a O(N).  

### Fibonacci Iterativa, programación funcional y Lambda functions
Para esta implementación se usa la librería Stream y funciones lambda para pasarle a alguno de sus métodos. El código esta comentado, la idea es partir de un array de dos elementos e ir creando nuevos a partir de él y su suma. De esta forma calculamos la serie de Fibonacci y aplicamos una reduccion para quedarnos con el último valor que será el número de Fibonacci que buscamos.

## Ejecución

La compilación con **mvn install** crea un jar ejecutable sobre JVM. El puerto expuesto es el 8080.


