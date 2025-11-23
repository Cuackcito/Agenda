/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.claseprincipal2810;

/**
 *
 * @author danielsosa21
 */
public class Producto {
    private String nombreProducto;
    private double precioCosto;
    private String nombreProveedor;
    private int cantidad;
    
    //Constructor
    public Producto(String nombreProducto, double precioCosto, String nombreProveedor, int cantidad) 
    {
        this.nombreProducto = nombreProducto;
        if (precioCosto < 0)
        {
            this.precioCosto = 1;
        }
        else 
        {
            this.precioCosto = precioCosto;
        }
        this.nombreProveedor = nombreProveedor;
        if(cantidad < 0)
        {
            this.cantidad = 1;
        }
        else 
        {
            this.cantidad = cantidad;
        }
    }
    //Getters
    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public int getCantidad() {
        return cantidad;
    }
    //Setters

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setPrecioCosto(double precioCosto) {
        if (precioCosto < 0)
        {
            this.precioCosto = 1;
        }
        else 
        {
            this.precioCosto = precioCosto;
        }
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public void setCantidad(int cantidad) {
        if(cantidad < 0)
        {
            this.cantidad = 1;
        }
        else 
        {
            this.cantidad = cantidad;
        }
    }
}
