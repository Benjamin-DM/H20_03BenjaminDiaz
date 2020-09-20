package modelo;

public class Venta {
  private int IDVEN;
  private int IDPER;
  private String TIPVEN;
  private int IDASICOM;
  private Persona persona= new Persona();
  private Asignacion asignacion =new Asignacion();

    public Venta() {
    }

  
    public Venta(int IDVEN, int IDPER, String TIPVEN, int IDASICOM, Persona persona , Asignacion asignacion) {
        this.IDVEN = IDVEN;
        this.IDPER = IDPER;
        this.TIPVEN = TIPVEN;
        this.IDASICOM = IDASICOM;
        this.persona = persona;
        this.asignacion = asignacion;
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

    public int getIDASICOM() {
        return IDASICOM;
    }

    public void setIDASICOM(int IDASICOM) {
        this.IDASICOM = IDASICOM;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Asignacion getAsignacion() {
        return asignacion;
    }

    public void setAsignacion(Asignacion asignacion) {
        this.asignacion = asignacion;
    }

  
    
}

