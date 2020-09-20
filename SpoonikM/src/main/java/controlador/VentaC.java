package controlador;

import dao.VentaImpl;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import modelo.Venta;

@Named(value = "ventaC")
@SessionScoped
public class VentaC implements Serializable {

    private Venta modelo;
    private VentaImpl dao;
    private List<Venta> listarV;
    private Date newDate;
    private SimpleDateFormat dateformat = new SimpleDateFormat("yyyy/MM/dd");
   
    public VentaC() {
        modelo = new Venta();
        dao = new VentaImpl();
        listarV = new ArrayList<>();
    }

    @PostConstruct
    public void init() {
        try {
            listar();
        } catch (Exception e) {
            System.out.println("Error al listar");
        }

    }

    public void llenardatos(Venta ven) {
        this.modelo.setIDPER(ven.getPersona().getIDPER());
        this.modelo.setTIPVEN(ven.getTIPVEN());
        this.modelo.setIDASICOM(ven.getAsignacion().getIDASICOM());
        try {
            System.out.println("esto es Venta de comida: " + ven);         
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }

    public void registrar() {
        try {            
            dao.registrar(modelo);
            System.out.println("Venta: " + modelo.toString());
            listar();
        } catch (Exception e) {
            System.out.println("Error al registrar VentaC: " + e.getMessage());
        }
    }

    public void editar() {
        try {
            dao.editar(modelo);
            listar();
        } catch (Exception e) {
            System.out.println("Error al editar VentaC" + e.getMessage());
        }
    }

    public void eliminar(Venta ven) {
        try {  
           System.out.println("El item es" + ven);
            dao.eliminar(ven);
            listar();
        } catch (Exception e) {
            System.out.println("Error al eliminar VentaC" + e.getMessage());
        }
    }

    private void listar() {
        try {
            listarV = dao.listar();
        } catch (Exception e) {
            System.out.println("Error al listar VentaC" + e.getMessage());
        }
    }

    public void limpiar() {
        this.modelo = new Venta();
    }

    public Venta getModelo() {
        return modelo;
    }

    public void setModelo(Venta modelo) {
        this.modelo = modelo;
    }

    public VentaImpl getDao() {
        return dao;
    }

    public void setDao(VentaImpl dao) {
        this.dao = dao;
    }

    public List<Venta> getListarV() {
        return listarV;
    }

    public void setListarV(List<Venta> listarV) {
        this.listarV = listarV;
    }

}

