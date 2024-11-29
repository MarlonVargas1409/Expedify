
package modelo;

import java.util.Date;

public class Venta {
    
    private int ordenVentaID;
    private int empleadoID;
    private int clienteID;
    private double totalVenta;
    private Date fechaOrden;

    public Venta() {
    }
    
    

    public Venta(int ordenVentaID, int empleadoID, int clienteID, double totalVenta, Date fechaOrden) {
        this.ordenVentaID = ordenVentaID;
        this.empleadoID = empleadoID;
        this.clienteID = clienteID;
        this.totalVenta = totalVenta;
        this.fechaOrden = fechaOrden;
    }

    public int getOrdenVentaID() {
        return ordenVentaID;
    }

    public void setOrdenVentaID(int ordenVentaID) {
        this.ordenVentaID = ordenVentaID;
    }

    public int getEmpleadoID() {
        return empleadoID;
    }

    public void setEmpleadoID(int empleadoID) {
        this.empleadoID = empleadoID;
    }

    public int getClienteID() {
        return clienteID;
    }

    public void setClienteID(int clienteID) {
        this.clienteID = clienteID;
    }

    public double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }

    public Date getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(Date fechaOrden) {
        this.fechaOrden = fechaOrden;
    }
    
    
    
}
