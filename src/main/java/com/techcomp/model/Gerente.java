package com.techcomp.model;

public class Gerente extends Empleado {
    private String departamento;
    private int equipoACargo;

    public Gerente(String nombre, String apellido, int id, double salario,
                   String departamento, int equipoACargo) {
        super(nombre, apellido, id, salario);
        this.departamento = departamento;
        this.equipoACargo = equipoACargo;
    }

    @Override
    public void trabajar() {
        System.out.println("Gerente " + getNombre() + " " + getApellido() + 
                         " está gestionando el departamento de " + departamento);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getEquipoACargo() {
        return equipoACargo;
    }

    public void setEquipoACargo(int equipoACargo) {
        this.equipoACargo = equipoACargo;
    }

    @Override
    public String toString() {
        return super.toString() + " Gerente{" +
                "departamento='" + departamento + '\'' +
                ", equipoACargo=" + equipoACargo +
                '}';
    }
} 