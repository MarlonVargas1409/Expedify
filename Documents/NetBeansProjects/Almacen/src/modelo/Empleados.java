
package modelo;

import java.util.List;
import java.sql.Date;


public class Empleados {
    //Declaramos las variables de empleados
    private int empleadoid;
    private String nombreEmpleado;
    private String apellidos;
    private String rol;
    private Date fechacontratacion;
    private List<String> telefono;
    private List<String> correo;
    private String Contraseña;
    
    //metodos y sus getter y setters
    public Empleados() {
    }

    public Empleados(int empleadoid, String nombreEmpleado, String apellidos, String rol,Date fechacontratacion, List<String> telefono, List<String> correo) {
        this.empleadoid = empleadoid;
        this.nombreEmpleado = nombreEmpleado;
        this.apellidos = apellidos;
        this.rol = rol;
        this.fechacontratacion = fechacontratacion;
        this.telefono = telefono;
        this.correo = correo;
    }

    public List<String> getTelefono() {
        return telefono;
    }

    public void setTelefono(List<String> telefono) {
        this.telefono = telefono;
    }

    public List<String> getCorreo() {
        return correo;
    }

    public void setCorreo(List<String> correo) {
        this.correo = correo;
    }
    
    

    public int getEmpleadoid() {
        return empleadoid;
    }

    public void setEmpleadoid(int empleadoid) {
        this.empleadoid = empleadoid;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Date getFechacontratacion() {
        return fechacontratacion;
    }

    public void setFechacontratacion(Date fechacontratacion) {
        this.fechacontratacion = fechacontratacion;
    }


    
    
    
    
    
    
   
    
    
}
