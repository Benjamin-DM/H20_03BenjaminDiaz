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

    public static Connection conectar() throws Exception {
               InputStream inputStream
                    = Conexion.class.getClassLoader().getResourceAsStream("properties/db.properties");
            Properties properties = new Properties(); 
        try {
            properties.load(inputStream);
            String user = properties.getProperty("user");
            String pwd = properties.getProperty("pwd");
            String driver = properties.getProperty("driver");
            String url = properties.getProperty("url");                
            Class.forName(driver).newInstance();
            conexion = DriverManager.getConnection(url, user, pwd);
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
