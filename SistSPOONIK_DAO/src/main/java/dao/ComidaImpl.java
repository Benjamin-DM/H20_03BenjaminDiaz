package dao;

import java.sql.PreparedStatement;
import java.util.List;
import modelo.Comida;


public class ComidaImpl extends Conexion implements ICrud<Comida>{

    @Override
    public void registrar(Comida modelo) throws Exception {
       try {
            String sql = "INSERT INTO COMIDA (NOMBRE, COSTO, ESTADO) VALUES (?,?,'A')";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setString(1, modelo.getNombre());
            ps.setString(2, modelo.getCosto());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.desconectar();
        }    }

    @Override
    public void editar(Comida modelo) throws Exception {
   try {
            String sql = "UPDATE INVENTARIO SET NOMBRE=? ESTADO=?, COSTO=? WHERE ID=?";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setString(1, modelo.getNombre());
            ps.setString(2, modelo.getEstado());
            ps.setString(3, modelo.getCosto());
            ps.setInt(4, modelo.getId());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.desconectar();
        }    }

    @Override
    public void eliminar(Comida modelo) throws Exception {
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
        }    }

    @Override
    public List<Comida> listar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Comida> listar(Comida modelo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Comida obtenerModelo(Comida modelo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
