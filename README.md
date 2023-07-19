"# JAVA-COMPOSITE-PATTERN" 🚀
--------------------- 


![image](https://github.com/D-Perez85/JAVA-FACTORY-METHOD-PATTERN/assets/77124855/ed22828a-241f-4e7f-8125-bc296d7398dc)

Composite es un patrón de diseño estructural que te permite componer objetos en estructuras de árbol y trabajar con esas estructuras como si fueran objetos individuales.

## Problema
El uso del patrón Composite sólo tiene sentido cuando el modelo central de tu aplicación puede representarse en forma de árbol. 
Por ejemplo, imagina que tienes dos tipos de objetos: Productos y Cajas. 

Una Caja puede contener varios Productos así como cierto número de Cajas más pequeñas. Estas Cajas pequeñas también pueden contener algunos Productos o incluso Cajas más pequeñas, y así sucesivamente.


Digamos que decides crear un sistema de pedidos que utiliza estas clases. Los pedidos pueden contener productos sencillos sin envolver, así como cajas llenas de productos... y otras cajas. 

¿Cómo determinarás el precio total de ese pedido?


![image](https://github.com/D-Perez85/JAVA-COMPOSITE-PATTERN/assets/77124855/8c1173a8-175e-41fc-87d7-a543798b6c95)


Puedes intentar la solución directa: desenvolver todas las cajas, repasar todos los productos y calcular el total. 

Esto sería viable en el mundo real; pero en un programa no es tan fácil como ejecutar un bucle, ya que tienes que conocer de antemano las clases de Productos y Cajas a iterar, el nivel de anidación de las cajas y otros detalles desagradables. 

Todo esto provoca que la solución directa sea demasiado complicada, o incluso imposible.


## Solución
El patrón Composite sugiere que trabajes con Productos y Cajas a través de una interfaz común que declara un método para calcular el precio total. ¿Cómo funcionaría este método? 

Para un producto, sencillamente devuelve el precio del producto. 
Para una caja, recorre cada artículo que contiene la caja, pregunta su precio y devuelve un total por la caja. 


Si uno de esos artículos fuera una caja más pequeña, esa caja también comenzaría a repasar su contenido y así sucesivamente, hasta que se calcule el precio de todos los componentes internos. Una caja podría incluso añadir costos adicionales al precio final, como costos de empaquetado.

![image](https://github.com/D-Perez85/JAVA-COMPOSITE-PATTERN/assets/77124855/5e2ea131-b2a9-49a9-9761-c9619a17b7ce)

La gran ventaja de esta solución es que no tienes que preocuparte por las clases concretas de los objetos que componen el árbol, no tienes que saber si un objeto es un producto simple o una sofisticada caja. 

Puedes tratarlos a todos por igual a través de la interfaz común. Cuando invocas un método, los propios objetos pasan la solicitud a lo largo del árbol.


## Analogía en el mundo real - Un ejemplo de estructura militar.

Los ejércitos de la mayoría de países se estructuran como jerarquías. Un ejército está formado por varias divisiones; una división es un grupo de brigadas y una brigada está formada por pelotones, que pueden dividirse en escuadrones. 

Por último, un escuadrón es un pequeño grupo de soldados reales. Las órdenes se dan en la parte superior de la jerarquía y se pasan hacia abajo por cada nivel hasta que todos los soldados saben lo que hay que hacer.

![image](https://github.com/D-Perez85/JAVA-COMPOSITE-PATTERN/assets/77124855/6064943d-377c-4493-989d-847a771854bc)


##  Aplicabilidad
:pushpin: cuando tengas que implementar una estructura de objetos con forma de árbol. El patrón Composite te proporciona dos tipos de elementos básicos que comparten una interfaz común: hojas simples y contenedores complejos. Un contenedor puede estar compuesto por hojas y por otros contenedores. 
Esto te permite construir una estructura de objetos recursivos anidados parecida a un árbol.

:pushpin: cuando quieras que el código cliente trate elementos simples y complejos de la misma forma.	Todos los elementos definidos por el patrón Composite comparten una interfaz común. Utilizando esta interfaz, el cliente no tiene que preocuparse por la clase concreta de los objetos con los que funciona.

## Cómo implementarlo
-	Asegúrate de que el modelo central de tu aplicación pueda representarse como una estructura de árbol. Intenta dividirlo en elementos simples y contenedores. Recuerda que los contenedores deben ser capaces de contener tanto elementos simples como otros contenedores.
-	Declara la interfaz componente con una lista de métodos que tengan sentido para componentes simples y complejos.
-	Crea una clase hoja para representar elementos simples. Un programa puede tener varias clases hoja diferentes.
-	Crea una clase contenedora para representar elementos complejos. Incluye un campo matriz en esta clase para almacenar referencias a subelementos. La matriz debe poder almacenar hojas y contenedores, así que asegúrate de declararla con el tipo de la interfaz componente.
-	Al implementar los métodos de la interfaz componente, recuerda que un contenedor debe delegar la mayor parte del trabajo a los subelementos.
-	Por último, define los métodos para añadir y eliminar elementos hijos dentro del contenedor.
Ten en cuenta que estas operaciones se pueden declarar en la interfaz componente. Esto violaría el Principio de segregación de la interfaz porque los métodos de la clase hoja estarían vacíos. No obstante, el cliente podrá tratar a todos los elementos de la misma manera, incluso al componer el árbol.


## Pros y contras
       ○	 Puedes trabajar con estructuras de árbol complejas con mayor comodidad: utiliza el polimorfismo y la recursión en tu favor.
       ○	 Principio OCP. Puedes introducir nuevos tipos de elemento en la aplicación sin descomponer el código existente, que ahora funciona con el árbol de objetos.
       ○ 	 Puede resultar difícil proporcionar una interfaz común para clases cuya funcionalidad difiere demasiado. En algunos casos, tendrás que generalizar en exceso la interfaz componente, provocando que sea más difícil de comprender.

## Relaciones con otros patrones
:heavy_check_mark:	Puedes utilizar Builder al crear árboles Composite complejos porque puedes programar sus pasos de construcción para que funcionen de forma recursiva.


:heavy_check_mark:	Chain of Responsibility se utiliza a menudo junto a Composite. En este caso, cuando un componente hoja recibe una solicitud, puede pasarla a lo largo de la cadena de todos los componentes padre hasta la raíz del árbol de objetos.


:heavy_check_mark:	Puedes utilizar Iteradores para recorrer árboles Composite.


:heavy_check_mark:	Puedes utilizar el patrón Visitor para ejecutar una operación sobre un árbol Composite entero.


:heavy_check_mark:	Puedes implementar nodos de hoja compartidos del árbol Composite como Flyweights para ahorrar memoria RAM.


:heavy_check_mark:	Composite y Decorator tienen diagramas de estructura similares ya que ambos se basan en la composición recursiva para organizar un número indefinido de objetos.


:heavy_check_mark:	Un Decorator es como un Composite pero sólo tiene un componente hijo. Hay otra diferencia importante: Decorator añade responsabilidades adicionales al objeto envuelto, mientras que Composite se limita a “recapitular” los resultados de sus hijos.


:heavy_check_mark:	No obstante, los patrones también pueden colaborar: puedes utilizar el Decorator para extender el comportamiento de un objeto específico del árbol Composite.


:heavy_check_mark:	Los diseños que hacen un uso amplio de Composite y Decorator a menudo pueden beneficiarse del uso del Prototype. Aplicar el patrón te permite clonar estructuras complejas en lugar de reconstruirlas desde cero.




## Comenzando 🚀

Estas instrucciones te permitirán obtener una copia del proyecto en funcionamiento en tu máquina local para propósitos de desarrollo y pruebas.


### Instalación 🔧

### `Clonar` 
Clonar el proyecto utilizando git clone  dentro de tu entorno local para poder obtener el codigo fuente. 
```
git clone https://github.com/D-Perez85/JAVA-COMPOSITE-PATTERN.git
```
### `Instalar Intellij IDE`
Necesitas este framework para poder compilar los archivos de prueba
```
https://www.jetbrains.com/es-es/idea/download/?section=windows
```
### `Run`
Una vez instalado el frame podras correr la App para ver este patron en funcionamiento.  

![image](https://github.com/D-Perez85/JAVA-COMPOSITE-PATTERN/assets/77124855/9fd11f8e-46e0-447c-b665-4a9d9846a2a3)





Made with ❤️ by [Damian Perez](https://github.com/D-Perez85) 😊

