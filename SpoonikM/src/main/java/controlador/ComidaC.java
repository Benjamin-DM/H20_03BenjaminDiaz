package controlador;

import dao.ComidaImpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import modelo.Comida;



@Named(value = "comidaC")
@SessionScoped
public class ComidaC implements Serializable {

    private Comida modelo;
    private ComidaImpl dao;
    private List<Comida> listarC;

    public ComidaC() {
        modelo = new Comida();
        dao = new ComidaImpl();
        listarC = new ArrayList<>();

    }

    @PostConstruct
    public void init() {
        try {
            listar();
        } catch (Exception e) {
            System.out.println("Error al listar");
        }
    }

    public void llenardatos(Comida com) {
        try {
            System.out.println("esto es comida de tabla: " + com);
            this.modelo = com;
            prueba();
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }

    public void registrar()  {
        try {
            if (dao.existe(modelo, listarC) == false) {
                dao.registrar(modelo);
                System.out.println("Comida: " + modelo.toString());
                listar();
            } else {
                FacesContext.getCurrentInstance().addMessage(null,
                        new FacesMessage(FacesMessage.SEVERITY_FATAL,
                                "La comida que intentaste registrar, ya existe.",
                                null));

            }
        } catch (Exception e) {
            System.out.println("Error al registar ComidaC:" + e.getMessage());
        }
    }

    public void editar() {
        try {
            dao.editar(modelo);
        } catch (Exception e) {
            System.out.println("Error al editar ComidaC" + e.getMessage());
        }
    }

    public void eliminar(Comida com) {
        try {
            System.out.println("envia com" + com);
            dao.eliminar(com);
            listar();
        } catch (Exception e) {
            System.out.println("Error al eliminar ComidaC" + e.getMessage());
        }
    }

    public void listar() {
        try {
            listarC = dao.listar();
        } catch (Exception e) {
            System.out.println("Error al listar ComidaC" + e.getMessage());
        }
    }

    public void limpiar() {
        this.modelo= new Comida();
    }

    public void prueba() {
        System.out.println("tas mandando " + modelo.toString());

    }  

    public Comida getModelo() {
        return modelo;
    }

    public void setModelo(Comida modelo) {
        this.modelo = modelo;
    }

    public ComidaImpl getDao() {
        return dao;
    }

    public void setDao(ComidaImpl dao) {
        this.dao = dao;
    }

    public List<Comida> getListarC() {
        return listarC;
    }

    public void setListarC(List<Comida> listarC) {
        this.listarC = listarC;
    }
}
