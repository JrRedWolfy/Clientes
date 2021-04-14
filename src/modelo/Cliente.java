/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author alumnodaw
 */
public class Cliente {
    
    private String nombre;
    
    private String priApellido;
    
    private String segApellido;
    
    private String estadoCivil;
    
    private String genero;
    
    private int edad;

    public Cliente(String nombre, String priApellido, String segApellido, String estadoCivil, String genero, int edad) {
        this.nombre = nombre;
        this.priApellido = priApellido;
        this.segApellido = segApellido;
        this.estadoCivil = estadoCivil;
        this.genero = genero;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPriApellido() {
        return priApellido;
    }
    public void setPriApellido(String priApellido) {
        this.priApellido = priApellido;
    }

    public String getSegApellido() {
        return segApellido;
    }
    public void setSegApellido(String segApellido) {
        this.segApellido = segApellido;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nombre + " " + priApellido + " " + segApellido + " " + estadoCivil + "  " + genero + "  " + edad;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
