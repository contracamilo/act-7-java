package com.techcomp.model;

import java.util.ArrayList;
import java.util.List;

public class Proyecto {
    private String nombre;
    private String descripcion;
    private String fechaInicio;
    private String fechaFin;
    private List<Empleado> empleadosAsignados;

    public Proyecto(String nombre, String descripcion, String fechaInicio, String fechaFin) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.empleadosAsignados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleadosAsignados.add(empleado);
    }

    public void mostrarEquipo() {
        System.out.println("\nEquipo del proyecto " + nombre + ":");
        for (Empleado empleado : empleadosAsignados) {
            System.out.println("- " + empleado.getNombre() + " " + empleado.getApellido());
        }
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public List<Empleado> getEmpleadosAsignados() {
        return empleadosAsignados;
    }

    @Override
    public String toString() {
        return "Proyecto{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaInicio='" + fechaInicio + '\'' +
                ", fechaFin='" + fechaFin + '\'' +
                ", número de empleados=" + empleadosAsignados.size() +
                '}';
    }
} 