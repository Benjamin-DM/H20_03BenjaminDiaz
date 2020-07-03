package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Conexion {

    protected static Connection conexion = null;

    public static Connection conectar() throws Exception {
        try {



            //SQL Server
          
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conexion = DriverManager.getConnection(
                    "jdbc:sqlserver://BENJAMINDM\\SS19;database=Spoonik",
                    "sa",
                    "123456");
             
            //Oracle 
            /*
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            conexion = DriverManager.getConnection(
                    "jdbc:oracle:thin:@ipServer:1521:XE",
                    "usuario",
                    "psswrd");
                     
             */
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conexion;
    }

    public static boolean estado() throws SQLException {
        try {
            return !conexion.isClosed();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void desconectar() throws SQLException {
        try {
            if (conexion.isClosed() == false) {
                conexion.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        conectar();
        System.out.println("[STATUS CONNECTION]: " + estado());
        desconectar();

    }
 
    }
  

