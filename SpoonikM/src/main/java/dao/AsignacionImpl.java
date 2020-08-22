package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Asignacion;
import modelo.Comida;

public class AsignacionImpl extends Conexion implements ICrud<Asignacion> {

    @Override
    public void registrar(Asignacion modelo) throws Exception {
        try {
            String sql = "INSERT INTO ASIGNACION_COMIDA (IDCOM,FECASICOM) VALUES (?,?)";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setInt(1, modelo.getIDCOM());
            ps.setString(2, modelo.getFECASICOM());
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
    public void editar(Asignacion modelo) throws Exception {
        try {
            String sql = "UPDATE ASIGNACION_COMIDA SET IDCOM=?, FECASICOM=? WHERE IDASICOM=?";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setInt(1, modelo.getIDCOM());
            ps.setString(2, modelo.getFECASICOM());
            ps.setInt(3, modelo.getIDASICOM());
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
    public void eliminar(Asignacion modelo) throws Exception {
        try {
            String sql = "DELETE ASIGNACION_COMIDA WHERE IDASICOM=?";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setInt(1, modelo.getIDASICOM());
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
    public List<Asignacion> listar() throws Exception {
        List<Asignacion> listaAsignacion = null;
        try {
            String sql1 = "select\n"
                    + "IDASICOM,\n"
                    + "COMIDA.IDCOM,\n"
                    + "COMIDA.NOMCOM,\n"
                    + "COMIDA.TIPCOM,\n"
                    + "FECASICOM\n"
                    + "from ASIGNACION_COMIDA\n"
                    + "inner join COMIDA on\n"
                    + "COMIDA.IDCOM = ASIGNACION_COMIDA.IDCOM";
            try {
                PreparedStatement qs = this.conectar().prepareStatement(sql1);
                ResultSet rs1 = qs.executeQuery();
                listaAsignacion = new ArrayList<>();

                while (rs1.next()) {
                    Asignacion a = new Asignacion();
                    Comida c = new Comida();
                    c.setNOMCOM(rs1.getString("NOMCOM"));
                    c.setTIPCOM(rs1.getString("TIPCOM"));
                    c.setIDCOM(rs1.getInt("IDCOM"));
                    a.setIDASICOM(rs1.getInt("IDASICOM"));
                    a.setFECASICOM(rs1.getString("FECASICOM"));
                    a.setComida(c);
                    listaAsignacion.add(a);
                }
                rs1.close();
                qs.close();
            } catch (Exception e) {
                System.out.println("Error aca :v " + e.getMessage());
            }

////           try {
//                PreparedStatement qs = this.conectar().prepareStatement(sql1);
//                ResultSet rs1 = qs.executeQuery();
//                listaAsignacion = new ArrayList<>();
//
//                while (rs1.next() && ) {
//                    Asignacion a = new Asignacion();
//                    Comida c = new Comida();
//                    c.setNOMCOM(rs1.getString("NOMCOM"));
//                    c.setTIPCOM(rs1.getString("TIPCOM"));
//                    a.setIDASICOM(rs1.getInt("IDASICOM"));
//                    a.setFECHASICOM(rs1.getString("FECHASICOM"));
//                    a.setComida(c);
//                    listaAsignacion.add(a);
//                }
//                rs1.close();
//                qs.close();
//            } catch (Exception e) {
//                System.out.println("Error en el otro lado " + e.getMessage());
//            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error en listar asignacion" + e.getMessage());
        } finally {
            this.desconectar();
        }
        return listaAsignacion;
    }

    @Override
    public List<Asignacion> listar(Asignacion modelo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Asignacion obtenerModelo(Asignacion modelo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
