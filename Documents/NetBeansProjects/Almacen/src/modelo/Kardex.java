
package modelo;

import java.util.Date;


public class Kardex {
    private int kardexID;              
    private int productoID;            
    private Date fechaMovimiento;      
    private String tipoMovimiento;     
    private int cantidad;              
    private int saldoActual;           
    private double costoUnitario;      
    private double costoTotal;         
    private int empleadoID;

    public Kardex() {
    }

    public Kardex(int kardexID, int productoID, Date fechaMovimiento, String tipoMovimiento, int cantidad, int saldoActual, double costoUnitario, double costoTotal, int empleadoID) {
        this.kardexID = kardexID;
        this.productoID = productoID;
        this.fechaMovimiento = fechaMovimiento;
        this.tipoMovimiento = tipoMovimiento;
        this.cantidad = cantidad;
        this.saldoActual = saldoActual;
        this.costoUnitario = costoUnitario;
        this.costoTotal = costoTotal;
        this.empleadoID = empleadoID;
    }

    public int getKardexID() {
        return kardexID;
    }

    public void setKardexID(int kardexID) {
        this.kardexID = kardexID;
    }

    public int getProductoID() {
        return productoID;
    }

    public void setProductoID(int productoID) {
        this.productoID = productoID;
    }

    public Date getFechaMovimiento() {
        return fechaMovimiento;
    }

    public void setFechaMovimiento(Date fechaMovimiento) {
        this.fechaMovimiento = fechaMovimiento;
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getCostoUnitario() {
        return costoUnitario;
    }

    public void setCostoUnitario(double costoUnitario) {
        this.costoUnitario = costoUnitario;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public int getEmpleadoID() {
        return empleadoID;
    }

    public void setEmpleadoID(int empleadoID) {
        this.empleadoID = empleadoID;
    }
    
    
    
    
}


