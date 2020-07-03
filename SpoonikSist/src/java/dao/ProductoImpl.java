package dao;

import java.sql.PreparedStatement;
import java.util.List;
import modelo.Producto;


public class ProductoImpl extends Conexion implements ICrud<Producto>{

    @Override
    public void registrar(Producto modelo) throws Exception {
         try {
            String sql = "INSERT PRODUCTO (NOMPRO, CSTPRO, ESTPRO) values (?,?,'A')";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setString(1, modelo.getNOMPRO());
            ps.setString(2, modelo.getCSTPRO());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.desconectar();
        }    }

    @Override
    public void editar(Producto modelo) throws Exception {
   try {
            String sql = "UPDATE PRODUCTO SET NOMPER=?, CSTPRO=?, ESTPRO=? WHERE IDPRO=?";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setString(1, modelo.getNOMPRO());
            ps.setString(2, modelo.getCSTPRO());
            ps.setString(3, modelo.getESTPRO());
            ps.setInt(4, modelo.getIDPRO());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.desconectar();
        }
    } 

    @Override
    public void eliminar(Producto modelo) throws Exception {
        try {
            String sql = "UPDATE PRODUCTO SET ESTPRO=? WHERE IDPRO=?";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setString(1, "I");
            ps.setInt(2, modelo.getIDPRO());
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
    public List<Producto> listar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Producto> listar(Producto modelo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Producto obtenerModelo(Producto modelo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
