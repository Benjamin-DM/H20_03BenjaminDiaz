package controlador;

import dao.AsignacionImpl;
import java.io.Serializable;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import modelo.Asignacion;

@Named(value = "AsignacionC")
@SessionScoped
public class AsignacionC implements Serializable {

    
    private Asignacion modelo;
    private AsignacionImpl dao;
    private List<Asignacion> listarA;
    private Date newDate;
    private SimpleDateFormat dateformat = new SimpleDateFormat("yyyy/MM/dd");

    public AsignacionC() {
        modelo = new Asignacion();
        dao = new AsignacionImpl();
        listarA = new ArrayList<>();
    }

    @PostConstruct
    public void init() {
        try {
            listar();
        } catch (Exception e) {
            System.out.println("Error al listar");
        }

    }

    public void llenardatos(Asignacion asi) {
        this.modelo.setIDASICOM(asi.getIDASICOM());
        this.modelo.setIDCOM(asi.getComida().getIDCOM());
        this.modelo.setFECASICOM(asi.getFECASICOM());
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-d");
        try {
            this.newDate = formato.parse(modelo.getFECASICOM());
            System.out.println("esto es asignacion_comida de tabla: " + asi);         
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }

    public void registrar() {
        try {
            System.out.println("Esto es newDate "+ newDate );
            modelo.setFECASICOM(dateformat.format(newDate));            
            dao.registrar(modelo);
            System.out.println("Asignacion: " + modelo.toString());
            listar();
        } catch (Exception e) {
            System.out.println("Error al registrar AsignacionC: " + e.getMessage());
        }
    }
//        this.modelo.setIDASICOM(asi.getIDASICOM());
//        this.modelo.setIDCOM(asi.getIDCOM());
//        this.modelo.setIDPER(asi.getIDPER());
//        this.modelo.setFECHASICOM(asi.getFECHASICOM());
//        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-d");
//                    this.newDate = formato.parse(modelo.getFECHASICOM());
    public void editar() {
        try {
            modelo.setFECASICOM(dateformat.format(newDate));
            dao.editar(modelo);
            listar();
            } catch (Exception e) {
            System.out.println("Error al editar AsignacionC" + e.getMessage());

        }
    }

    public void eliminar(Asignacion asi) {
        try {
            System.out.println("envia asi " + asi);
            dao.eliminar(asi);
            listar();
        } catch (Exception e) {
            System.out.println("Error al eliminar AsignacionC" + e.getMessage());
        }
    }

    public void listar() {
        try {
            listarA = dao.listar();
        } catch (Exception e) {
            System.out.println("Error al listar AsignacionC" + e.getMessage());
            System.out.println("tas mandando fecha " + newDate);
        }
    }

    public void limpiar() {
        this.modelo = new Asignacion();
        this.newDate = new Date();
    }

    public Asignacion getModelo() {
        return modelo;
    }

    public void setModelo(Asignacion modelo) {
        this.modelo = modelo;
    }

    public AsignacionImpl getDao() {
        return dao;
    }

    public void setDao(AsignacionImpl dao) {
        this.dao = dao;
    }

    public List<Asignacion> getListarA() {
        return listarA;
    }

    public void setListarA(List<Asignacion> listarA) {
        this.listarA = listarA;
    }

    public Date getNewDate() {
        return newDate;
    }

    public void setNewDate(Date newDate) {
        this.newDate = newDate;
    }

    public SimpleDateFormat getDateformat() {
        return dateformat;
    }

    public void setDateformat(SimpleDateFormat dateformat) {
        this.dateformat = dateformat;
    }
}
