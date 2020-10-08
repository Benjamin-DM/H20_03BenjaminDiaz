package controlador;

import dao.DetalleImpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import modelo.Detalle;

@Named(value = "detalleC")
@SessionScoped
public class DetalleC implements  Serializable{
    private Detalle detalle;
    private List<Detalle> lstDetalle;
    private DetalleImpl dao;

    public DetalleC() {
    detalle = new Detalle();
    lstDetalle = new ArrayList<>();
    dao = new DetalleImpl();
    }

 public void agregar(){
     try {
//         Detalle d =new Detalle();
       Detalle d = dao.obtenerdatos(detalle.getIDPRO(),detalle.getIDPER());
         System.out.println("Obtener datos" + d);

       d.setTIPVEN(detalle.getTIPVEN());
       d.setNOMPRO(d.getProducto().getNOMPRO());
       d.setNOMPER(d.getPersona().getNOMPER());
       d.setAPEPER(d.getPersona().getAPEPER());

       lstDetalle.add(d);

     } catch (Exception e) {
         System.out.println("Error en agregar" + e.getMessage());
     }
 }

 public void listar(){
     try {

     } catch (Exception e) {
         System.out.println("Error en listar" + e.getMessage());
     }
 }

 public void eliminar(Detalle d){
     try {
         lstDetalle.remove(d);
     } catch (Exception e) {
         System.out.println("Error en eliminar" + e.getMessage());
     }
 }



    public Detalle getDetalle() {
        return detalle;
    }

    public void setDetalle(Detalle detalle) {
        this.detalle = detalle;
    }

    public List<Detalle> getLstDetalle() {
        return lstDetalle;
    }

    public void setLstDetalle(List<Detalle> lstDetalle) {
        this.lstDetalle = lstDetalle;
    }

    public DetalleImpl getDao() {
        return dao;
    }

    public void setDao(DetalleImpl dao) {
        this.dao = dao;
    }

}