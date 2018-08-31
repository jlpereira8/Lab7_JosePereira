/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_josepereira;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author j0c3lwiz
 */
public class administrar_peliculas {

    private ArrayList<Peliculas> listaPeliculas = new ArrayList();
    private File archivo = null;

    public administrar_peliculas(String path) {
        archivo = new File(path);
    }

    public ArrayList<Peliculas> getListaPeliculas() {
        return listaPeliculas;
    }

    public void setListaPeliculas(ArrayList<Peliculas> listaPeliculas) {
        this.listaPeliculas = listaPeliculas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    //mutador extra

    public void setPelicula(Peliculas p) {
        this.listaPeliculas.add(p);
    }  


    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        /**
 *
 * @author j0c3lwiz
 * Las películas tienen Nombre , tiempo de duración en minutos , categoría(Suspenso  , Terror , Acción , Románticas , Ciencia Ficción  , Animación  ,Fantasía) 
 * Actores principales  , Director  , que compañía la produce , idioma original , si tiene doblaje , si tiene subtítulos al español.
 */
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Peliculas t : listaPeliculas) {
                bw.write(t.getNombre()+ ";");
                bw.write(t.getDuracion_minutos() + ";");
                bw.write(t.getCategoria() + ";");
                for (Actores_Principales_Pelis h : t.getActores_Principales()) {
                    bw.write(h.getNombre()+",");
                }
                bw.write(";");
                bw.write(t.getDirector()+";");
                bw.write(t.getCompania()+";");
                bw.write(t.getIdioma()+";");
                bw.write(t.getDoblaje_si_no()+";");
                bw.write(t.getSubtitulos_si_no()+";");
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaPeliculas = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    /*
                    String nombre, int duracion_minutos, String Categoria, ArrayList<Actores_Principales_Pelis> Actores_Principales, String Director, 
                    String Compania, String idioma, String doblaje_si_no, String subtitulos_si_no
                    */
                    ArrayList<Actores_Principales_Pelis> temp_actores=new ArrayList();
                    String nombre;
                    int duracion;
                    String Categoria,Director,Compania,Idioma,doblaje,subtitulos;                   
                    nombre=sc.next();
                    duracion=sc.nextInt();
                    Categoria=sc.next();
                    Scanner s2=new Scanner(sc.next());
                    s2.useDelimiter(",");
                    while (s2.hasNext()) {
                        temp_actores.add(new Actores_Principales_Pelis(s2.next()));
                    }//fin while interno
                    Director=sc.next();
                    Compania=sc.next();
                    Idioma=sc.next();
                    doblaje=sc.next();
                    subtitulos=sc.next();
                    listaPeliculas.add(new Peliculas(nombre, duracion, Categoria, temp_actores, Director, Compania, Idioma, doblaje, subtitulos));
                    listaPeliculas.get(listaPeliculas.size()-1).setActores_Principales(temp_actores);
                }
            } catch (Exception e) {
            } finally {
                sc.close();
            }
        } 
    }
}
