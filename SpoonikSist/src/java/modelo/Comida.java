package modelo;


public class Comida {
    private Integer id;
    private String Nombre, Estado;
    private String Costo;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getCosto() {
        return Costo;
    }

    public void setCosto(String Costo) {
        this.Costo = Costo;
    }
}
