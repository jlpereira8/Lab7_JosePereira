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
public class administrar_series {

    private ArrayList<Series> listaSeries = new ArrayList();
    private File archivo = null;

    public administrar_series(String path) {
        archivo = new File(path);
    }

    public ArrayList<Series> getListaSeries() {
        return listaSeries;
    }

    public void setListaSeries(ArrayList<Series> listaSeries) {
        this.listaSeries = listaSeries;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    //mutador extra
    public void setSeries(Series p) {
        this.listaSeries.add(p);
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        /**
         *
         * @author j0c3lwiz Las series tienen Nombre, tiempo de duración en
         * minutos por capítulos, categorías(tiene libertad para poner las
         * categorías que quiera) actores principales , numero de temporadas ,
         * productora , idioma original , si tiene doblaje y si tiene subtítulos
         * al español.
         */
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Series t : listaSeries) {
                bw.write(t.getNombre() + ";");
                bw.write(t.getDuracion_minutos() + ";");
                bw.write(t.getCategoria() + ";");
                for (Actores_Principales_Series h : t.getActores_Principales()) {
                    bw.write(h.getNombre() + ",");
                }
                bw.write(";");
                bw.write(t.getNum_temporadas() + ";");
                bw.write(t.getProductora() + ";");
                bw.write(t.getIdioma_original() + ";");
                bw.write(t.getDoblaje_si_no() + ";");
                bw.write(t.getSubt_si_no() + ";");
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
        listaSeries = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    /*
                    Las series tienen Nombre, tiempo de duración en minutos por capítulos, categorías(tiene libertad para poner las categorías que quiera) 
 *                  actores principales , numero de temporadas , productora , idioma original , si tiene doblaje  y si tiene subtítulos al español.
                     */
                    ArrayList<Actores_Principales_Series> temp_actores = new ArrayList();
                    String nombre;
                    int duracion,num_temps;
                    String Categoria, productora,idioma_original,doblaje,subs;
                    nombre = sc.next();
                    duracion = sc.nextInt();
                    Categoria = sc.next();
                    Scanner s2 = new Scanner(sc.next());
                    s2.useDelimiter(",");
                    while (s2.hasNext()) {
                        temp_actores.add(new Actores_Principales_Series(s2.next()));
                    }//fin while interno
                    num_temps=sc.nextInt();
                    productora=sc.next();
                    idioma_original=sc.next();
                    doblaje=sc.next();
                    subs=sc.next();
                    listaSeries.add(new Series(nombre, duracion, Categoria, temp_actores, num_temps, productora, idioma_original, doblaje, subs));
                    listaSeries.get(listaSeries.size() - 1).setActores_Principales(temp_actores);
                }
            } catch (Exception e) {
            } finally {
                sc.close();
            }
        }
    }
}
