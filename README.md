# LAB01AREP
### Autor
David Pérez Mejía 

### Deployed
[![Deployed to Heroku](https://www.herokucdn.com/deploy/button.png)](https://temperatureconverterarep.herokuapp.com/index.html)
### Arquitectura utilizada: 

## Software utilizado:
* Maven 
* Spark
* Git
* Heroku

## Backend 
* Java
* Maven
* JS
### Spark
Apache Spark sigue una arquitectura maestro/esclavo con un administrador de clúster (Cluster Manager). 
En nuestro proyecto conectamos nuestra api rest construida con Spark en este caso la encargada de convertir celsius a fahrenheit y viceversa, que usa una peticion GET para retornar un JSON.


En App.java crea nuestro objeto JSON y hacemos las peticiones GET para 
![](https://github.com/DavidPZ666/LAB01AREP/blob/master/img/Spark.PNG)

En nuestra clase Converter realizamos la logica del proyecto
![](https://github.com/DavidPZ666/LAB01AREP/blob/master/img/FuncionBack1.PNG)
![](https://github.com/DavidPZ666/LAB01AREP/blob/master/img/FuncionBack2.PNG)

## Pruebas

### Pruebas unitarias 
* Junit

![](https://github.com/DavidPZ666/LAB01AREP/blob/master/img/Test1.PNG)
![](https://github.com/DavidPZ666/LAB01AREP/blob/master/img/Test1.1.PNG)

### Pruebas Concurrentes 

![](https://github.com/DavidPZ666/LAB01AREP/blob/master/img/Test2.PNG)
![](https://github.com/DavidPZ666/LAB01AREP/blob/master/img/Test2.2.PNG)

![](https://github.com/DavidPZ666/LAB01AREP/blob/master/img/Test3.PNG)

## Fronted

* Html
* JS
* CSS

![](https://github.com/DavidPZ666/LAB01AREP/blob/master/img/js.PNG)
![](https://github.com/DavidPZ666/LAB01AREP/blob/master/img/Html.PNG)

## Aplicacion desplegada 

## Atributos de calidad

## Limitaciones
