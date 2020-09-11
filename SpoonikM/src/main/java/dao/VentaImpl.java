package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Asignacion;
import modelo.Venta;
import modelo.Persona;


public class VentaImpl extends Conexion implements ICrud<Venta> {

    @Override
    public void registrar(Venta modelo) throws Exception {
        try {
            String sql = "INSERT INTO VENTA (IDPER, TIPVEN, IDASICOM) VALUES (?,?,?)";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setInt(1, modelo.getIDPER());
            ps.setString(2, modelo.getTIPVEN());
            ps.setInt(3, modelo.getIDASICOM());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error en registrar VENTADAO" + e.getMessage());
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void editar(Venta modelo) throws Exception {
        try {
            String sql = "UPDATE VENTA SET IDPER=?, TIPVEN=?,IDASICOM=? WHERE IDVEN=?";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setInt(1, modelo.getIDPER());
            ps.setString(2, modelo.getTIPVEN());
            ps.setInt(3, modelo.getIDASICOM());
            ps.setInt(4, modelo.getIDVEN());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al editar VentaDAO " + e.getMessage());
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void eliminar(Venta modelo) throws Exception {
        try {
            String sql = "DELETE FROM VENTA WHERE IDVEN=?";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setInt(1, modelo.getIDVEN());
            ps.executeUpdate();
            ps.clearParameters();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al eliminar VentaDAO " + e.getMessage());
        } finally {
            this.desconectar();
        }
    }

  @Override
    public List<Venta> listar() throws Exception {
        List<Venta> listaVenta = null;
        try {
            String sql = "select \n"
                    + "IDVEN,\n"
                    + "PERSONA.IDPER,\n"
                    + "PERSONA.NOMPER,\n"
                    + "PERSONA.APEPER,\n"
                    + "a. IDASICOM, \n"
                    + "TIPVEN, \n"
                    + "FECASICOM \n"
                    + "from VENTA \n"
                    + "inner join PERSONA on \n"
                    + "PERSONA.IDPER = VENTA.IDPER \n"
                    + "inner join ASIGNACION_COMIDA a on \n"
                    + "VENTA.IDASICOM = a.IDASICOM";
            try {
                PreparedStatement qs = this.conectar().prepareStatement(sql);
                ResultSet rs1 = qs.executeQuery();
                listaVenta = new ArrayList<>();

                while (rs1.next()) {
                   Venta v = new Venta();
                    Persona p = new Persona();
                    Asignacion a = new Asignacion();
                    p.setNOMPER(rs1.getString("NOMPER"));
                    p.setAPEPER(rs1.getString("APEPER"));
                    p.setIDPER(rs1.getInt("IDPER"));
                    a.setFECASICOM(rs1.getString("FECASICOM"));
                    a.setIDASICOM(rs1.getInt("IDASICOM"));
                    v.setTIPVEN(rs1.getString("TIPVEN"));
                    v.setPersona(p);
                    v.setAsignacion(a);
                    listaVenta.add(v);
                }
                rs1.close();
                qs.close();
            } catch (Exception e) {
                System.out.println("Error aca :v " + e.getMessage());
            }
           } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error en listar asignacion" + e.getMessage());
        } finally {
            this.desconectar();
        }
        return listaVenta;
    }

    @Override
    public List<Venta> listar(Venta modelo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Venta obtenerModelo(Venta modelo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
