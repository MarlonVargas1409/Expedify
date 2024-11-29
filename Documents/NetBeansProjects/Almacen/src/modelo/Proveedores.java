
package modelo;
import java.util.List;

public class Proveedores {
    
    private int proveedorid;
    private String nombreProveedor;
    private List<String> telefono;
    private List<String> correo;
    private String direccion;

    public Proveedores() {
    }

    public Proveedores(int proveedorid, String nombreProveedor, List<String> telefono, List<String> correo, String direccion) {
        this.proveedorid = proveedorid;
        this.nombreProveedor = nombreProveedor;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }

    public int getProveedorid() {
        return proveedorid;
    }

    public void setProveedorid(int proveedorid) {
        this.proveedorid = proveedorid;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
   
    
    
    
    
    
   
    
}
