
package modelo;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String carnet;
    private Ciclo ciclo;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCarnet() {
        return carnet;
    }

    public Ciclo getCiclo() {
        return ciclo;
    }
    
    //////////////////7

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public void setCiclo(Ciclo ciclo) {
        this.ciclo = ciclo;
    }
    
    
}
