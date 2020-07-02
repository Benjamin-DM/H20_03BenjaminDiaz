package modelo;

public class Producto {
    private Integer id;
    private String Costo;
    private String Estado, Nombre;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCosto() {
        return Costo;
    }

    public void setCosto(String Costo) {
        this.Costo = Costo;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    
}
