# Sistema de Registro de Horas de Vuelo de Pilotos

## Descripción

Este proyecto implementa un sistema sencillo para registrar y acumular las horas de vuelo de un piloto. Utiliza encapsulamiento para proteger los datos y validaciones para impedir que se registren vuelos con una duración menor o igual a cero.

## Funcionamiento

El programa crea un piloto con número de licencia y nombre, inicializando sus horas de vuelo en cero.

Luego realiza las siguientes operaciones:

1. Muestra las horas de vuelo iniciales.
2. Registra tres vuelos válidos de 3.5, 8.0 y 1.25 horas.
3. Intenta registrar dos vuelos inválidos: uno de -4 horas y otro de 0 horas.
4. Rechaza los vuelos inválidos sin modificar el total acumulado.
5. Muestra el nombre del piloto y el total de horas de vuelo registradas.

## Clases principales

### Clase `Piloto`

Representa a un piloto y administra sus datos.

**Atributos:**

* `numeroLicencia`: número de licencia del piloto.
* `nombre`: nombre completo del piloto.
* `horasVuelo`: cantidad total de horas de vuelo acumuladas.

**Métodos principales:**

* `Piloto(String numeroLicencia, String nombre)`: inicializa los datos del piloto y establece las horas de vuelo en cero.
* `getNumeroLicencia()`: devuelve el número de licencia.
* `getNombre()`: devuelve el nombre del piloto.
* `getHorasVuelo()`: devuelve el total de horas acumuladas.
* `registrarVuelo(double horas)`: valida la duración del vuelo y, si es mayor que cero, suma las horas al total. Devuelve `true` si el registro es válido y `false` si se rechaza.

### Clase `Main`

Contiene el método `main()`, desde el cual se crea un objeto `Piloto`, se prueban registros válidos e inválidos y se muestra el resultado en la consola.

## Conceptos de programación utilizados

* **Encapsulamiento:** los atributos de `Piloto` son privados (`private`).
* **Constructores:** permiten inicializar el número de licencia y el nombre del piloto.
* **Métodos de acceso (getters):** permiten consultar los datos sin modificar directamente los atributos.
* **Validación de datos:** se rechazan las horas menores o iguales a cero.
* **Acumulación de valores:** las horas de cada vuelo válido se agregan al total existente.
* **Retorno booleano:** el método `registrarVuelo()` informa si la operación fue exitosa.

## Tecnologías utilizadas

* Java.
* IntelliJ IDEA.
* Programación orientada a objetos (POO).

## Ejecución

<img width="627" height="411" alt="image" src="https://github.com/user-attachments/assets/9fc48896-1754-452b-8b1e-996e21fbccb7" />

## Resultado esperado

El programa debe mostrar inicialmente `0.0` horas de vuelo.

Los vuelos válidos suman un total de **12.75 horas**. Los intentos de registrar -4 y 0 horas son rechazados y no modifican el acumulado.

El resultado final esperado es:

```text
Horas iniciales: 0.0

--- Vuelos válidos ---
Vuelo de 3.5 horas registrado.
Vuelo de 8.0 horas registrado.
Vuelo de 1.25 horas registrado.

--- Vuelos inválidos ---
Vuelo rechazado: las horas deben ser mayores a cero (-4.0).
Vuelo rechazado: las horas deben ser mayores a cero (0.0).

Total de horas de Carlos Méndez: 12.75
```

## Objetivo del ejercicio

Aplicar el encapsulamiento y la validación de datos para controlar el registro de horas de vuelo, garantizando que el total acumulado solo pueda incrementarse mediante vuelos válidos y que no se modifique directamente desde otras clases.

## Estructura del proyecto

```text
RegistroHorasVuelo/
├── src/
│   ├── Piloto.java
│   └── Main.java
└── README.md
```
