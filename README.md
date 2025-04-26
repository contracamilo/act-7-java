# Ejercicio Empresa Tecnológica 

Este proyecto implementa un sistema básico de gestión para una empresa tecnológica, demostrando conceptos fundamentales de programación orientada a objetos en Java como herencia, polimorfismo y encapsulamiento.

## Estructura del Proyecto

### Clases Principales

1. **Empleado (Clase Abstracta)**
   - Clase base que define los atributos comunes de todos los empleados
   - Atributos: nombre, apellido, id, salario
   - Método abstracto: `trabajar()`

2. **Tipos de Empleados (Subclases)**
   - **Desarrollador**
     - Especializado en programación
     - Atributos adicionales: lenguajePrincipal, especialidad
   - **Diseñador**
     - Especializado en diseño
     - Atributos adicionales: herramientaPrincipal, areaDiseno
   - **Gerente**
     - Especializado en gestión
     - Atributos adicionales: departamento, equipoACargo

3. **Proyecto**
   - Gestiona la información de proyectos
   - Mantiene una lista de empleados asignados
   - Permite agregar empleados y mostrar el equipo

4. **EmpresaTecnologica**
   - Clase principal que ejecuta el sistema
   - Gestiona empleados y proyectos
   - Demuestra el uso de polimorfismo

## Características Implementadas

- Herencia a través de la jerarquía de clases de empleados
- Polimorfismo con el método `trabajar()` implementado de forma diferente en cada tipo de empleado
- Encapsulamiento con atributos privados y métodos getter/setter
- Gestión de relaciones entre empleados y proyectos
- Implementación de `toString()` para mejor visualización de datos

## Requisitos

- Java 17 o superior
- Maven 3.x

## Cómo Ejecutar

1. Clonar el repositorio
2. Navegar al directorio del proyecto
3. Ejecutar con Maven:
   ```bash
   mvn clean compile exec:java -Dexec.mainClass="com.techcomp.EmpresaTecnologica"
   ```

## Ejemplo de Salida

El programa mostrará:
- Lista completa de empleados con sus detalles
- Información de los proyectos y sus equipos asignados
- Demostración de polimorfismo con cada empleado realizando su trabajo específico

## Estructura de Directorios

```
tech-company/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── techcomp/
│                   ├── model/
│                   │   ├── Empleado.java
│                   │   ├── Desarrollador.java
│                   │   ├── Disenador.java
│                   │   ├── Gerente.java
│                   │   └── Proyecto.java
│                   └── EmpresaTecnologica.java
└── pom.xml
``` 
