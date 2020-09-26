package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Persona;

public class PersonaImpl extends Conexion implements ICrud<Persona> {

    @Override
    public void registrar(Persona modelo) throws Exception {
        try {
            String sql = "INSERT INTO PERSONA (IDPER,NOMPER,APEPATPER,APEMATPER,TIPPER,SEXPER,DNIPER,TELPER,ESTPER,DIRPER) VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setInt(1, modelo.getIDPER());
            ps.setString(2, modelo.getNOMPER());
            ps.setString(3, modelo.getAPEPATPER());
            ps.setString(4, modelo.getAPEMATPER());
            ps.setString(5, modelo.getTIPPER());
            ps.setString(6, modelo.getSEXPER());
            ps.setInt(7, modelo.getDNIPER());
            ps.setInt(8, modelo.getTELPER());
            ps.setString(9, modelo.getDIRPER());

            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error en registrar impl Persona" + e.getMessage());
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void editar(Persona modelo) throws Exception {
        try {
            String sql = "UPDATE PERSONA SET NOMPER=?, APEPATPER=?, APEMATPER=?, TIPER=?, SEXPER=?, DNIPER=?,  TELPER=?, DIRPER=? WHERE IDPER=?";
            PreparedStatement ps = this.conectar().prepareStatement(sql);

            ps.setString(1, modelo.getNOMPER());
            ps.setString(2, modelo.getAPEPATPER());
            ps.setString(3, modelo.getAPEMATPER());
            ps.setString(4, modelo.getTIPPER());
            ps.setString(5, modelo.getSEXPER());
            ps.setInt(6, modelo.getDNIPER());
            ps.setInt(7, modelo.getTELPER());
            ps.setString(8, modelo.getDIRPER());
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
            String sql = " UPDATE PERSONA SET ESTPER='I' where IDPER = ?";
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
            String sql = "SELECT * FROM where ESTPER = 'A' ";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            listaPersona = new ArrayList<>();

            while (rs.next()) {
                Persona p = new Persona();
                p.setIDPER(rs.getInt("IDPER"));
                p.setNOMPER(rs.getString("NOMPER"));
                p.setAPEPATPER(rs.getString("APEPATPER"));
                p.setAPEMATPER(rs.getString("APEMATPER"));
                p.setTIPPER(rs.getString("TIPPER"));
                p.setSEXPER(rs.getString("SEXPER"));
                p.setTELPER(rs.getInt("DNIPER"));
                p.setTELPER(rs.getInt("TELPER"));
                p.setESTPER(rs.getString("ESTPER"));                
                p.setDIRPER(rs.getString("DIRPER"));
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

}
