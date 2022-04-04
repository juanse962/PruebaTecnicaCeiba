# SWAGLABS www.saucedemo.com/

## Documentación
En la siguiente ruta del proyecto se encuentra tanto el plan de prueba con los items propuestos y el reporte de bugs:

* PruebaTecnicaCeiba\documentación\Plan de pruebas.docx
* PruebaTecnicaCeiba\documentación\Reporte_de_bugs.pdf

## Ejecución
* Para ejecutar este proyecto se deben instalar todas las dependecias del archivo build.gradle
* Para ejecutar la autoamtizaci'on utilizamos el comando en cada Runner
``` 
gradle :test --tests "runnertest.login.RunnerTestLoginUser"
```

* Para generar el informe de SerenityBDD se deben ejecutar los siguientes comandos

``` 
gradle build
gradle test aggregate
```

## Escenarios automatizados

| ID | Escenario de prueba |
| ------------- | ------------- |
| 01 | Login de usuario |
| 02 | Adición del producto “Sauce Labs Fleece Jacket” (standard_user) |
| 03 | Confirmar compra (standard_user) |

