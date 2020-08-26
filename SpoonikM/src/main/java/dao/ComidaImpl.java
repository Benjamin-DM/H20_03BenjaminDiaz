package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Comida;


public class ComidaImpl extends Conexion implements ICrud<Comida>{

    @Override
    public void registrar(Comida modelo) throws Exception {
       try {
            String sql = "INSERT INTO COMIDA (NOMCOM, COSCOM, CANCOM, TIPCOM, ESTCOM) VALUES (?,?,?,?,'A')";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setString(1, modelo.getNOMCOM());
            ps.setDouble(2, modelo.getCOSCOM());
            ps.setInt(3, modelo.getCANCOM());
            ps.setString(4, modelo.getTIPCOM());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error en registrar ComidaDAO " + e.getMessage());
        } finally {
            this.desconectar();
        }    }

    @Override
    public void editar(Comida modelo) throws Exception {
   try {
            String sql = "UPDATE COMIDA SET NOMCOM=? ESTCOM=?, COSCOM=?, TIPCOM=? WHERE IDCOM=?";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setString(1, modelo.getNOMCOM());
            ps.setString(2, modelo.getESTCOM());
            ps.setDouble(3, modelo.getCOSCOM());
            ps.setString(4, modelo.getTIPCOM());
            ps.setInt(5, modelo.getIDCOM());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al editar ComidaDAO: " + e.getMessage());
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
            System.out.println("Error al eliminar ComidaDAO: " + e.getMessage());
        } finally {
            this.desconectar();
        }    
    }
    @Override
    public List<Comida> listar() throws Exception {
        List<Comida> listaComida = null;
        try {
            String sql = "SELECT * FROM COMIDA where estcom = 'A'";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            listaComida = new ArrayList<>();

            while (rs.next()) {
                Comida c = new Comida();
                c.setIDCOM(rs.getInt("IDCOM"));
                c.setNOMCOM(rs.getString("NOMCOM"));
                c.setCANCOM(rs.getInt("CANCOM"));
                c.setCOSCOM(rs.getDouble("COSCOM"));
                c.setESTCOM(rs.getString("ESTCOM"));
                c.setTIPCOM(rs.getString("TIPCOM"));
                listaComida.add(c);
            }
         rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error en listar ComidaDAO: " + e.getMessage());
        } finally {
            this.desconectar();
        }
        return listaComida;
    }

 public boolean existe(Comida modelo, List<Comida> listaModelo) {
        for (Comida com : listaModelo) {
            if (modelo.equals(com)) {
                return true;
            }
        }
        return false;
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
