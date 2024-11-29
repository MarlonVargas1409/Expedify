package modelo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jquezada
 */
public class LoginDAO {

    conexionSQLite conectar = new conexionSQLite();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    /**
     * Este metodo se encarga de listar un registro.El mismo devuelve un objeto
     * tipo arrayList.
     *
     * @param usuariof
     * @param clavef
     * @return datos
     */
    public boolean realizarLogin(String usuariof, String clavef) {
        con = conectar.conectar();

        String sql = "select * from tbl_acceso where usuario = ? and clave = ?";

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, usuariof);
            ps.setString(2, clavef);

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
