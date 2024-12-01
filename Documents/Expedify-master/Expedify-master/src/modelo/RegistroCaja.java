
package modelo;

import java.util.Date;

public class RegistroCaja {
   private int id;
   private String estado;
   private String expediente;
   private String sala;
   private int caja;
   private String departamento;
   private String usuario;
   private Date fecha;
   private String comentario;
   private String buscar;
 
   // clase para asignar caja con sus variables metodos y getters y setters
    public RegistroCaja() {
    }

    public RegistroCaja(int id, String estado, String expediente, String sala, int caja, String departamento, String usuario, Date fecha, String comentario, String buscar) {
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

    public int getCaja() {
        return caja;
    }

    public void setCaja(int caja) {
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
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
    
    
    
}
