package formas;

/**
 *
 * @author Ibrahin Araujo
 *
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class MiConexionBD
{

    static Connection conn1;
    static Statement  sql;
    static ResultSet  rs;
    static Connection MiConexion;
       
    static String bd = "soporte";
    static String login = "root";
    static String password = "root";
    static String url = "jdbc:mysql://localhost:3306/"+bd;
   

    public void init()
    {
       try
       {
        //   Class.forName("org.postgresql.Driver").newInstance();         
          MiConexion=DriverManager.getConnection(url,login,password);
      
        }
        catch(Exception e)
     {
            System.out.println("ERROR AL TRATAR DE CONECTAR LA BASE DE DATOS  ");
        }
    }
    public static Connection Enlace(Connection conn) throws SQLException
    {
       try
       {
         Class.forName("com.mysql.jdbc.Driver");
         conn=DriverManager.getConnection(url,login,password);     

        }
       catch(ClassNotFoundException e)
     {
            System.out.print("ERROR AL TRATAR DE CONECTAR LA BASE DE DATOS");
        }
       return conn;
    }
    public static Statement sta(Statement sql) throws SQLException
    {
        conn1=Enlace(conn1);
        sql=conn1.createStatement();
        return sql;
    }

     public Connection getMiConexion()
    {
        return MiConexion;
    }
   public void close(ResultSet rs){
       if(rs !=null){
            try{
               rs.close();
            }
            catch(Exception e){}
        }
    }
    public void close(java.sql.Statement sql){
            if(sql !=null){
            try{
               sql.close();
            }
            catch(Exception e){}
            }
    }
     public void destroy()
  {
      if(MiConexion !=null)
      {
        try{
               MiConexion.close();
            }
            catch(Exception e){}

    }
  }


 } // fin de clase MIConexionBD
