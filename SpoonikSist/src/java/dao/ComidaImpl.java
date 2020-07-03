package dao;

import java.sql.PreparedStatement;
import java.util.List;
import modelo.Comida;


public class ComidaImpl extends Conexion implements ICrud<Comida>{

    @Override
    public void registrar(Comida modelo) throws Exception {
       try {
            String sql = "INSERT INTO COMIDA (NOMCOM, CSTCOM, ESTCOM) VALUES (?,?,'A')";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setString(1, modelo.getNOMCOM());
            ps.setString(2, modelo.getCSTCOM());
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
            String sql = "UPDATE COMIDA SET NOMCOM=? ESTCOM=?, CSTCOM=? WHERE IDCOM=?";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setString(1, modelo.getNOMCOM());
            ps.setString(2, modelo.getESTCOM());
            ps.setString(3, modelo.getCSTCOM());
            ps.setInt(4, modelo.getIDCOM());
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
            String sql = "UPDATE COMIDA SET ESTCOM=? WHERE IDCOM=?";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setString(1, "I");
            ps.setInt(2, modelo.getIDCOM());
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
