/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenda;

/**
 *
 * @author Cuack
 */
public class Persona {
    private String codigo, nombres,apellidos, genero, direccion, departamento;
    private int Edad;

    public Persona(String codigo, String nombres, String apellidos, String genero, String direccion, String departamento, int Edad) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.genero = genero;
        this.direccion = direccion;
        this.departamento = departamento;
        this.Edad = Edad;
    }
    //Getters
    public String getCodigo() {
        return codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getGenero() {
        return genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public int getEdad() {
        return Edad;
    }
    //Setters
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    @Override
public String toString()
    {
        return("Apellidos: " + apellidos + 
                ", Nombres: " + nombres + 
                ", Codigo: " + codigo + 
                ", Genero: " + genero + 
                ", Direccion: " + direccion + 
                ", Dept: " + departamento + 
                ", Edad: " + Edad);
    }
    public String mostrarFamilia()
    {
        return "";
    }
    public String mostrarCompleto()
    {
        return toString() + " | " + mostrarFamilia();
    }
}

