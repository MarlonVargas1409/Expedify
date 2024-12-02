
package modelo;

import java.util.Date;

public class RegistroCaja {
   private int id;
   private String estado;
   private String expediente;
   private String sala;
   private String caja;
   private String departamento;
   private String usuario;
   private String fecha;
   private String comentario;
   private String buscar;
   private String propietario;
 
   // clase para asignar caja con sus variables metodos y getters y setters
    public RegistroCaja() {
    }

    public RegistroCaja(int id, String estado, String expediente, String sala, String caja, String departamento, String usuario, String fecha, String comentario, String buscar, String Propietario) {
        this.id = id;
        this.estado = estado;
        this.expediente = expediente;
        this.sala = sala;
        this.caja = caja;
        this.departamento = departamento;
        this.usuario = usuario;
        this.fecha = fecha;
        this.comentario = comentario;
        this.buscar = buscar;
        this.propietario = propietario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getExpediente() {
        return expediente;
    }

    public void setExpediente(String expediente) {
        this.expediente = expediente;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getCaja() {
        return caja;
    }

    public void setCaja(String caja) {
        this.caja = caja;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getBuscar() {
        return buscar;
    }

    public void setBuscar(String buscar) {
        this.buscar = buscar;
    }
    
    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

}
