/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenda;

/**
 *
 * @author danie
 */
public class Trabajo extends Persona{
    private String tel1;
    private String tel2;
    private String tel3;
    private String clasificacionContacto;
    
    public Trabajo(String tel1, String tel2, String tel3, String clasificacionContacto, String codigo, String nombres, String apellidos, String genero, String direccion, String departamento, int Edad) {
        super(codigo, nombres, apellidos, genero, direccion, departamento, Edad);
        this.clasificacionContacto = clasificacionContacto;
        this.tel1 = tel1;
        this.tel2 = tel2;
        if("".equals(tel3))
        {
            this.tel3 = "";
        }
        else
        {
            this.tel3 = tel3;
        }
    }
    //Getters
    public String getTel1() {
        return tel1;
    }

    public String getTel2() {
        return tel2;
    }

    public String getTel3() {
        return tel3;
    }

    public String getClasificacionContacto() {
        return clasificacionContacto;
    }
    //Setters
    public void setTel1(String tel1) {
        this.tel1 = tel1;
    }

    public void setTel2(String tel2) {
        this.tel2 = tel2;
    }

    public void setTel3(String tel3) {
        if("".equals(tel3))
        {
            this.tel3 = "";
        }
        else
        {
            this.tel3 = tel3;
        }
    }

    public void setClasificacionContacto(String clasificacionContacto) {
        this.clasificacionContacto = clasificacionContacto;
    }
}
