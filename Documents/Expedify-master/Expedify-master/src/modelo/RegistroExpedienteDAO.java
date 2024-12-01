
package modelo;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import java.sql.Date;
import modelo.Conexion;
import modelo.Conexion;
public class RegistroExpedienteDAO {
   
    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    /*creamos un metodo para agregar los datos para luego guardarlo
    en la base de datos, puse la r para que represente el registro*/
    public int registrar(RegistroExpediente r) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        
        String sql = "insert into expediente (expediente,tipo_expediente, tribunal , sala, propietario, fecha) value (?,?,?,?,?,?)";
        
        
        
        try{
            con = conectar.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, r.getExpediente());
            ps.setString(2, r.getTipo_expediente());
            ps.setString(3, r.getTribunal());
            ps.setString(4, r.getSala());
            ps.setString(5, r.getPropietario());
            ps.setDate(6, new java.sql.Date(r.getFecha().getTime()));


            ps.execute();    
        }catch(SQLException e){
            System.out.println("error al registrar un dato" +e);
        }
        return 1;
    }
    
    //metodo pero listar los datos 
     public List listar() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        String sql = "select * expediente";
        List<RegistroExpediente>datos = new ArrayList<>();
        try{
            
            con = conectar.conectar();
            ps  = con.prepareStatement(sql);
            rs  = ps.executeQuery();
            
            while(rs.next()){
                RegistroExpediente rge = new  RegistroExpediente();
                rge.setExpediente(rs.getString(1));
                rge.setTipo_expediente(rs.getString(2));
                rge.setTribunal(rs.getString(3));
                rge.setSala(rs.getString(4));
                rge.setPropietario(rs.getString(5));
                rge.setFecha(rs.getDate(6));
                datos.add(rge);
            }
        }catch(SQLException e){
            System.out.println("No se pudieron listar los datos" + e);
        }
        return datos;
     }
     
     
     //metodo para nuscar expediente por el numero de expediente
      public List buscarExpediente(String Buscar) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        
        String sql = "select * from expedientewhere expediente like '%"+Buscar+"%'";
        
        List<RegistroExpediente>datos = new ArrayList<>();
        try{
            
            con = conectar.conectar();
            ps  = con.prepareStatement(sql);
            rs  = ps.executeQuery();
            
            while(rs.next()){
                RegistroExpediente re = new RegistroExpediente();
                re.setExpediente(rs.getString(1));
                re.setTipo_expediente(rs.getString(2));
                re.setTribunal(rs.getString(3));
                re.setSala(rs.getString(4));
                re.setPropietario(rs.getString(5));
                re.setFecha(rs.getDate(6));
                datos.add(re);
            }
        }catch(SQLException e){
            System.out.println("Error al buscar expediente: " + e);
        }
        return datos;
    }
      
      // Este metodo se usara para actualizar los datos de algun cambio que se haga
      public int actualizar(RegistroExpediente r) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        
        int m = 0;
        
        String sql = "update expediente set expediente=?, tipo_expediente=?, tribunal=?, sala=?, propietario=?,fecha=? where id=?";
        
        try {
            con = conectar.conectar();
            ps  = con.prepareStatement(sql);
            ps.setString(1, r.getExpediente());
            ps.setString(2, r.getTipo_expediente());
            ps.setString(3, r.getTribunal());
            ps.setString(4, r.getSala());
            ps.setString(5, r.getPropietario());
            ps.setDate(6, new java.sql.Date(r.getFecha().getTime()));
            m = ps.executeUpdate();
            
            if(m == 1){
                return 1;
            }else{
                return 0;
            }
            
        } catch (SQLException e) {
            System.out.println("Error al actualizar los datos: " + e);
        }
        return m;
    }
      /// Este metodo se es hecho para eliminar algun 
       public int eliminar(int id) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        
        int expe = 0;
        
        String sql = "delete from expediente where id="+id;
        
        try {
            con = conectar.conectar();
            ps  = con.prepareStatement(sql);
            expe   = ps.executeUpdate();
            if(expe == 1){
                return 1;
            }else{
                return 0;
            }
        } catch (SQLException e) {
            System.out.println("Error al borrar datos: " + e);
        }
        return expe;
    }
     
}
          
    

        

    
        
        
    
        
        
    
    

