# README a completar

## Nombre, finalidad y descripción breve del proyecto;
### GESTOR DE INCIDENCIAS :
**Almacena y administra** el estado de las incidencias para un centro.

## Versión de java que utiliza
El proyecto utiliza la ***Versión 17*** de Java.

## listado de funcionalidades que permite realizar la aplicación;
- Listar las incidencias
- Listar las incidencias que siguen abiertas
- Buscar incidencia por texto
- Buscar una incidencia por su id

## compilación y ejecución;
Salta un menú al ejecutar el código con 5 opciones, que se marcan con números del **0 al 4**

Cada número corresponde a una de las funcionalidades, y el 0 sirve para salir del programa.

````
GESTOR DE INCIDENCIAS
Aplicación de consulta de avisos de soporte del centro.
----------------------------------------
1. Mostrar todas las incidencias
2. Mostrar las incidencias abiertas
3. Buscar incidencias
4. Consultar una incidencia por su ID
0. Salir
----------------------------------------
Selecciona una opción: 
````

## generación y consulta de Javadoc;
El javadoc se ha generado y almacenado en el directorio */docs*. Para su consulta se puede entrar desde en enlace al final de este documento.

## una tabla con las clases principales y su responsabilidad general.
| CLASE     | FUNCIÓN   | 
|-----------|-----------|
| Incidencia| El modelo para crear incidencias y guardar sus datos  |
| Gestor de incidencias    | Tiene los recursos para buscar incidencias y/o cambiar su estado   |
 | App     | El ejecutable con el menú y las opciones para el cliente       |
 | IncidenciaNoEncontradaException | Cubre los problemas de Gestor de incidencias al pasar datos inexistentes |

## estructura de archivos
En la raíz del proyecto, en el directorio */docs* se encuentra la documentación del Javadoc.

Dentro del directorio */src/main/java* hay un paquete llamado */es.centro.incidencias*, dentro de este se encuentran 
las **3 clases** (*App, GestorIncidencias y Incidencia*) a parte de la interfaz *IncidenciaNoEncontradaException*.


## enlace a la documentación Javadoc publicada mediante GitHub Pages
### [Enlace a la documentación](https://danield-odaw1b.github.io/documentacion-proyecto-ud1-daniel-vazquez/es/centro/incidencias/package-summary.html)