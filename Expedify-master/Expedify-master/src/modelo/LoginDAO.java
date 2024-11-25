
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginDAO {
    
    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    //Crear un metodo para buscar las credenciales correctas
    public boolean Login(String usuario, String contraseña) throws SQLException, InstantiationException, ClassNotFoundException, IllegalAccessException {
        con = conectar.conectar();

        String sql = "select * from `Login` where usuario = ? and contraseña = ?";

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, usuario);
            ps.setString(2, contraseña);

            rs = ps.executeQuery();

            while (rs.next()) {
                con.close();
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return false;
    }
   
}
