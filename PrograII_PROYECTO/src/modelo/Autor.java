
package modelo;

import java.util.ArrayList;

public class Autor {
    private String nombreAutor;
    private String lugarNacimiento;
    private String generoAutor;
    private String sexoAutor;
    private ArrayList<Libro> librosPublicados;

    public String getNombreAutor() {
        return nombreAutor;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public String getGeneroAutor() {
        return generoAutor;
    }

    public String getSexoAutor() {
        return sexoAutor;
    }

    public ArrayList<Libro> getLibrosPublicados() {
        return librosPublicados;
    }
    
    ////////////////////

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public void setGeneroAutor(String generoAutor) {
        this.generoAutor = generoAutor;
    }

    public void setSexoAutor(String sexoAutor) {
        this.sexoAutor = sexoAutor;
    }

    public void setLibrosPublicados(ArrayList<Libro> librosPublicados) {
        this.librosPublicados = librosPublicados;
    }
    
    
    
}
