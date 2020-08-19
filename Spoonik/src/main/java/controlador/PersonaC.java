package controlador;

//import com.google.gson.JsonObject;
//import com.google.gson.JsonParser;
import dao.PersonaImpl;
//import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import modelo.Persona;
//import service.Servicios;


@Named(value = "personaC")
@SessionScoped
public class PersonaC implements Serializable {

    private Persona modelo;
    private PersonaImpl dao;
    private List<Persona> listarP;
//    private final Servicios services = new Servicios();

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
            System.out.println("esto es persona de tabla: " + per);
            this.modelo = per;
            listar();
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
//        JsonParser jsonParser = new JsonParser();
//        JsonObject jsonObject = (JsonObject) jsonParser.parse(services.datosAPI(per.getDNIPER()));
//
//        per.setNOMPER(jsonObject.get("nombres").getAsString());
//        per.setAPEPER((jsonObject.get("apellido_paterno").getAsString())
//                + (jsonObject.get("apellido_materno").getAsString()));
//        per.setDNIPER(jsonObject.get("dni").getAsInt());
//    }
//
//    public void registrar() {
//        try {
//            dao.registrar(modelo);
//            System.out.println("Persona: " + modelo.toString());
//            listar();
//        } catch (Exception e) {
//            System.out.println("Error al registrar PersonaC: " + e.getMessage());
//        }
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
