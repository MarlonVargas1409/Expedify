
package modelo;

import java.util.Date;

public class RegistroExpediente {
    private int id;
    private String expediente;
    private String tipo_expediente;
    private String tribunal;
    private String sala;
    private String propietario;
    private Date fecha;
    private String buscar;
    
    
    /* metodos para los datos cuando se quiera registrar un expediente nuevo
    al sistema y sus getters y setters*/

    public RegistroExpediente() {
    }

    public RegistroExpediente(String expediente, String tipo_expediente, String tribunal, String sala, String propietario, Date fecha,int id,String buscar) {
        this.expediente = expediente;
        this.tipo_expediente = tipo_expediente;
        this.tribunal = tribunal;
        this.sala = sala;
        this.propietario = propietario;
        this.fecha = fecha;
        this.buscar = buscar;
        this.id = id;
    }

    public String getExpediente() {
        return expediente;
    }

    public void setExpediente(String expediente) {
        this.expediente = expediente;
    }

    public String getTipo_expediente() {
        return tipo_expediente;
    }

    public void setTipo_expediente(String tipo_expediente) {
        this.tipo_expediente = tipo_expediente;
    }

    public String getTribunal() {
        return tribunal;
    }

    public void setTribunal(String tribunal) {
        this.tribunal = tribunal;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

    public String getBuscar() {
        return buscar;
    }

    public void setBuscar(String buscar) {
        this.buscar = buscar;
    }
    
    
    
    
}
