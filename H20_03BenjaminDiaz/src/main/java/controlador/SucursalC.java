package controlador;

import dao.SucursalImpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import modelo.Sucursal;

/**
 *
 * @author USUARIO
 */
 
@Named(value = "SucursalC")
@SessionScoped
public class SucursalC implements Serializable {

    
    private Sucursal modelo;
    private SucursalImpl dao;
    private List<Sucursal> listarS;
    

    public SucursalC() {
        modelo = new Sucursal();
        dao = new SucursalImpl();
        listarS = new ArrayList<>();
    }

    @PostConstruct
    public void init() {
        try {
            listar();
        } catch (Exception e) {
            System.out.println("Error al listar");
        }

    }

    public void llenardatos(Sucursal suc) {
        this.modelo.setIDSUC(suc.getIDSUC());
        this.modelo.setIDPER(suc.getPersona().getIDPER());
        try {
            System.out.println("esto es sucural de tabla: " + suc);         
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
            System.out.println("Error al editar AsignacionC" + e.getMessage());

        }
    }

    public void eliminar(Sucursal suc) {
        try {
            System.out.println("envia asi " + suc);
            dao.eliminar(suc);
            listar();
        } catch (Exception e) {
            System.out.println("Error al eliminar AsignacionC" + e.getMessage());
        }
    }

    public void listar() {
        try {
            listarS = dao.listar();
        } catch (Exception e) {
            System.out.println("Error al listar AsignacionC" + e.getMessage());
            
        }
    }

    public void limpiar() {
        this.modelo = new Sucursal();
    }

    public Sucursal getModelo() {
        return modelo;
    }

    public void setModelo(Sucursal modelo) {
        this.modelo = modelo;
    }

    public SucursalImpl getDao() {
        return dao;
    }

    public void setDao(SucursalImpl dao) {
        this.dao = dao;
    }

    public List<Sucursal> getListarS() {
        return listarS;
    }

    public void setListarS(List<Sucursal> listarS) {
        this.listarS = listarS;
    }

}
