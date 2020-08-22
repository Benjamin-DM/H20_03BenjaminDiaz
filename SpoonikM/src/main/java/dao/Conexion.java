package dao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Conexion {

    protected static Connection conexion = null;
    public static Connection cnx = null;

    public static Connection conectar() throws Exception {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cnx = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName= Spoonik", "sa", "123456");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: " + e);
        }
        return cnx;
    }

    public static void desconectar() throws Exception {
        if (Conexion.cnx != null) {
            cnx.close();
        }
    }

    public static void main(String[] args)throws Exception  {
        conectar();
        if(cnx!=null){
            System.out.println("listo");
        }
        else{System.out.println("nooo");}
    }
//    public static Connection conectar() throws Exception {
//               InputStream inputStream
//                    = Conexion.class.getClassLoader().getResourceAsStream("properties/db.properties");
//            Properties properties = new Properties(); 
//        try {
//            properties.load(inputStream);
//            String user = properties.getProperty("user");
//            String pwd = properties.getProperty("pwd");
//            String driver = properties.getProperty("driver");
//            String url = properties.getProperty("url");                
//            Class.forName(driver).newInstance();
//            conexion = DriverManager.getConnection(url, user, pwd);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return conexion;
//    }
//
//    public static boolean estado() throws SQLException {
//        try {
//            return !conexion.isClosed();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return false;
//    }
//
//    public static void desconectar() throws SQLException {
//        try {
//            if (conexion.isClosed() == false) {
//                conexion.close();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void main(String[] args) throws Exception {
//        conectar();
//        System.out.println("[STATUS CONNECTION]: " + estado());
//        desconectar();
//
//    }

}
