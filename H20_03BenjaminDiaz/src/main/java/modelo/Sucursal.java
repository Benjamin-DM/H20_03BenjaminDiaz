package modelo;


public class Sucursal {
    private int IDSUC;
    private String NOMSUC;
    private String DISSUC;
    private String ESTSUC;
    private int IDPER;
    private Persona persona = new Persona();

    public int getIDPER() {
        return IDPER;
    }

    public void setIDPER(int IDPER) {
        this.IDPER = IDPER;
    }

    public int getIDSUC() {
        return IDSUC;
    }

    public void setIDSUC(int IDSUC) {
        this.IDSUC = IDSUC;
    }

    public String getNOMSUC() {
        return NOMSUC;
    }

    public void setNOMSUC(String NOMSUC) {
        this.NOMSUC = NOMSUC;
    }

    public String getDISSUC() {
        return DISSUC;
    }

    public void setDISSUC(String DISSUC) {
        this.DISSUC = DISSUC;
    }

    public String getESTSUC() {
        return ESTSUC;
    }

    public void setESTSUC(String ESTSUC) {
        this.ESTSUC = ESTSUC;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    
}
