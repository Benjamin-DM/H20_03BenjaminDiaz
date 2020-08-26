package controlador;

import dao.AsignacionPImpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import modelo.AsignacionP;


@Named(value = "AsignacionPC")
@SessionScoped
public class AsignacionPC implements Serializable {

    
    private AsignacionP modelo;
    private AsignacionPImpl dao;
    private List<AsignacionP> listarAP;

    public AsignacionPC() {
        modelo = new AsignacionP();
        dao = new AsignacionPImpl();
        listarAP = new ArrayList<>();
    }
    @PostConstruct
    public void init() {
        try {
            listar();
        } catch (Exception e) {
            System.out.println("Error al listar");
        }

    }

    public void llenardatos(AsignacionP asip) {
        this.modelo.setIDASICOM(asip.getIDASIPER());
        this.modelo.setIDPER(asip.getPersona().getIDPER());
        try {
            System.out.println("esto es asignacion_comida de tabla: " + asip);         
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }

    public void registrar() {
        try {            
            dao.registrar(modelo);
            System.out.println("Asignacion: " + modelo.toString());
            listar();
        } catch (Exception e) {
            System.out.println("Error al registrar AsignacionC: " + e.getMessage());
        }
    }
    public void editar() {
        try {
            dao.editar(modelo);
            listar();
            } catch (Exception e) {
            System.out.println("Error al editar AsignacionPC" + e.getMessage());

        }
    }

    public void eliminar(AsignacionP asip) {
        try {
            System.out.println("envia asi " + asip);
            dao.eliminar(asip);
            listar();
        } catch (Exception e) {
            System.out.println("Error al eliminar AsignacionPC" + e.getMessage());
        }
    }

    private void listar() {
        try {
            listarAP = dao.listar();
        } catch (Exception e) {
            System.out.println("Error al listar AsignacionPC" + e.getMessage());
        }
    }

    public void limpiar() {
        this.modelo = new AsignacionP();
    }

    public AsignacionP getModelo() {
        return modelo;
    }

    public void setModelo(AsignacionP modelo) {
        this.modelo = modelo;
    }

    public AsignacionPImpl getDao() {
        return dao;
    }

    public void setDao(AsignacionPImpl dao) {
        this.dao = dao;
    }

    public List<AsignacionP> getListarAP() {
        return listarAP;
    }

    public void setListarAP(List<AsignacionP> listarAP) {
        this.listarAP = listarAP;
    }



}

