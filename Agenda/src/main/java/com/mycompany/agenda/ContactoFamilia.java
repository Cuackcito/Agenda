/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenda;

/**
 *
 * @author Cuack
 */
public class ContactoFamilia extends Persona {
    private String tel1, tel2, tel3;

    public ContactoFamilia(String tel1, String tel2, String tel3, String codigo, String nombres, String apellidos, String genero, String direccion, String departamento, int Edad) {
        super(codigo, nombres, apellidos, genero, direccion, departamento, Edad);
        this.tel1 = tel1;
        this.tel2 = tel2;
        if(tel3 == ""){
         this.tel3 = "0";
    } else{
             this.tel3 = tel3;
            }
       
    }
    
    
}
