package com.techcomp.model;

public class Desarrollador extends Empleado {
    private String lenguajePrincipal;
    private String especialidad;

    public Desarrollador(String nombre, String apellido, int id, double salario, 
                        String lenguajePrincipal, String especialidad) {
        super(nombre, apellido, id, salario);
        this.lenguajePrincipal = lenguajePrincipal;
        this.especialidad = especialidad;
    }

    @Override
    public void trabajar() {
        System.out.println("Desarrollador " + getNombre() + " " + getApellido() + 
                         " está programando en " + lenguajePrincipal);
    }

    public String getLenguajePrincipal() {
        return lenguajePrincipal;
    }

    public void setLenguajePrincipal(String lenguajePrincipal) {
        this.lenguajePrincipal = lenguajePrincipal;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return super.toString() + " Desarrollador{" +
                "lenguajePrincipal='" + lenguajePrincipal + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
} 