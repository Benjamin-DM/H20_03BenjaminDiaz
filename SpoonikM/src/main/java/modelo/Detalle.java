package modelo;


public class Detalle {
private int IDVENDET;
  private int IDVEN;
  private int IDPRO;
  private int CANVENDET;
  private String COMVENDET;
  private int IDASIPER;
  private Persona persona= new Persona();
  private AsignacionP asignacionP =new AsignacionP ();
  private Producto producto = new Producto ();
  private Venta venta = new Venta ();

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
