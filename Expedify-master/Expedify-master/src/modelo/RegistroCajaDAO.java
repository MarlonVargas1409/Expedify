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
    public String registrarcaja(RegistroCaja r) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        
        String sql = "insert into caja (estado,expediente,caja,sala,departamento,usuario,fecha,comentario) values (?,?,?,?,?,?,?,?)";
        String n = null;
        try {
            con = conectar.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, r.getEstado());
            ps.setString(2, r.getExpediente());
            ps.setString(3, r.getCaja());
            ps.setString(4, r.getSala());
            ps.setString(5, r.getDepartamento());
            ps.setString(6, r.getUsuario());
            ps.setString(7, r.getFecha());
            ps.setString(8, r.getComentario());

            ps.execute();
        } catch (SQLException e) {
            System.out.println("error al registrar un dato" + e);
        }
        return n;
    }
    // metodo para listar los datos

    //public String listar(String text) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
       
       public List<RegistroCaja> listar(String text) throws ClassNotFoundException, InstantiationException, IllegalAccessException { 
        String sql = "select estado, expediente, caja, sala, departamento, usuario, fecha, comentario from caja";
       List<RegistroCaja> datos = new ArrayList<>();
        try {

            con = conectar.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                //RegistroCaja cj = new  RegistroCaja();
                RegistroCaja cj = new RegistroCaja();
                cj.setEstado(rs.getString(1));
                cj.setExpediente(rs.getString(2));
                cj.setCaja(rs.getString(3));
                cj.setSala(rs.getString(4));
                cj.setDepartamento(rs.getString(5));
                cj.setUsuario(rs.getString(6));
                cj.setFecha(rs.getString(7));
                cj.setComentario(rs.getString(8));
                datos.add(cj);
            }
        } catch (SQLException e) {
            System.out.println("No se pudieron listar los datos" + e);
        }
        return datos;
    }

    // metodo para buscar por numero de expediente
    public List buscar(String Buscar) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        String sql = "select * from caja where expediente like ?";

        List<RegistroCaja> datos = new ArrayList<>();
        try {

            con = conectar.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                RegistroCaja cj = new RegistroCaja();
                cj.setEstado(rs.getString(1));
                cj.setExpediente(rs.getString(2));
                cj.setCaja(rs.getString(3));
                cj.setSala(rs.getString(4));
                cj.setDepartamento(rs.getString(5));
                cj.setUsuario(rs.getString(6));
                cj.setFecha(rs.getString(7));
                cj.setComentario(rs.getString(8));
                datos.add(cj);
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar expediente: " + e);
        }
        
        return datos;
    }
}
