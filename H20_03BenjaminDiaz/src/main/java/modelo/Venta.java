
package modelo;

import java.util.Date;

public class Venta {
    private int IDVEN;
    private int IDPER;
    private int IDSUC;
    private String TIPVEN;
    private String PAGVEN;
    private Date FECVEN;
    private Persona persona = new Persona();
    private Sucursal sucursal = new Sucursal();

    public int getIDSUC() {
        return IDSUC;
    }

    public void setIDSUC(int IDSUC) {
        this.IDSUC = IDSUC;
    }

    public int getIDVEN() {
        return IDVEN;
    }

    public void setIDVEN(int IDVEN) {
        this.IDVEN = IDVEN;
    }

    public int getIDPER() {
        return IDPER;
    }

    public void setIDPER(int IDPER) {
        this.IDPER = IDPER;
    }

    public String getTIPVEN() {
        return TIPVEN;
    }

    public void setTIPVEN(String TIPVEN) {
        this.TIPVEN = TIPVEN;
    }

    public String getPAGVEN() {
        return PAGVEN;
    }

    public void setPAGVEN(String PAGVEN) {
        this.PAGVEN = PAGVEN;
    }

    public Date getFECVEN() {
        return FECVEN;
    }

    public void setFECVEN(Date FECVEN) {
        this.FECVEN = FECVEN;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    @Override
    public String toString() {
        return "Venta{" + "IDVEN=" + IDVEN + ", IDPER=" + IDPER + ", IDSUC=" + IDSUC + ", TIPVEN=" + TIPVEN + ", PAGVEN=" + PAGVEN + ", FECVEN=" + FECVEN + ", persona=" + persona + ", sucursal=" + sucursal + '}';
    }

    
}
