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
    
}
