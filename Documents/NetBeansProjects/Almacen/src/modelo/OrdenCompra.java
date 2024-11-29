
package modelo;
import java.sql.Date;
import java.util.List;


public class OrdenCompra {
    private int ordenid;
    private int proveedorid;
    private int empleadoid;
    private double costototal;
    private Date fechaorden;
    private List<DetalleOrden> detalle;

    public OrdenCompra() {
    }

    public OrdenCompra(int ordenid, int proveedorid, int empleadoid, double costototal, Date fechaorden) {
        this.ordenid = ordenid;
        this.proveedorid = proveedorid;
        this.empleadoid = empleadoid;
        this.costototal = costototal;
        this.fechaorden = fechaorden;
    }

    public int getOrdenid() {
        return ordenid;
    }

    public void setOrdenid(int ordenid) {
        this.ordenid = ordenid;
    }

    public int getProveedorid() {
        return proveedorid;
    }

    public void setProveedorid(int proveedorid) {
        this.proveedorid = proveedorid;
    }

    public int getEmpleadoid() {
        return empleadoid;
    }

    public void setEmpleadoid(int empleadoid) {
        this.empleadoid = empleadoid;
    }

    public double getCostototal() {
        return costototal;
    }

    public void setCostototal(double costototal) {
        this.costototal = costototal;
    }

    public Date getFechaorden() {
        return fechaorden;
    }

    public void setFechaorden(Date fechaorden) {
        this.fechaorden = fechaorden;
    }
    
    
    
    
}
