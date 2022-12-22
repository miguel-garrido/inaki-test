# inaki-test

Este repositorio contiene algunos programas desarrollados en Java.


## MyApp1

Aplicación en la que se muestra el ciclo de vida en android, y se realiza una operación entre fechas en el evento onStart
```java
LocalDate today = LocalDate.now();
LocalDate date1 = LocalDate.of(2023, Month.AUGUST, 14);
long diasFaltantes = Duration.between(today.atStartOfDay(), date1.atStartOfDay()).toDays();
```


### Requisitos

Se debe instalar los siguientes programas:
- Java 8 o superior
- AndroidStudio
- Simulador de Android
