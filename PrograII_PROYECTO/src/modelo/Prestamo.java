
package modelo;

import java.util.Date;

public class Prestamo {
    private Libro libro;
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private Estudiante estudiante;

    public Libro getLibro() {
        return libro;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }
    
    ////////

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    
    
}
