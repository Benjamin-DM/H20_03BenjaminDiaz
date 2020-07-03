package dao;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Persona;


public class PersonaImpl extends Conexion implements ICrud<Persona>{
 
    @Override
    public void registrar(Persona modelo) throws Exception {
        try {
            String sql = "INSERT INTO PERSONA (NOMPER,APEPER,DNIPER,ESTPER,SEXPER,TELPER,TIPPER) VALUES (?,?,?,'A',?,?,?)";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setString(1, modelo.getNOMPER());
            ps.setString(2, modelo.getAPEPER());
            ps.setString(3, modelo.getDNIPER());
            ps.setString(4, modelo.getTIPPER());
            ps.setString(5, modelo.getTELPER());
            ps.setString(6, modelo.getSEXPER());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.desconectar();
        }

    }

    @Override
    public void editar(Persona modelo) throws Exception {
        try {
            String sql = "UPDATE PERSONA SET NOMPER=?, APEPER=?, DNIPER=?, ESTPER=?, TIPERO=?, TELPER=?, SEXPER=? WHERE IDPER=?";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setString(1, modelo.getNOMPER());
            ps.setString(2, modelo.getAPEPER());
            ps.setString(3, modelo.getDNIPER());
            ps.setString(4, modelo.getESTPER());
            ps.setString(5, modelo.getTIPPER());
            ps.setString(6, modelo.getTELPER());
            ps.setString(7, modelo.getSEXPER());
            ps.setInt(8, modelo.getIDPER());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void eliminar(Persona modelo) throws Exception {
        try {
            String sql = "DELETE FROM PERSONA WHERE";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setInt(1, modelo.getIDPER());
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
    public List<Persona> listar() throws Exception {
        List<Persona> listaPersona = null;
        try {
            String sql = "SELECT IDPER, NOMPER, APEPER, DNIPER FROM PERSONA";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            listaPersona = new ArrayList<>();

            while (rs.next()) {
                Persona p = new Persona();
                p.setIDPER(rs.getInt(1));
                p.setNOMPER(rs.getString(2));
                p.setAPEPER(rs.getString(3));
                p.setDNIPER(rs.getString(4));
                listaPersona.add(p);
            }

            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.desconectar();
        }
        return listaPersona;
    }

    @Override
    public List<Persona> listar(Persona modelo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Persona obtenerModelo(Persona modelo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void crearTablas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
   
    

