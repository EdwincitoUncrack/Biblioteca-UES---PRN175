
package modelo;

public class Usuario {
    private String idUsuario;
    private String nombreUsuario;
    private String contrasenia;
    private Estudiante estudiante;
    private Rol rol;

    public String getIdUsuario() {
        return idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Rol getRol() {
        return rol;
    }
    
    ////////////////////

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
    
    
}
