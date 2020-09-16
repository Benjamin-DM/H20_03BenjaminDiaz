package controlador;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import service.Reportes;

/**
 *
 * @author Usuario
 */
@Named(value = "reporteC")
@SessionScoped
public class REPORTES implements Serializable {

    /**
     * Creates a new instance of ReporteC
     */
    public REPORTES() {
       
    }
    public void ReportPersona(){
    Reportes reporte = new Reportes();
        try {
            Map<String, Object> parameters = new HashMap();
            reporte.exportarPDFGlobal(parameters,
                    "PERSONA.jasper", "Persona.pdf");
        } catch (Exception e) {
            System.out.println("error:"+e);
        }
    }
   
}
