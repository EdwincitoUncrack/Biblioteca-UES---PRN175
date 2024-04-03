
package modelo;

import java.util.ArrayList;

public class Carrera {
    private String codigoCarrera;
    private String nombreCarrera;
    private ArrayList<Ciclo> ciclosList;

    public String getCodigoCarrera() {
        return codigoCarrera;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public ArrayList<Ciclo> getCiclosList() {
        return ciclosList;
    }
    
    ///////////////////7

    public void setCodigoCarrera(String codigoCarrera) {
        this.codigoCarrera = codigoCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public void setCiclosList(ArrayList<Ciclo> ciclosList) {
        this.ciclosList = ciclosList;
    }
    
    
}
