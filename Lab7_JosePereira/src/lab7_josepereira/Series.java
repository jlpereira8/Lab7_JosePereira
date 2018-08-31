/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_josepereira;

import java.util.ArrayList;

/**
 *
 * Las series tienen Nombre, tiempo de duración en minutos por capítulos, categorías(tiene libertad para poner las categorías que quiera) 
 * actores principales , numero de temporadas , productora , idioma original , si tiene doblaje  y si tiene subtítulos al español.
 */
public class Series {
    private String nombre;
    private int duracion_minutos;
    private String Categoria;
    private ArrayList<Actores_Principales_Series> Actores_Principales;
    private int num_temporadas;
    private String productora;
    private String idioma_original;
    private String doblaje_si_no;
    private String subt_si_no;

    public Series() {
    }

    public Series(String nombre, int duracion_minutos, String Categoria, ArrayList<Actores_Principales_Series> Actores_Principales, int num_temporadas, String productora, String idioma_original, String doblaje_si_no, String subt_si_no) {
        this.nombre = nombre;
        this.duracion_minutos = duracion_minutos;
        this.Categoria = Categoria;
        this.Actores_Principales = Actores_Principales;
        this.num_temporadas = num_temporadas;
        this.productora = productora;
        this.idioma_original = idioma_original;
        this.doblaje_si_no = doblaje_si_no;
        this.subt_si_no = subt_si_no;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion_minutos() {
        return duracion_minutos;
    }

    public void setDuracion_minutos(int duracion_minutos) {
        this.duracion_minutos = duracion_minutos;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public ArrayList<Actores_Principales_Series> getActores_Principales() {
        return Actores_Principales;
    }

    public void setActores_Principales(ArrayList<Actores_Principales_Series> Actores_Principales) {
        this.Actores_Principales = Actores_Principales;
    }

    public int getNum_temporadas() {
        return num_temporadas;
    }

    public void setNum_temporadas(int num_temporadas) {
        this.num_temporadas = num_temporadas;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public String getIdioma_original() {
        return idioma_original;
    }

    public void setIdioma_original(String idioma_original) {
        this.idioma_original = idioma_original;
    }

    public String getDoblaje_si_no() {
        return doblaje_si_no;
    }

    public void setDoblaje_si_no(String doblaje_si_no) {
        this.doblaje_si_no = doblaje_si_no;
    }

    public String getSubt_si_no() {
        return subt_si_no;
    }

    public void setSubt_si_no(String subt_si_no) {
        this.subt_si_no = subt_si_no;
    }

    @Override
    public String toString() {
        return "Series{" + "nombre=" + nombre + ", duracion_minutos=" + duracion_minutos + ", Categoria=" + Categoria + ", Actores_Principales=" + Actores_Principales + ", num_temporadas=" + num_temporadas + ", productora=" + productora + ", idioma_original=" + idioma_original + ", doblaje_si_no=" + doblaje_si_no + ", subt_si_no=" + subt_si_no + '}';
    }

   
   
}
