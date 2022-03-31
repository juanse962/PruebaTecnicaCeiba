# SWAGLABS www.saucedemo.com/

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