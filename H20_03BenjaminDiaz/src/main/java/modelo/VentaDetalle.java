
package modelo;


public class VentaDetalle {
    private int IDVENDET;
    private String COMVENDET;
    private Venta venta = new Venta();
    private Producto producto = new Producto();

    public int getIDVENDET() {
        return IDVENDET;
    }

    public void setIDVENDET(int IDVENDET) {
        this.IDVENDET = IDVENDET;
    }

    public String getCOMVENDET() {
        return COMVENDET;
    }

    public void setCOMVENDET(String COMVENDET) {
        this.COMVENDET = COMVENDET;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "VentaDetalle{" + "IDVENDET=" + IDVENDET + ", COMVENDET=" + COMVENDET + ", venta=" + venta + ", producto=" + producto + '}';
    }
    
}
