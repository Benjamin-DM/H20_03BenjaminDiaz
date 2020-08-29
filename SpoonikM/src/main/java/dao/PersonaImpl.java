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
            String sql = "INSERT INTO PERSONA (NOMPER,APEPER,APEMATPER,DNIPER,SEXPER,TELPER,TIPPER,ESTPER) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setString(1, modelo.getNOMPER());
            ps.setString(2, modelo.getAPEPER());
            ps.setString(3, modelo.getAPEMATPER());
            ps.setInt(4, modelo.getDNIPER());
            ps.setString(5, modelo.getSEXPER());
            ps.setInt(6, modelo.getTELPER());
            ps.setString(7, modelo.getTIPPER());
            ps.setString(8, "A");
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            System.out.println("error registrar dao: " + e.getMessage());
        } finally {
            this.desconectar();
        }

    }

    @Override
    public void editar(Persona modelo) throws Exception {
        try {
            String sql = "UPDATE PERSONA SET NOMPER=?, APEPER=?, APEMATPER=?, DNIPER=?, ESTPER=?, TIPERO=?, TELPER=?, SEXPER=? WHERE IDPER=?";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setString(1, modelo.getNOMPER());
            ps.setString(2, modelo.getAPEPER());
            ps.setString(3, modelo.getAPEPER());
            ps.setInt(4, modelo.getDNIPER());
            ps.setString(5, modelo.getESTPER());
            ps.setString(6, modelo.getTIPPER());
            ps.setInt(7, modelo.getTELPER());
            ps.setString(8, modelo.getSEXPER());
            ps.setInt(9, modelo.getIDPER());
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
            String sql = "UPDATE PERSONA SET ESTPER=? WHERE IDPER=?";
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
            String sql = "SELECT * FROM PERSONA where ESTPER = 'A'";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            listaPersona = new ArrayList<>();

            while (rs.next()) {
                Persona p = new Persona();
                p.setIDPER(rs.getInt("IDPER"));
                p.setNOMPER(rs.getString("NOMPER"));
                p.setAPEPER(rs.getString("APEPER"));
                p.setAPEMATPER(rs.getString("APEMATPER"));
                p.setTIPPER(rs.getString("TIPPER"));
                p.setDNIPER(rs.getInt("DNIPER"));
                p.setTELPER(rs.getInt("TELPER"));
                p.setSEXPER(rs.getString("SEXPER"));
                p.setESTPER(rs.getString("ESTPER"));
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
   
    

