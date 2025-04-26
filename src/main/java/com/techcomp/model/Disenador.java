package com.techcomp.model;

public class Disenador extends Empleado {
    private String herramientaPrincipal;
    private String areaDiseno;

    public Disenador(String nombre, String apellido, int id, double salario,
                     String herramientaPrincipal, String areaDiseno) {
        super(nombre, apellido, id, salario);
        this.herramientaPrincipal = herramientaPrincipal;
        this.areaDiseno = areaDiseno;
    }

    @Override
    public void trabajar() {
        System.out.println("Diseñador " + getNombre() + " " + getApellido() + 
                         " está diseñando con " + herramientaPrincipal);
    }

    public String getHerramientaPrincipal() {
        return herramientaPrincipal;
    }

    public void setHerramientaPrincipal(String herramientaPrincipal) {
        this.herramientaPrincipal = herramientaPrincipal;
    }

    public String getAreaDiseno() {
        return areaDiseno;
    }

    public void setAreaDiseno(String areaDiseno) {
        this.areaDiseno = areaDiseno;
    }

    @Override
    public String toString() {
        return super.toString() + " Diseñador{" +
                "herramientaPrincipal='" + herramientaPrincipal + '\'' +
                ", areaDiseno='" + areaDiseno + '\'' +
                '}';
    }
} 