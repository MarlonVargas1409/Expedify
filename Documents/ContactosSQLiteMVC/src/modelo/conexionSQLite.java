package modelo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 * Conexion BD Contactos (SQLite).
 * @author jquezada
 */
public class conexionSQLite {
    /**
     * Variable "cn", es un objeto de la
     * clase Connection.
     */
    Connection cn = null;

    /**
     * Metodo que crea la conexion a la Bases de Datos
     * SQLite y retorna un objeto de tipo Connection.
     * @return cn
     */
    public Connection conectar() {
        try {
            Class.forName("org.sqlite.JDBC");
            cn = DriverManager.getConnection("jdbc:sqlite:C:\\ContactosSQLiteMVC\\src\\modelo\\EstructuraBD\\contactos.db");
            System.out.println("Estamos conectados con exito!");

        } catch (ClassNotFoundException | SQLException sqlex) {
            System.out.println("Error al tratar de conectar: " + sqlex);
        }
        return cn;
    }
}
