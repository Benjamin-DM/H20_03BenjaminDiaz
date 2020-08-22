package controlador;

import dao.ProductoImpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import modelo.Producto;

@Named(value = "productoC")
@SessionScoped
public class ProductoC implements Serializable {

    private Producto modelo;
    private ProductoImpl dao;
    private List<Producto> listarPr;
    private double uno;
//    private boolean dos;

    public ProductoC() {
        modelo = new Producto();
        dao = new ProductoImpl();
        listarPr = new ArrayList<>();

    }

    @PostConstruct
    public void init() {
        try {
            listar();
        } catch (Exception e) {
            System.out.println("Error al listar");
        }

    }

    public void registrar() {
        try {
            modelo.setPREVENPRO((double) uno);
            if (dao.existe(modelo, listarPr) == false) {
                dao.registrar(modelo);
                System.out.println("Producto: " + modelo.toString());
                listar();
            } else {
                FacesContext.getCurrentInstance().addMessage(null,
                        new FacesMessage(FacesMessage.SEVERITY_FATAL,
                                "El producto que intentaste registrar, ya existe.",
                                null));

            }
        } catch (Exception e) {
            System.out.println("Error al registar ProductoC:" + e.getMessage());
        }
    }

    public void llenardatos(Producto pro) {
        try {
            uno = modelo.getPREVENPRO();
            this.modelo = pro;
            System.out.println("Este es producto: " + pro);

        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }

    public void listar() {
        try {
            listarPr = dao.listar();
        } catch (Exception e) {
            System.out.println("Error al listar" + e.getMessage());
        }
    }

    public void eliminar(Producto pro) {
        try {
            dao.eliminar(pro);
            listar();
        } catch (Exception e) {
            System.out.println("Error al eliminar" + e.getMessage());
        }
    }

    public void editar() {
        try {
            modelo.setPREVENPRO(uno);
            dao.editar(modelo);
        } catch (Exception e) {
            System.out.println("Error al editar" + e.getMessage());
        }
    }

//    public void cambiar() {
//       uno=true;
//       dos=true;
//        if (uno) {
//            uno=true;            
//        }else{
//            uno = false;
//        }
//            
//    }
    public void suma(){
        uno = this.modelo.getCOSPRO() + 1;
        
    }

    public void limpiar() {
        this.modelo = new Producto();
    }

    public double getUno() {
        return uno;
    }

    public void setUno(double uno) {
        this.uno = uno;
    }

    public Producto getModelo() {
        return modelo;
    }

    public void setModelo(Producto modelo) {
        this.modelo = modelo;
    }

    public ProductoImpl getDao() {
        return dao;
    }

    public void setDao(ProductoImpl dao) {
        this.dao = dao;
    }

    public List<Producto> getListarPr() {
        return listarPr;
    }

    public void setListarPr(List<Producto> listarPr) {
        this.listarPr = listarPr;
    }



   

    
}
