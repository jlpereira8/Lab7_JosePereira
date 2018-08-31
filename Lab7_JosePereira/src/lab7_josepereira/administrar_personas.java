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
public class administrar_personas {

    private ArrayList<Persona> listaPersonas = new ArrayList();
    private File archivo = null;

    public administrar_personas(String path) {
        archivo = new File(path);
    }

    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "administrar_personas{" + "listaPersonas=" + listaPersonas + '}';
    }
    //mutador extra

    public void setPersona(Persona p) {
        this.listaPersonas.add(p);
    }  


    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Persona t : listaPersonas) {
                bw.write(t.getNombre()+ ";");
                bw.write(t.getContra()+ ";");
                bw.write(t.getCodigo()+ ";");
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
        listaPersonas = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    String nombre,contra;
                    String codigo;
                    nombre=sc.next();                   
                    codigo=sc.next();
                    contra=sc.next();
                    listaPersonas.add(new Persona(nombre,contra,codigo));
                }
            } catch (Exception e) {
            } finally {
                sc.close();
            }
        } 
    }
}
