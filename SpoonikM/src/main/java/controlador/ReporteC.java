
package controlador;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import service.Reportes;

/**
 *
 * @author Usuario
 */
@Named(value = "reporteC")
@SessionScoped
public class ReporteC implements Serializable {

    /**
     * Creates a new instance of ReporteC
     */
    public void reportPersona(){
    Reportes reporte = new Reportes();
        try{
           Map<String, Object> parameters = new HashMap();
           reporte.exportarPDFGlobal(parameters,"ReportPersona.jasper","ReporteDePersonas.pdf");
        } catch (Exception e) {
            System.out.println("error:"+e);
        }
    }  
    public void reportConsumo(){
    Reportes reporte = new Reportes();
        try{
           Map<String, Object> parameters = new HashMap();
           reporte.exportarPDFGlobal(parameters,"Consumo Personas.jasper","ReporteDeConsumo.pdf");
        } catch (Exception e) {
            System.out.println("error:"+e);
        }
    }  
    public void reportFecha(){
    Reportes reporte = new Reportes();
        try{
           Map<String, Object> parameters = new HashMap();
           reporte.exportarPDFGlobal(parameters,"ReporteDeFechacom.jasper","ReporteDeFecha.pdf");
        } catch (Exception e) {
            System.out.println("error:"+e);
        }
    }  
}