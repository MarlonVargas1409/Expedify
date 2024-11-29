
package modelo;

import java.util.Date;


public class MovimientoInventario {
    
    private int movimientoID;         
    private int empleadoID;           
    private int productoID;           
    private int cambioCantidad;       
    private String razon;             
    private Date fechaMovimiento;

    public MovimientoInventario() {
    }

    public MovimientoInventario(int movimientoID, int empleadoID, int productoID, int cambioCantidad, String razon, Date fechaMovimiento) {
        this.movimientoID = movimientoID;
        this.empleadoID = empleadoID;
        this.productoID = productoID;
        this.cambioCantidad = cambioCantidad;
        this.razon = razon;
        this.fechaMovimiento = fechaMovimiento;
    }

    public int getMovimientoID() {
        return movimientoID;
    }

    public void setMovimientoID(int movimientoID) {
        this.movimientoID = movimientoID;
    }

    public int getEmpleadoID() {
        return empleadoID;
    }

    public void setEmpleadoID(int empleadoID) {
        this.empleadoID = empleadoID;
    }

    public int getProductoID() {
        return productoID;
    }

    public void setProductoID(int productoID) {
        this.productoID = productoID;
    }

    public int getCambioCantidad() {
        return cambioCantidad;
    }

    public void setCambioCantidad(int cambioCantidad) {
        this.cambioCantidad = cambioCantidad;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    public Date getFechaMovimiento() {
        return fechaMovimiento;
    }

    public void setFechaMovimiento(Date fechaMovimiento) {
        this.fechaMovimiento = fechaMovimiento;
    }
    
    
    
}
