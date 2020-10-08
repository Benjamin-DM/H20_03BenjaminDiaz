package modelo;


public class Detalle {
private int IDVENDET;
  private int IDVEN;
  private int IDPRO;
  private int CANVENDET;
  private String COMVENDET;
  private int IDASIPER;
  private int IDPER;
  private String TIPVEN;
  private String  NOMPRO;
  private String NOMPER;
  private String APEPER;
  private Persona persona= new Persona();
  private AsignacionP asignacionP =new AsignacionP ();
  private Producto producto = new Producto ();
  private Venta venta = new Venta ();

     public Detalle(int IDVENDET, int IDVEN, int IDPRO, int CANVENDET, String COMVENDET, int IDASIPER, int IDPER, String TIPVEN, String NOMPRO, String NOMPER, String APEPER, Persona persona,Producto producto) {
        this.IDVENDET = IDVENDET;
        this.IDVEN = IDVEN;
        this.IDPRO = IDPRO;
        this.CANVENDET = CANVENDET;
        this.COMVENDET = COMVENDET;
        this.IDASIPER = IDASIPER;
        this.IDPER = IDPER;
        this.TIPVEN = TIPVEN;
        this.NOMPRO = NOMPRO;
        this.NOMPER = NOMPER;
        this.APEPER = APEPER;
        this.persona = persona;
        this.producto = producto;
    }

    public Detalle() {
    }

    public int getIDVENDET() {
        return IDVENDET;
    }

    public void setIDVENDET(int IDVENDET) {
        this.IDVENDET = IDVENDET;
    }

    public int getIDVEN() {
        return IDVEN;
    }

    public void setIDVEN(int IDVEN) {
        this.IDVEN = IDVEN;
    }

    public int getIDPRO() {
        return IDPRO;
    }

    public void setIDPRO(int IDPRO) {
        this.IDPRO = IDPRO;
    }

    public int getCANVENDET() {
        return CANVENDET;
    }

    public void setCANVENDET(int CANVENDET) {
        this.CANVENDET = CANVENDET;
    }

    public String getCOMVENDET() {
        return COMVENDET;
    }

    public void setCOMVENDET(String COMVENDET) {
        this.COMVENDET = COMVENDET;
    }

    public int getIDASIPER() {
        return IDASIPER;
    }

    public void setIDASIPER(int IDASIPER) {
        this.IDASIPER = IDASIPER;
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

    public String getNOMPRO() {
        return NOMPRO;
    }

    public void setNOMPRO(String NOMPRO) {
        this.NOMPRO = NOMPRO;
    }

    public String getNOMPER() {
        return NOMPER;
    }

    public void setNOMPER(String NOMPER) {
        this.NOMPER = NOMPER;
    }

    public String getAPEPER() {
        return APEPER;
    }

    public void setAPEPER(String APEPER) {
        this.APEPER = APEPER;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public AsignacionP getAsignacionP() {
        return asignacionP;
    }

    public void setAsignacionP(AsignacionP asignacionP) {
        this.asignacionP = asignacionP;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }
}

   