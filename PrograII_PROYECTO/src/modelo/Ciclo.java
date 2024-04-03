
package modelo;

public class Ciclo {
    private int codigoCiclo;
    private String ciclo;
    private Carrera carrera;

    public int getCodigoCiclo() {
        return codigoCiclo;
    }

    public String getCiclo() {
        return ciclo;
    }

    public Carrera getCarrera() {
        return carrera;
    }
    
    ///////////////

    public void setCodigoCiclo(int codigoCiclo) {
        this.codigoCiclo = codigoCiclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
    
    
}
