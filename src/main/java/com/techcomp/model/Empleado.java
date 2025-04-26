package com.techcomp.model;

public abstract class Empleado {
    private String nombre;
    private String apellido;
    private int id;
    private double salario;

    public Empleado(String nombre, String apellido, int id, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.salario = salario;
    }

    // Método abstracto que será implementado por las subclases
    public abstract void trabajar();

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", id=" + id +
                ", salario=" + salario +
                '}';
    }
} 