package controlador;

import dao.PersonaImpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import modelo.Persona;

@Named(value = "personaC")
@SessionScoped
public class PersonaC implements Serializable {

    private Persona modelo;
    private PersonaImpl dao;
    private List<Persona> listarP;

    public PersonaC() {
        modelo = new Persona();
        dao = new PersonaImpl();
        listarP = new ArrayList<>();

    }

    @PostConstruct
    public void init() {
        try {
            listar();
        } catch (Exception e) {
            System.out.println("Error al listar");
        }
    }

    public void llenardatos(Persona per) {
        try {
            this.modelo = per;
            System.out.println("Este es persona: " + per);

        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }

    public void registrar() {
        try {
            if (dao.existe(modelo, listarP) == false) {
                dao.registrar(modelo);
                System.out.println("Persona: " + modelo.toString());
                listar();
            } else {
                FacesContext.getCurrentInstance().addMessage(null,
                        new FacesMessage(FacesMessage.SEVERITY_FATAL,
                                "La Persona que intentaste registrar, ya existe.",
                                null));

            }
        }catch (Exception e) {
            System.out.println("Error al registrar PersonaC: " + e.getMessage());
        }
    }

    public void editar() {
        try {
            dao.editar(modelo);
        } catch (Exception e) {
            System.out.println("Error al editar PersonaC" + e.getMessage());
        }
    }

    public void eliminar(Persona per) {
        try {
            System.out.println("envia per" + per);
            dao.eliminar(per);
            listar();
        } catch (Exception e) {
            System.out.println("Error al eliminar PersonaC" + e.getMessage());
        }
    }

    public void listar() {
        try {
            listarP = dao.listar();
        } catch (Exception e) {
            System.out.println("Error al listar PersonaC" + e.getMessage());
        }
    }

    public void limpiar() {
        this.modelo= new Persona();
    }

    public void prueba() {
        System.out.println("tas mandando " + modelo.toString());

    }

    /*son los getter y setter*/
    public Persona getModelo() {
        return modelo;
    }

    public void setModelo(Persona modelo) {
        this.modelo = modelo;
    }

    public PersonaImpl getDao() {
        return dao;
    }

    public void setDao(PersonaImpl dao) {
        this.dao = dao;
    }

    public List<Persona> getListarP() {
        return listarP;
    }

    public void setListarP(List<Persona> listarP) {
        this.listarP = listarP;
    }

}
