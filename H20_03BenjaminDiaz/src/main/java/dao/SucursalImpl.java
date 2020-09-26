package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Persona;
import modelo.Sucursal;


public class SucursalImpl extends Conexion implements ICrud<Sucursal>{

    @Override
    public void registrar(Sucursal modelo) throws Exception {
        try {
            String sql = "INSERT INTO SUCURSAL (IDSUC,NOMSUC,DISSUC,ESTSUC,IDPER) VALUES (?,?,?,?,?)";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setInt(1, modelo.getIDSUC());
            ps.setString(2,modelo.getNOMSUC());
            ps.setString(3,modelo.getDISSUC());
            ps.setString(4,modelo.getESTSUC());
            ps.setInt(5,modelo.getIDPER());
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
    public void editar(Sucursal modelo) throws Exception {
        try {
            String sql = "UPDATE SUCURSAL SET NOMSUC=?, DISSUC=?, IDPER=? WHERE IDSUC=?";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setString(1, modelo.getNOMSUC());
            ps.setString(2, modelo.getDISSUC());
            ps.setInt(3, modelo.getIDPER());
            ps.setInt(4, modelo.getIDSUC());
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
    public void eliminar(Sucursal modelo) throws Exception {
        try {
            String sql = "UPDATE PERSONA SET ESTSUC='I' where IDSUC = ?";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setInt(1, modelo.getIDSUC());
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
    public List<Sucursal> listar() throws Exception {
        List<Sucursal> listaSucursal = null;
        try {
            String sql1 = "select\n"
                    + "IDSUC,\n"
                    + "PERSONA.IDPER,\n"
                    + "PERSONA.NOMPER,\n"
                    + "PERSONA.APEPATPER,\n"
                    + "PERSONA.APEMATPER,\n"
                    + "PERSONA.TIPPER,\n"
                    + "NOMSUC\n"
                    + "from SUCURSAL\n"
                    + "inner join PERSONA on\n"
                    + "PERSONA.IDPER = SUCURSAL.IDPER";
            try {
                PreparedStatement qs = this.conectar().prepareStatement(sql1);
                ResultSet rs1 = qs.executeQuery();
                listaSucursal = new ArrayList<>();

                while (rs1.next()) {
                    Sucursal a = new Sucursal();
                    Persona c = new Persona();
                    c.setNOMPER(rs1.getString("NOMPER"));
                    c.setAPEPATPER(rs1.getString("APEPATPER"));
                    c.setAPEMATPER(rs1.getString("APEMATPER"));
                    c.setTIPPER(rs1.getString("TIPPER"));
                    c.setIDPER(rs1.getInt("IDPER"));
                    a.setIDSUC(rs1.getInt("IDSUC"));
                    a.setNOMSUC(rs1.getString("NOMSUC"));
                    a.setPersona(c);
                    listaSucursal.add(a);
                }
                rs1.close();
                qs.close();
            } catch (Exception e) {
                System.out.println("Error aca :v " + e.getMessage());
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error en listar sucursal" + e.getMessage());
        } finally {
            this.desconectar();
        }
        return listaSucursal; 
    }

    @Override
    public List<Sucursal> listar(Sucursal modelo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Sucursal obtenerModelo(Sucursal modelo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
