/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_josepereira;

/**
 con nombre, código de cuenta y contraseña en un archivo para verificar el acceso 
 */
public class Persona {
    private String nombre;
    private String codigo;
    private String contra;

    public Persona() {
    }

    public Persona(String nombre, String codigo, String contra) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.contra = contra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    @Override
    public String toString() {
        return nombre ;
    }
    
    
    
}
