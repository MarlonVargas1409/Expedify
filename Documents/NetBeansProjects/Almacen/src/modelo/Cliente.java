
package modelo;
import java.time.LocalDate;
import java.util.List;

public class Cliente {
    //
    private int clienteid;
    private String nombrecliente;
    private List<String> telefono;
    private List<String> correo;
    private String direccion;
    private String fecharegistro;

    public Cliente() {
    }

    public Cliente(int clienteid, String nombrecliente, List<String> telefono, List<String> correo, String direccion, String fecharegistro) {
        this.clienteid = clienteid;
        this.nombrecliente = nombrecliente;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.fecharegistro = fecharegistro;
    }

    public int getClienteid() {
        return clienteid;
    }

    public void setClienteid(int clienteid) {
        this.clienteid = clienteid;
    }

    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
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

    public String getFecharegistro() {
        return fecharegistro;
    }

    public void setFecharegistro(String fecharegistro) {
        this.fecharegistro = fecharegistro;
    }
    
    

   
    }
    
    
    
    
    


    

