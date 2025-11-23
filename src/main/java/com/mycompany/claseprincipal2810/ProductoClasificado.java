/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.claseprincipal2810;

/**
 *
 * @author danielsosa21
 */
public class ProductoClasificado extends Producto{
    
    private String presentacion;
    private double precioVenta;
    
    //Constructor de la herencia
    public ProductoClasificado(String presentacion, double precioVenta, String nombreProducto, double precioCosto, String nombreProveedor, int cantidad) 
    {
        super(nombreProducto, precioCosto, nombreProveedor, cantidad);
        this.presentacion = presentacion;
        this.precioVenta = precioVenta;
    }
    //Getters

    public String getPresentacion() {
        return presentacion;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }
    //Setters

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
}
