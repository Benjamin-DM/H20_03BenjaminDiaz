package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.Detalle;
import modelo.Persona;
import modelo.Producto;



public class DetalleImpl extends Conexion {

    public Detalle obtenerdatos ( int IDPRO, int IDPER) throws Exception{

        Detalle d = null;


        String sqlproducto = 
               "select IDPRO, NOMPRO FROM PRODUCTO  Where IDPRO  = " + IDPRO;

        String sqlpersona = 
                "select IDPER, NOMPER, APEPER FROM PERSONA Where IDPER ="+ IDPER;

         try {
             PreparedStatement p1 = this.conectar().prepareStatement(sqlproducto);
             PreparedStatement p2 = this.conectar().prepareStatement(sqlpersona);

             ResultSet rs1 = p1.executeQuery();

             ResultSet rs2 = p2.executeQuery();


        while ( rs1.next() && rs2.next() ) {
            d = new Detalle();

            Persona per = new Persona();
            Producto pro = new Producto();


            d.setIDPRO(rs1.getInt("IDPRO"));
            pro.setNOMPRO(rs1.getString("NOMPRO"));
            d.setProducto(pro);
            d.setIDPER(rs2.getInt("IDPER"));
            per.setNOMPER(rs2.getString("NOMPER"));
            per.setAPEPER(rs2.getString("APEPER"));
            d.setPersona(per);

        }

                rs1.close();
                p1.close();

                rs2.close();
                p2.close();

        } catch (Exception e) {
           System.out.println("Error " + e.getMessage());
        }finally {
            this.desconectar();
         }
         return d;
    }
} 