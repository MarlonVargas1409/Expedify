
package modelo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    /*crearemos las variables que contienen las informaciones principales
    para la conexion a MYSQL*/
    
    String db = "ExpedifySQL";
    String url = "jdbc:mysql://localhost:3306/";
    String usuario = "root";
    String contraseña = "";
    String driver = "com.mysql.cj.jdbc.Driver";
    Connection con = null;
    
    //metodo para conectar la base de datos con java
    public Connection conectar()throws SQLException, ClassNotFoundException,InstantiationException,IllegalAccessException{
     if(con==null){
        try{
            Class.forName(driver);
            con = (Connection) DriverManager.getConnection(url + db, usuario, contraseña);
            System.out.println("Conexion exitosa.");
            
        }catch(SQLException | ClassNotFoundException ex){
            System.out.println("Error al conectar" +ex);
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
           }
             } 
      return con; 
      }
    
    //metodo para que desconectar la base de datos con java
    public void desconectar()throws SQLException, ClassNotFoundException,InstantiationException,IllegalAccessException{
          try{
              con.close();
          }catch(SQLException e){
           Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
          }
      }
}
