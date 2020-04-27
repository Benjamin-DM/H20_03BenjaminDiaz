package dao;

import java.sql.PreparedStatement;
import java.util.List;
import modelo.Persona;
import modelo.Venta;

public class VentaImpl extends Conexion implements ICrud<Venta>{

    @Override
    public void registrar(Venta modelo) throws Exception {
        try {
            String sql = "INSERT VENTA (TIPO, FECHA, ESTADO) values (?,?,'F')";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setString(1, modelo.getTipo());
            ps.setString(2, modelo.getFecha());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void editar(Venta modelo) throws Exception {
      try {
            String sql = "UPDATE VENTA SET TIPO=?, FECHA=?, ESTADO=? WHERE ID=?";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setString(1, modelo.getTipo());
            ps.setString(2, modelo.getFecha());
            ps.setString(3, modelo.getEstado());
            ps.setInt(4, modelo.getId());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.desconectar();
        }}

    @Override
    public void eliminar(Venta modelo) throws Exception {
        try {
            String sql = "UPDATE VENTA SET ESTADO=? WHERE ID=?";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setString(1, "I");
            ps.setInt(2, modelo.getId());
            ps.executeUpdate();
            ps.clearParameters();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.desconectar();
        }
    }

    @Override
    public List<Venta> listar() throws Exception {
      String sql = " SELECT p.id, p.nom, v.id, v.tipo FROM VENTA v INNER JOIN PERSONA p";
        Venta v = new Venta();
        Persona p = new Persona();
        p.setId(1212);
        v.setPersona(p);
        return null;
        }

    @Override
    public Venta obtenerModelo(Venta modelo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Venta> listar(Venta modelo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
