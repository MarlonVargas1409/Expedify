
package modelo;

public class DetalleVenta {
    
    private int detalleOrdenVentaID;
    private int productoID;
    private int ordenVentaID;
    private int cantidadVendida;
    private double precioUnitario;

    public DetalleVenta() {
    }

    public DetalleVenta(int detalleOrdenVentaID, int productoID, int ordenVentaID, int cantidadVendida, double precioUnitario) {
        this.detalleOrdenVentaID = detalleOrdenVentaID;
        this.productoID = productoID;
        this.ordenVentaID = ordenVentaID;
        this.cantidadVendida = cantidadVendida;
        this.precioUnitario = precioUnitario;
    }

    public int getDetalleOrdenVentaID() {
        return detalleOrdenVentaID;
    }

    public void setDetalleOrdenVentaID(int detalleOrdenVentaID) {
        this.detalleOrdenVentaID = detalleOrdenVentaID;
    }

    public int getProductoID() {
        return productoID;
    }

    public void setProductoID(int productoID) {
        this.productoID = productoID;
    }

    public int getOrdenVentaID() {
        return ordenVentaID;
    }

    public void setOrdenVentaID(int ordenVentaID) {
        this.ordenVentaID = ordenVentaID;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    
    public double getSubtotal() {
        return cantidadVendida * precioUnitario;
    }

    
}
