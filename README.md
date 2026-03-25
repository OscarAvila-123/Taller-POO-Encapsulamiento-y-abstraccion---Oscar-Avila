# 🧠 Taller POO: Encapsulamiento y Abstracción

Este proyecto corresponde al desarrollo de un taller práctico de Programación Orientada a Objetos (POO) en Java, enfocado en los conceptos de **encapsulamiento** y **abstracción**.

---

## 📌 Objetivos

* Aplicar el encapsulamiento mediante atributos privados y métodos públicos.
* Implementar abstracción usando clases abstractas.
* Integrar ambos conceptos en diferentes ejercicios prácticos.

---

## 🧱 Estructura del Proyecto

El proyecto está dividido en 4 partes principales:

### 1️⃣ Vehículos (Abstracción + Encapsulamiento)

Se implementa una clase abstracta `Vehiculo` con atributos privados:

* `marca`
* `velocidad`

Y métodos:

* Getters
* Setter con validación
* Métodos abstractos: `acelerar()` y `frenar()`

Subclases:

* `Moto`
* `Carro`
* `Bicicleta`

Cada una define su propia lógica de aceleración y frenado.

---

### 2️⃣ Cuenta Bancaria (Encapsulamiento)

Clase `CuentaBancaria` con:

* `numeroCuenta`
* `saldo`

Métodos:

* `depositar()`
* `retirar()`
* Getters y setters con validación

---

### 3️⃣ Figuras Geométricas (Abstracción)

Clase abstracta:

* `FiguraGeometrica`

Método:

* `calcularArea()`

Subclases:

* `Circulo`
* `Rectangulo`
* `Triangulo`
* `Rombo`

Cada clase implementa su fórmula correspondiente.

---

### 4️⃣ Empleados (Integración)

Clase abstracta:

* `Empleado`

Subclases:

* `EmpleadoTiempoCompleto`
* `EmpleadoPorHoras`

Cada una implementa el método `calcularSalario()` según su lógica.

---

## ▶️ Ejecución

Ejemplo de salida en consola:

```
========== PRUEBA DE VEHÍCULOS ==========

>> MOTO (Yamaha)
Velocidad inicial: 0
Acelera → 15
Acelera → 30
Frena   → 22

=========== FIN DE LA PRUEBA ===========
```

---

## 🧠 Conceptos Clave

### 🔒 Encapsulamiento

Permite proteger los datos de una clase mediante el uso de atributos privados y métodos públicos controlados.

### 🎭 Abstracción

Permite definir comportamientos generales en clases abstractas, dejando que las subclases implementen los detalles.

---

## 👨‍💻 Autor

* Estudiante: Oscar Stiven Avila Nomesque

---

## 📎 Notas

Este proyecto fue desarrollado con fines académicos para comprender los fundamentos de la Programación Orientada a Objetos en Java.
# Taller-POO-Encapsulamiento-y-abstraccion---Oscar-Avila
