
package modelo;


public class DetalleOrden {
    private int idProducto; 
    private String nombreProducto; 
    private int cantidad;
    private double precioUnitario; 
    private double subtotal;

    public DetalleOrden() {
    }

    public DetalleOrden(int idProducto, String nombreProducto, int cantidad, double precioUnitario, double subtotal) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.subtotal = subtotal;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
        calcularsubtotal();
    }
    
    public double getsubtotal(){
        return subtotal;
    }

    private void calcularsubtotal() {
        this.subtotal = this.cantidad * this.precioUnitario;
    }
    
    
   
    
}

