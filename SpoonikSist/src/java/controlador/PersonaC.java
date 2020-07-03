package controlador;

import dao.PersonaImpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import modelo.Persona;

@Named(value = "personaC")
@SessionScoped
public class PersonaC implements Serializable {

    private Persona modelo;
    private PersonaImpl dao;
    private List<Persona> listar;

    @PostConstruct
    public void init() {
        modelo = new Persona();
        dao = new PersonaImpl();
        listar = new ArrayList<>();
    }

    public void registrar() {
        try {
            dao.registrar(modelo);
        } catch (Exception e) {
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

    public void eliminar() {
        try {
            dao.eliminar(modelo);
        } catch (Exception e) {
            System.out.println("Error al eliminar PersonaC" + e.getMessage());
        }
    }

    public void listar() {
        try {
            listar = dao.listar();
        } catch (Exception e) {
            System.out.println("Error al listar PersonaC" + e.getMessage());
        }
    }

    public void limpiar() {
        try {
            modelo = new Persona();
        } catch (Exception e) {
            System.out.println("Error al limpiar PersonaC" + e.getMessage());
        }
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

    public List<Persona> getListar() {
        return listar;
    }

    public void setListar(List<Persona> listar) {
        this.listar = listar;
    }

}
