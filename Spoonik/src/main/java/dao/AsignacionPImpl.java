package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.AsignacionP;
import modelo.Asignacion;
import modelo.Persona;

public class AsignacionPImpl extends Conexion implements ICrud<AsignacionP> {

    @Override
    public void registrar(AsignacionP modelo) throws Exception {
        try {
            String sql = "INSERT INTO ASIGNACION_PERSONA (IDPER) VALUES (?)";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setInt(1, modelo.getIDPER());
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
            String sql = "UPDATE ASIGNACION_COMIDA SET IDPER=? WHERE IDASIPER=?";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setInt(1, modelo.getIDPER());
            ps.setInt(2, modelo.getIDASIPER());
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
//        try {
//            String sql1 = "select\n"
//                    + "IDASIPER,\n"
//                    + "PERSONA.IDPER,\n"
//                    + "PERSONA.NOMPER,\n"
//                    + "PERSONA.APEPER,\n"
//                    + "PERSONA.TIPPER,\n"
//                    + "from ASIGNACION_PERSONA\n"
//                    + "inner join PERSONA on\n"
//                    + "PERSONA.IDPER = ASIGNACION_PERSONA.IDPER";
//            String sql = "select \n"
//                    + "COMIDA.NOMCOM,\n"
//                    + "COMIDA.TIPCOM,\n"
//                    + "ASIGNACION_COMIDA.FECASICOM\n"
//                    + "from ASIGNACION_PERSONA\n"
//                    + "inner join ASIGNACION_COMIDA ON ASIGNACION_COMIDA.IDASICOM = ASIGNACION_PERSONA.IDASICOM\n"
//                    + "inner join COMIDA on  COMIDA.IDCOM = ASIGNACION_COMIDA.IDCOM";
//            try {
//                PreparedStatement qs = this.conectar().prepareStatement(sql1);
//                ResultSet rs1 = qs.executeQuery();
//                listaAsignacionP = new ArrayList<>();
//
//                while (rs1.next()) {
//                    AsignacionP ap = new AsignacionP();
//                    Persona p = new Persona();
//                    p.setNOMPER(rs1.getString("NOMPER"));
//                    p.setAPEPER(rs1.getString("APEPER"));
//                    p.setTIPPER(rs1.getString("TIPPER"));
//                    p.setIDPER(rs1.getInt("IDPER"));
//                    ap.setPersona(p);
//                    listaAsignacionP.add(ap);
//                }
//                rs1.close();
//                qs.close();
//            } catch (Exception e) {
//                System.out.println("Error aca :v " + e.getMessage());
//            }
//            try {
//                PreparedStatement ps = this.conectar().prepareStatement(sql1);
//                ResultSet rs = ps.executeQuery();
//                listaAsignacionP = new ArrayList<>();
////
////                while (rs.next()) {
////                    AsignacionP ap = new AsignacionP();
////                    Asignacion a = new Asignacion();
////                    a.setIDCOM;
////                    a.setTIPCOM(rs.getString("TIPCOM"));
////                    ap.setIDASIPER(rs.getInt("IDASIPER"));
////                    ap.setIDASICOM(c);
////                    listaAsignacionP.add(ap);
////                }
//                rs.close();
//                ps.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//                System.out.println("Error en listar asignacion" + e.getMessage());
//            } finally {
//                this.desconectar();
//            }
           return listaAsignacionP;
//        }
//    }
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
