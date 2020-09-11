package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Producto;


public class ProductoImpl extends Conexion implements ICrud<Producto>{

    private ArrayList<Object> listaProducto;

    @Override
    public void registrar(Producto modelo) throws Exception {
         try {
            String sql = "exec pccrearProducto ?,?,?,?,?,?";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setString(1, modelo.getNOMPRO());
            ps.setDouble(2, modelo.getCOSPRO());
            ps.setString(3,"A");
            ps.setInt(4, modelo.getCANPRO());
            ps.setString(5, modelo.getTIPPRO());
            ps.setDouble(6, modelo.getPREVENPRO());
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
            String sql = "exec pcactuProducto NOMPRO=?, COSPRO=?, ESTPRO=?, CANPRO=?, TIPPRO=?, PREVENPRO=? WHERE IDPRO=?";
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setString(1, modelo.getNOMPRO());
            ps.setDouble(2, modelo.getCOSPRO());
            ps.setString(3, "A");
            ps.setInt(4, modelo.getCANPRO());
            ps.setString(5, modelo.getTIPPRO());
            ps.setDouble(6, modelo.getPREVENPRO());
            ps.setInt(7, modelo.getIDPRO());
            
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
            String sql = "exec pcelimProducto ESTPRO=? WHERE IDPRO=?";
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
     List<Producto> listaproducto = null;
     try {
         String sql = "select * from listaProducto";
         PreparedStatement ps = this.conectar().prepareStatement(sql);
         ResultSet rs = ps.executeQuery();
         listaproducto =new ArrayList<>();
         
         while (rs.next()){
             Producto p = new Producto();
             p.setIDPRO(rs.getInt("IDPRO"));
             p.setNOMPRO(rs.getString("NOMPRO"));
             p.setCOSPRO(rs.getDouble("COSPRO"));
             p.setESTPRO(rs.getString("ESTPRO"));
             p.setCANPRO(rs.getInt("CANPRO"));
             p.setTIPPRO(rs.getString("TIPPRO"));
             p.setPREVENPRO(rs.getDouble("PREVENPRO"));
             listaproducto.add(p);
         }
         rs.close();
         ps.close();
     } catch (Exception e) {
         e.printStackTrace();
     } finally {
         this.desconectar();             
     }
     return listaproducto;
 }
 
 public boolean existe(Producto modelo, List<Producto> listaModelo) {
        for (Producto pro : listaModelo) {
            if (modelo.equals(pro)) {
                return true;
            }
        }
        return false;
    }


    @Override
    public List<Producto> listar(Producto modelo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Producto obtenerModelo(Producto modelo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void crearTablas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }}


    
    
