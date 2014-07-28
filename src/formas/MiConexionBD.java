package formas;

/**
 *
 * @author Ibrahin Araujo
 *
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MiConexionBD {

    private static MiConexionBD INSTANCE = null;
    private static Statement sql;
    private static Statement sql2;
    private static Statement sql3;
    private PreparedStatement stmt;
    private ResultSet rs;
    private static Connection MiConexion;
    

    private final static String bd = "soporte";
    private final static String login = "root";
    private final static String password = "";
    private final static String url = "jdbc:mysql://localhost:3306/" + bd;

    private MiConexionBD() {
        /*try {
            Class.forName("com.mysql.jdbc.Driver");
            conn1 = DriverManager.getConnection(url, login, password);

        } catch (Exception e) {
            System.out.print("ERROR AL TRATAR DE CONECTAR LA BASE DE DATOS");
        }*/
        try {
            Class.forName("com.mysql.jdbc.Driver");
            MiConexion = DriverManager.getConnection(url, login, password);
            sql = MiConexion.createStatement();
            sql2 = MiConexion.createStatement();
            sql3 = MiConexion.createStatement();
        } catch (Exception e) {
            System.out.println("ERROR AL TRATAR DE CONECTAR LA BASE DE DATOS");
            System.exit(0);
        }
    }
    
    public static MiConexionBD getInstance(){
        if(INSTANCE == null) {
            INSTANCE = new MiConexionBD();
        }
        return INSTANCE;
    }

    public void init() {
        try {
            //   Class.forName("org.postgresql.Driver").newInstance();
            Class.forName("com.mysql.jdbc.Driver");
            MiConexion = DriverManager.getConnection(url, login, password);
        } catch (Exception e) {
            System.out.println("ERROR AL TRATAR DE CONECTAR LA BASE DE DATOS  ");
        }
    }

    public static Connection Enlace(Connection conn) throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, login, password);

        } catch (ClassNotFoundException e) {
            System.out.print("ERROR AL TRATAR DE CONECTAR LA BASE DE DATOS");
        }
        return conn;
    }

    /*public static Statement sta(Statement sql) throws SQLException {
        conn1 = Enlace(conn1);
        sql = conn1.createStatement();
        return sql;
    }*/

    public static Connection getMiConexion() {
        return MiConexion;
    }

    public void close(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (Exception e) {
            }
        }
    }

    public void close(java.sql.Statement sql) {
        if (sql != null) {
            try {
                sql.close();
            } catch (Exception e) {
            }
        }
    }

    public void destroy() {
        if (MiConexion != null) {
            try {
                MiConexion.close();
            } catch (Exception e) {
            }

        }
    }
    
    public static Statement getSql() {
        return sql;
    }
    
    public static Statement getSql2() {
        return sql2;
    }

    public static Statement getSql3() {
        return sql3;
    }

} // fin de clase MIConexionBD
