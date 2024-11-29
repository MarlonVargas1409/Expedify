package modelo;

/**
 * DTO formulario contactos.
 * @author jquezada
 */
public class Contactos {
    int    id;
    String nombres;
    String apellidos;
    String telefono;
    String correo;
    String buscar;

    public Contactos() {
    }

    public Contactos(int id, String nombres, String apellidos, String telefono, String correo, String buscar) {
        this.id        = id;
        this.nombres   = nombres;
        this.apellidos = apellidos;
        this.telefono  = telefono;
        this.correo    = correo;
        this.buscar    = buscar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getBuscar() {
        return buscar;
    }

    public void setBuscar(String buscar) {
        this.buscar = buscar;
    }
}
