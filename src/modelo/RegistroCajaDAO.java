package modelo;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import java.sql.Date;

public class RegistroCajaDAO {

    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    // En este metodo se registraran los datos para registrar la caja
    public boolean registrarcaja(RegistroCaja r) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        String sql = "insert into caja (estado, expediente, sala, caja, departamento, usuario, fecha, comentario) values (?, ?, ?, ?, ?, ?, ?, ?)";
        boolean success = false;

        try {
            con = conectar.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, r.getEstado());
            ps.setString(2, r.getExpediente());
            ps.setString(3, r.getCaja());
            ps.setString(4, r.getSala());
            ps.setString(5, r.getDepartamento());
            ps.setString(6, r.getUsuario());
            ps.setDate(7, Date.valueOf(r.getFecha()));  // Asegúrate de que r.getFecha() sea un formato adecuado.
            ps.setString(8, r.getComentario());

            int result = ps.executeUpdate();
            if (result > 0) {
                success = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al registrar un dato: " + e);
        } finally {
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar recursos: " + e);
            }
        }
        return success;
    }

    // metodo para listar los datos
    public List<RegistroCaja> listar() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        String sql = "select * from caja";
        List<RegistroCaja> datos = new ArrayList<>();
        try {
            con = conectar.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                RegistroCaja cj = new RegistroCaja();
                cj.setEstado(rs.getString("estado"));
                cj.setExpediente(rs.getString("expediente"));
                cj.setCaja(rs.getString("caja"));
                cj.setSala(rs.getString("sala"));
                cj.setDepartamento(rs.getString("departamento"));
                cj.setUsuario(rs.getString("usuario"));
                cj.setFecha(rs.getString("fecha"));
                cj.setComentario(rs.getString("comentario"));
                datos.add(cj);
            }
        } catch (SQLException e) {
            System.out.println("No se pudieron listar los datos: " + e);
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar recursos: " + e);
            }
        }
        return datos;
    }

    // metodo para buscar por numero de expediente
    public List<RegistroCaja> buscar(String buscar) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        String sql = "select * from caja where expediente like ?";
        List<RegistroCaja> datos = new ArrayList<>();
        try {
            con = conectar.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + buscar + "%");
            rs = ps.executeQuery();

            while (rs.next()) {
                RegistroCaja cj = new RegistroCaja();
                cj.setEstado(rs.getString("estado"));
                cj.setExpediente(rs.getString("expediente"));
                cj.setCaja(rs.getString("caja"));
                cj.setSala(rs.getString("sala"));
                cj.setDepartamento(rs.getString("departamento"));
                cj.setUsuario(rs.getString("usuario"));
                cj.setFecha(rs.getString("fecha"));
                cj.setComentario(rs.getString("comentario"));
                datos.add(cj);
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar expediente: " + e);
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar recursos: " + e);
            }
        }
        return datos;
    }
}
