
package modelo;

public class Libro {
    private String isbnLibro;
    private Autor autorLibro;
    private String resumenLibro;
    private Integer cantidadLibro;

    public String getIsbnLibro() {
        return isbnLibro;
    }

    public Autor getAutorLibro() {
        return autorLibro;
    }

    public String getResumenLibro() {
        return resumenLibro;
    }

    public Integer getCantidadLibro() {
        return cantidadLibro;
    }
    
    ////////////

    public void setIsbnLibro(String isbnLibro) {
        this.isbnLibro = isbnLibro;
    }

    public void setAutorLibro(Autor autorLibro) {
        this.autorLibro = autorLibro;
    }

    public void setResumenLibro(String resumenLibro) {
        this.resumenLibro = resumenLibro;
    }

    public void setCantidadLibro(Integer cantidadLibro) {
        this.cantidadLibro = cantidadLibro;
    }
    
    
}
