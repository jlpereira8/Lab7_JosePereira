/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_josepereira;

/**
 *
 * @author j0c3lwiz
 */
public class Actores_Principales_Pelis {
   private String nombre;

    public Actores_Principales_Pelis() {
    }

    public Actores_Principales_Pelis(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre ;
    }
   
   
}
