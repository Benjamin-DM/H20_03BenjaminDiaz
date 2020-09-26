package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Persona;
import modelo.Sucursal;
import modelo.Venta;
import servicios.UtilToSql;

public class VentaImpl extends Conexion implements ICrud<Venta> {

    @Override
    public void registrar(Venta modelo) throws Exception {
        try {
            String sql = "INSERT INTO VENTA (IDVEN,TIPVEN,PAGVEN,IDPER,IDSUC,FECVEN) VALUES (?,?,?,?,?,?)";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setInt(1, modelo.getIDVEN());
            ps.setString(2, modelo.getTIPVEN());
            ps.setString(3, modelo.getPAGVEN());
            ps.setInt(4, modelo.getIDPER());
            ps.setInt(5, modelo.getIDSUC());
            ps.setDate(6, UtilToSql.convert(modelo.getFECVEN()));
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error en registrar impl Sucursal" + e.getMessage());
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void editar(Venta modelo) throws Exception {
        try {
            String sql = "UPDATE VENTA SET TIPVEN=?, PAGVEN=?, IDPER=?, IDSUC=?, FECVEN=? WHERE IDVEN=?";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setString(1, modelo.getTIPVEN());
            ps.setString(2, modelo.getPAGVEN());
            ps.setInt(3, modelo.getIDPER());
            ps.setInt(4, modelo.getIDSUC());
            ps.setDate(5, UtilToSql.convert(modelo.getFECVEN()));
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al editar " + e.getMessage());
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void eliminar(Venta modelo) throws Exception {
        try {
            String sql = "DELETE VENTA WHERE IDVEN=?";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setInt(1, modelo.getIDVEN());
            ps.executeUpdate();
            ps.clearParameters();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al eliminar " + e.getMessage());
        } finally {
            this.desconectar();
        }
    }

    @Override
    public List<Venta> listar() throws Exception {
        List<Venta> listaVenta = null;
        try {
            String sql1 = "select\n"
                    + "IDVEN,\n"
                    + "PERSONA.IDPER,\n"
                    + "PERSONA.NOMPER,\n"
                    + "PERSONA.APEPATPER,\n"
                    + "PERSONA.APEMATPER,\n"
                    + "PERSONA.TIPPER\n"
                    + "from VENTA\n"
                    + "inner join PERSONA on\n"
                    + "PERSONA.IDPER = VENTA.IDPER";
            String sql = "select \n"
                    + "SUCURSAL.IDSUC,\n"
                    + "SUCURSAL.NOMSUC,\n"
                    + "SUCURSAL.IDSUC,\n"
                    + "SUCURSAL.DISSUC,\n"
                    + "FECVEN\n"
                    + "PAGVEN\n"
                    + "from VENTA\n"
                    + "inner join SUCURSAL ON SUCURSAL.IDSUC = VENTA.IDSUC\n";
            try {
                PreparedStatement qs = this.conectar().prepareStatement(sql1);
                PreparedStatement ps = this.conectar().prepareStatement(sql);
                ResultSet rs1 = qs.executeQuery();
                ResultSet rs = ps.executeQuery();
                listaVenta = new ArrayList<>();

                while (rs1.next() & rs.next()) {
                    Venta v = new Venta();
                    Persona p = new Persona();
                    Sucursal c = new Sucursal();
                    p.setNOMPER(rs1.getString("NOMPER"));
                    p.setAPEPATPER(rs1.getString("APEPATPER"));
                    p.setAPEMATPER(rs1.getString("APEMATPER"));
                    p.setTIPPER(rs1.getString("TIPPER"));
                    p.setIDPER(rs1.getInt("IDPER"));
                    v.setIDVEN(rs1.getInt("IDVEN"));
                    v.setFECVEN(rs.getDate("FECVEN"));
                    v.setPAGVEN(rs.getString("PAGVEN"));
                    c.setNOMSUC(rs.getString("NOMSUC"));
                    c.setDISSUC(rs.getString("DISSUC"));
                    c.setIDSUC(rs.getInt("IDSUC"));
                    c.setPersona(p);
                    v.setSucursal(c);                    
                    listaVenta.add(v);
                }
                rs1.close();
                qs.close();
                rs.close();
                ps.close();
            } catch (Exception e) {
                System.out.println("Error aca en la wea de LISTAR VENTA " + e.getMessage());
            }
        } catch (Exception e) {

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
