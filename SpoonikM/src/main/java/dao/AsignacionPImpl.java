package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Asignacion;
import modelo.AsignacionP;
import modelo.Comida;
import modelo.Persona;

public class AsignacionPImpl extends Conexion implements ICrud<AsignacionP> {

    @Override
    public void registrar(AsignacionP modelo) throws Exception {
        try {
            String sql = "INSERT INTO ASIGNACION_PERSONA (IDPER,IDASICOM) VALUES (?,?)";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setInt(1, modelo.getIDPER());
            ps.setInt(2, modelo.getIDASICOM());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error en registrar impl Asignacion" + e.getMessage());
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void editar(AsignacionP modelo) throws Exception {
        try {
            String sql = "UPDATE ASIGNACION_COMIDA SET IDPER=? IDASICOM=? WHERE IDASIPER=?";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setInt(1, modelo.getIDPER());
            ps.setInt(2, modelo.getIDASICOM());
            ps.setInt(3, modelo.getIDASIPER());
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
    public void eliminar(AsignacionP modelo) throws Exception {
        try {
            String sql = "DELETE ASIGNACION_PERSONA WHERE IDASIPER=?";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setInt(1, modelo.getIDASIPER());
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
  public List<AsignacionP> listar() throws Exception {

        List<AsignacionP> listaAsignacionP = null;
        try {
            String sql1 = "select\n"
                    + "IDASIPER,\n"
                    + "PERSONA.IDPER,\n"
                    + "PERSONA.NOMPER,\n"
                    + "PERSONA.APEPER,\n"
                    + "PERSONA.TIPPER\n"
                    + "from ASIGNACION_PERSONA\n"
                    + "inner join PERSONA on\n"
                    + "PERSONA.IDPER = ASIGNACION_PERSONA.IDPER";
            String sql = "select \n"
                    + "ASIGNACION_COMIDA.IDASICOM,\n"
                    + "COMIDA.NOMCOM,\n"
                    + "COMIDA.IDCOM,\n"
                    + "COMIDA.TIPCOM,\n"
                    + "ASIGNACION_COMIDA.FECASICOM\n"
                    + "from ASIGNACION_PERSONA\n"
                    + "inner join ASIGNACION_COMIDA ON ASIGNACION_COMIDA.IDASICOM = ASIGNACION_PERSONA.IDASICOM\n"
                    + "inner join COMIDA on  COMIDA.IDCOM = ASIGNACION_COMIDA.IDCOM";
            try {
                PreparedStatement qs = this.conectar().prepareStatement(sql1);
                PreparedStatement ps = this.conectar().prepareStatement(sql);
                ResultSet rs1 = qs.executeQuery();                
                ResultSet rs = ps.executeQuery();
                listaAsignacionP = new ArrayList<>();

                while (rs1.next() & rs.next()) {
                    AsignacionP ap = new AsignacionP();
                    Persona p = new Persona();
                    Comida c = new Comida();
                    Asignacion a= new Asignacion();
                    p.setNOMPER(rs1.getString("NOMPER"));
                    p.setAPEPER(rs1.getString("APEPER"));
                    p.setTIPPER(rs1.getString("TIPPER"));
                    p.setIDPER(rs1.getInt("IDPER"));
                    ap.setIDASIPER(rs1.getInt("IDASIPER"));
                    c.setNOMCOM(rs.getString("NOMCOM"));
                    c.setTIPCOM(rs.getString("TIPCOM"));
                    a.setIDASICOM(rs.getInt("IDASICOM"));
                    a.setComida(c);
                    ap.setPersona(p);
                    ap.setAsignacion(a);
                    listaAsignacionP.add(ap);
                }
                rs1.close();
                qs.close();
                rs.close();
                ps.close();
            }
        catch (Exception e) {
                System.out.println("Error aca en la wea de persona " + e.getMessage());
          }
        } catch(Exception e){
                
            }
            finally {
                this.desconectar();
            }
           return listaAsignacionP;
  
  }
    
    

        @Override
        public List<AsignacionP> listar
        (AsignacionP modelo) throws Exception {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public AsignacionP obtenerModelo
        (AsignacionP modelo) throws Exception {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }
