package modelo;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;

/**
 * DAO formulario contactos.
 * @author jquezada
 */
public class ContactosDAO {
    
    conexionSQLite    conectar = new conexionSQLite();
    Connection        con;
    PreparedStatement ps;
    ResultSet         rs;
    
    
    /**
     * Este metodo se encarga de listar un registro.El mismo devuelve un objeto tipo arrayList.
     * @param valorBuscar
     * @return datos
     */
    public List listarRegistro(String valorBuscar){
        
        String sql = "select * from tbl_usuarios "+
                     "where id||Nombres||Apellidos||Telefonos||Correo like '%"+valorBuscar+"%'";
        
        List<Contactos>datos = new ArrayList<>();
        try{
            
            con = conectar.conectar();
            ps  = con.prepareStatement(sql);
            rs  = ps.executeQuery();
            
            while(rs.next()){
                Contactos c = new Contactos();
                c.setId(rs.getInt(1));
                c.setNombres(rs.getString(2));
                c.setApellidos(rs.getString(3));
                c.setTelefono(rs.getString(4));
                c.setCorreo(rs.getString(5));
                datos.add(c);
            }
        }catch(SQLException ex){
            System.out.println("Error al listar los contactos: " + ex);
        }
        return datos;
    }
    
    
    /**
     * Este metodo se encarga de listar
     * todos los registros. El mismo devuelve
     * un objeto tipo arrayList.
     * @return datos
     */
    public List listar(){
        String sql = "select * from tbl_usuarios";
        List<Contactos>datos = new ArrayList<>();
        try{
            
            con = conectar.conectar();
            ps  = con.prepareStatement(sql);
            rs  = ps.executeQuery();
            
            while(rs.next()){
                Contactos c = new Contactos();
                c.setId(rs.getInt(1));
                c.setNombres(rs.getString(2));
                c.setApellidos(rs.getString(3));
                c.setTelefono(rs.getString(4));
                c.setCorreo(rs.getString(5));
                datos.add(c);
            }
        }catch(SQLException ex){
            System.out.println("Error al listar los contactos: " + ex);
        }
        return datos;
    }
    
    /**
     * Este metodo se encarga de registrar un nuevo contacto.
     * Devuelve un 1 si se ha realizado con exito la insercion.
     * @param c
     * @return 1
     */
    public int agregar(Contactos c){
        
        String sql = "insert into tbl_usuarios (Nombres, Apellidos, Telefonos, Correo) values (?,?,?,?)";
        
        try {
            
            con = conectar.conectar();
            ps  = con.prepareStatement(sql);
            ps.setString(1, c.getNombres());
            ps.setString(2, c.getApellidos());
            ps.setString(3, c.getTelefono());
            ps.setString(4, c.getCorreo());
            ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Error al tratar de insertar datos: " + e);
        }
        return 1;
    }
    
    /**
     * Este metodo se encarga de actualizar un registro,
     * devuelve el numero de registros afectados.
     * @param c
     * @return r
     */
    public int actualizar(Contactos c){
        
        int r = 0;
        
        String sql = "update tbl_usuarios set Nombres=?, Apellidos=?, Telefonos=?, Correo=? where ID=?";
        
        try {
            con = conectar.conectar();
            ps  = con.prepareStatement(sql);
            ps.setString(1, c.getNombres());
            ps.setString(2, c.getApellidos());
            ps.setString(3, c.getTelefono());
            ps.setString(4, c.getCorreo());
            ps.setInt(5, c.getId());
            r = ps.executeUpdate();
            
            if(r == 1){
                return 1;
            }else{
                return 0;
            }
            
        } catch (SQLException e) {
            System.out.println("Error al tratar de actualizar datos: " + e);
        }
        return r;
    }
    
    /**
     * Este metodo se encarga de eliminar el registro seleccionado.
     * El mismo devuelve el numero de registros afectados.
     * @param id
     * @return r
     */
    public int eliminar(int id){
        
        int r = 0;
        
        String sql = "delete from tbl_usuarios where id="+id;
        
        try {
            con = conectar.conectar();
            ps  = con.prepareStatement(sql);
            r   = ps.executeUpdate();
            if(r == 1){
                return 1;
            }else{
                return 0;
            }
        } catch (SQLException e) {
            System.out.println("Error al tratar de borrar datos: " + e);
        }
        return r;
    }
}
