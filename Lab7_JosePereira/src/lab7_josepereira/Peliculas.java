/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_josepereira;

/**
 *
 * @author j0c3lwiz
 * Las películas tienen Nombre , tiempo de duración en minutos , categoría(Suspenso  , Terror , Acción , Románticas , Ciencia Ficción  , Animación  ,Fantasía) 
 * Actores principales  , Director  , que compañía la produce , idioma original , si tiene doblaje , si tiene subtítulos al español.
 */
public class Peliculas {
    private String nombre;
    private int duracion_minutos;
    private String Categoria;
    private String Actores_Principales;
    private String Director;
    private String Compania;
    private String idioma;
    private String doblaje_si_no;
    private String subtitulos_si_no;

    public Peliculas() {
    }

    public Peliculas(String nombre, int duracion_minutos, String Categoria, String Actores_Principales, String Director, String Compania, String idioma, String doblaje_si_no, String subtitulos_si_no) {
        this.nombre = nombre;
        this.duracion_minutos = duracion_minutos;
        this.Categoria = Categoria;
        this.Actores_Principales = Actores_Principales;
        this.Director = Director;
        this.Compania = Compania;
        this.idioma = idioma;
        this.doblaje_si_no = doblaje_si_no;
        this.subtitulos_si_no = subtitulos_si_no;
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

    public String getActores_Principales() {
        return Actores_Principales;
    }

    public void setActores_Principales(String Actores_Principales) {
        this.Actores_Principales = Actores_Principales;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public String getCompania() {
        return Compania;
    }

    public void setCompania(String Compania) {
        this.Compania = Compania;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getDoblaje_si_no() {
        return doblaje_si_no;
    }

    public void setDoblaje_si_no(String doblaje_si_no) {
        this.doblaje_si_no = doblaje_si_no;
    }

    public String getSubtitulos_si_no() {
        return subtitulos_si_no;
    }

    public void setSubtitulos_si_no(String subtitulos_si_no) {
        this.subtitulos_si_no = subtitulos_si_no;
    }

    @Override
    public String toString() {
        return "Peliculas{" + "nombre=" + nombre + ", duracion_minutos=" + duracion_minutos + ", Categoria=" + Categoria + ", Actores_Principales=" + Actores_Principales + ", Director=" + Director + ", Compania=" + Compania + ", idioma=" + idioma + ", doblaje_si_no=" + doblaje_si_no + ", subtitulos_si_no=" + subtitulos_si_no + '}';
    }
    
    
    
    
}
