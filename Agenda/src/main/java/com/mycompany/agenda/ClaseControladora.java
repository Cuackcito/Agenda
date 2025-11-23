/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.agenda;

import java.util.ArrayList;

/**
 *
 * @author Cuack
 */
public class ClaseControladora {
    //hacerlos publicos
    public static Trabajo nuevoContacto;
      public static ContactoFamilia nuevoContacto2;
    //generarlista
   public static ArrayList<Persona> listaContacto = new ArrayList<>();
     //agregar contactos
    public static void agregarPersona (Persona p) {
        listaContacto.add(p);
    }
    
    //devolver la lista completa de contactos 
      //Definir metodo para mostrar los productos guardados
    public static void mostrarContacto()
    {
        //Ciclo For para mostrar el contenido en el arreglo
        for (Persona p: listaContacto)
        {
            //Mostrar todos los objetos en el listado
            p.toString();
        }
    }
    
    //buscar contactos por su codigo
    public static Persona buscarPorCodigo(String codigo) {
        for (Persona p : listaContacto) {
            if (p.getCodigo().equals(codigo)) {
                return p;
            }
        }
        return null;
    }
    //buscar por apellidos
    public static ArrayList<Persona> buscarPorApellido(String apellido) {
        
        ArrayList<Persona> resultados = new ArrayList<>();

        for (Persona p : listaContacto) {
            if (p.getApellidos().toLowerCase().contains(apellido)) {
                resultados.add(p);
            }
        }
        return resultados;
    }
    //buscarportelefono

    public static ArrayList<Persona> buscarPorTelefono(String telefono) {
    ArrayList<Persona> resultados = new ArrayList<>();
    
    for (Persona p : listaContacto) {
        if (p instanceof ContactoFamilia) {
            ContactoFamilia cf = (ContactoFamilia) p;
            if (cf.getTel1().equals(telefono) || cf.getTel2().equals(telefono) || cf.getTel3().equals(telefono)) {
                resultados.add(p);
            }
        } else if (p instanceof Trabajo) {
            Trabajo ct = (Trabajo) p;
            if (ct.getTel1().equals(telefono) || ct.getTel2().equals(telefono) || ct.getTel3().equals(telefono)) {
                resultados.add(p);
            }
        }
    }
    return resultados;
}
    //modificar
    public static boolean modificarContacto(String codigoAntiguo, Persona contactoActualizado) {
        
        String codigoBuscado = codigoAntiguo;

        for (int i = 0; i < listaContacto.size(); i++) {
            
            Persona p = listaContacto.get(i);
            
            if (p.getCodigo().equals(codigoBuscado)) {
                listaContacto.set(i, contactoActualizado);
                return true; 
            }
        }
        return false;
    }

    //eliminar
    public static boolean eliminarContactoPorCodigo(String codigo) {

    
    for (int i = listaContacto.size() - 1; i >= 0; i--) {
        Persona p = listaContacto.get(i);
        
        if (p.getCodigo().equals(codigo)) {
            listaContacto.remove(i);
            
           return true;
            
        }
    }
   
    return false;
}
    //eliminartodosloscontactos
    public static void eliminarTodosLosContactos() {
        listaContacto.clear();
    }
}