Proyecto: Devco test Automatización
El proyecto de Automatización Devco test se elabora con la finalidad de evaluar los conocimientos en el área de Automatización de Hernan José Malave Montero, el cual se encuentra interesado ser parte de la compañia Devco.

Este proyecto cuenta con las siguientes características:

Lenguaje de programación: Java
Framework de Automatización: Serenity
Patrón de diseño: Screenplay
Framework de soporte BDD (Behavior development driver): Cucumber
Lenguaje de BDD (Behavior development driver): Gherkin
Constructor de proyecto: Gradle

Nota: El proyecto esta diseñado para ser ejecutado en maquinas Windows y navegador Chrome.

El proyecto posee la siguiente estructura:

Carpeta Devco project:

src/main/java/co/com/Devco/certification/enums: Este paquete contiene todos los enums del proyecto, por ejemplo, mensajes, tutas o palabras.


src/main/java/co/com/Devco/certification/execptions: Este paquete contiene todas las excepciones que fueron diseñadas en el proyecto.


src/main/java/co/com/Devco/certification/interactions: Este paquete maneja todas las funciones de iteraciones con elementos web, por ejemplo, realizar click en un elemento web, escribir sobre un elemento web, entre otros


src/main/java/co/com/Devco/certification/models: Este paquete contiene las clases que orquestaran toda la data necesaria para ejecutar las pruebas automatizadas


src/main/java/co/com/Devco/certification/tasks: Este paquete maneja las tareas que va realizar el usuario para cumplir con lo esperado en la prueba automatizada, asi cumpliendo con el Patrón de diseño Screenplay


src/main/java/co/com/Devco/certification/userinterface: En este paquete referenciamos los elementos de las vistas con las que vamos interactuar, asi garantizando la reusabilidad de código.


src/main/java/co/com/Devco/certification/utils: En este paquete tenemos las clases que nos ayudaran a cumplir con el BDD ya sea seteando data, obteniendo un texto, entre otros 


src/test/java/co/com/Devco/certification/runner: Este paquete contiene nuestro archivo runner el cual es encargado de ejecutar nuestra prueba


src/test/java/co/com/Devco/certification/stepDefinitios: Este paquete contiene nuestros archivos de steps los cuales definen el paso a paso del lado de lógica de programación


src/test/resources/co/com/Devco/certification/featuress Este paquete contiene nuestros archivos feature los cuales definen el escenario a evaluar del lado del BDD


 gitignore: El archivo encargado de bloquear subir archivos no necesarios en nuestro repositorio


 serenity.properties: Es el archivo que nos ayuda a setear propiedades del Framework de Serenity



Datos adicionales del proyecto:

Se implemento la anotación "@share" de serenity para compartir data entre diferentes contextos
Se implemento tags para todos los diferentes escenarios automatizados
Se implemento tag generico llamado "@RegressionTest" para poder ejecutar toda la suite de pruebas

Para la suite de pruba de "car_rental" no se pudieron hacer los casos alternos devido a que la página dice que es un robot quien la controla y la cierra, por lo que sólo queda plasmado el plan de pruebas

La suite de pruebas de "Login" quedo fuera de la regresion por defaul ya que el navegador identifica el framework y muestra unos recapcha 

Pasos para obtener el proyecto de automation:

Clonar el repositorio en la ubicación deseada, usando el comando: git clone 

Ingresar a la carpeta Devco project


Pasos para ejecutar el proyecto

Se debe primero realizar los pasos de la sección "Pasos para obtener el proyecto de automation"
Opción 1: Abrir el proyecto en el IDE de su preferencia que soporte Java, ejecutar el archivo TestRunner, este runner por defecto esta configurado con el tag @RegressionTest para ejecutar todas las pruebas
Opcion 2: Abrir desde la consola de windows la carpeta donde esta clonado el proyecto, la consola debe tener permisos de administrador, ejecutar el comando "gradle w clean test" 
Opcion 3: Si desea ejecutar algún tag en particular se debe ejecutar el siguiente comando desde la consola en la carpeta "Devco project", comando: gradle w test -Dcucumber.options="--tags @xxxx" aggregate, donde "xxxx" es el tag deseado


Generación de reporte del framework
