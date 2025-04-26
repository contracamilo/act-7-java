package com.techcomp;

import com.techcomp.model.*;
import java.util.ArrayList;
import java.util.List;

public class EmpresaTecnologica {
    private List<Empleado> empleados;
    private List<Proyecto> proyectos;

    public EmpresaTecnologica() {
        this.empleados = new ArrayList<>();
        this.proyectos = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void agregarProyecto(Proyecto proyecto) {
        proyectos.add(proyecto);
    }

    public void mostrarEmpleados() {
        System.out.println("\nLista de empleados:");
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }

    public void mostrarProyectos() {
        System.out.println("\nLista de proyectos:");
        for (Proyecto proyecto : proyectos) {
            System.out.println(proyecto);
            proyecto.mostrarEquipo();
        }
    }

    public static void main(String[] args) {
        EmpresaTecnologica empresa = new EmpresaTecnologica();

        // Crear desarrolladores
        Desarrollador dev1 = new Desarrollador("Juan", "Pérez", 1, 60000, "Java", "Backend");
        Desarrollador dev2 = new Desarrollador("Ana", "García", 2, 65000, "Python", "Data Science");
        Desarrollador dev3 = new Desarrollador("Carlos", "Rodríguez", 3, 55000, "JavaScript", "Frontend");

        // Crear diseñadores
        Disenador dis1 = new Disenador("María", "López", 4, 50000, "Adobe XD", "UI/UX");
        Disenador dis2 = new Disenador("Pedro", "Martínez", 5, 48000, "Figma", "Web Design");
        Disenador dis3 = new Disenador("Laura", "Sánchez", 6, 52000, "Photoshop", "Gráfico");

        // Crear gerentes
        Gerente ger1 = new Gerente("Roberto", "González", 7, 80000, "Desarrollo", 10);
        Gerente ger2 = new Gerente("Sofia", "Díaz", 8, 75000, "Diseño", 8);
        Gerente ger3 = new Gerente("Miguel", "Torres", 9, 85000, "Proyectos", 15);

        // Agregar empleados a la empresa
        empresa.agregarEmpleado(dev1);
        empresa.agregarEmpleado(dev2);
        empresa.agregarEmpleado(dev3);
        empresa.agregarEmpleado(dis1);
        empresa.agregarEmpleado(dis2);
        empresa.agregarEmpleado(dis3);
        empresa.agregarEmpleado(ger1);
        empresa.agregarEmpleado(ger2);
        empresa.agregarEmpleado(ger3);

        // Crear y configurar proyectos
        Proyecto proyecto1 = new Proyecto("App Móvil", "Aplicación de delivery", 
                                        "2024-01-01", "2024-06-30");
        proyecto1.agregarEmpleado(dev1);
        proyecto1.agregarEmpleado(dis1);
        proyecto1.agregarEmpleado(ger1);

        Proyecto proyecto2 = new Proyecto("Plataforma Web", "E-commerce B2B", 
                                        "2024-02-01", "2024-08-31");
        proyecto2.agregarEmpleado(dev2);
        proyecto2.agregarEmpleado(dev3);
        proyecto2.agregarEmpleado(dis2);
        proyecto2.agregarEmpleado(ger2);

        empresa.agregarProyecto(proyecto1);
        empresa.agregarProyecto(proyecto2);

        // Mostrar información
        System.out.println("=== EMPRESA TECNOLÓGICA ===");
        empresa.mostrarEmpleados();
        empresa.mostrarProyectos();

        System.out.println("\n=== DEMOSTRACIÓN DE POLIMORFISMO ===");
        for (Empleado empleado : empresa.empleados) {
            empleado.trabajar();
        }
    }
} 