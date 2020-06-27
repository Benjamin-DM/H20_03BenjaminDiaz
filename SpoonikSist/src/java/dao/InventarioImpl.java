package dao;

import java.sql.PreparedStatement;
import java.util.List;
import modelo.Inventario;


public class InventarioImpl extends Conexion implements ICrud<Inventario>{

    @Override
    public void registrar(Inventario modelo) throws Exception {
    try {
            String sql = "INSERT INTO PERSONA (FECHA, TIPO, COSTO, PRECIOVENTA,ESTADO) VALUES (?,?,?,?,'A')";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setString(1, modelo.getFecha());
            ps.setString(2, modelo.getTipo());
            ps.setString(3, modelo.getCosto());
            ps.setString(5, modelo.getPrecioVenta());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.desconectar();
        } }

    @Override
    public void editar(Inventario modelo) throws Exception {
         try {
            String sql = "UPDATE INVENTARIO SET TIPO=?, FECHA=?, ESTADO=?, COSTO=?, PRECIOVENTA=? WHERE ID=?";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setString(1, modelo.getTipo());
            ps.setString(2, modelo.getFecha());
            ps.setString(3, modelo.getEstado());
            ps.setString(4, modelo.getCosto());
            ps.setString(5, modelo.getPrecioVenta());
            ps.setInt(6, modelo.getId());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void eliminar(Inventario modelo) throws Exception {
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
    public List<Inventario> listar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Inventario> listar(Inventario modelo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Inventario obtenerModelo(Inventario modelo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
