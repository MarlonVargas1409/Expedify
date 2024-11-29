
package modelo;


public class Producto {
    private int productoid;
    private String nombreproducto;
    private String categoria;
    private double preciounitario;
    private int cantidadstock;
    private int niveldeorden;
    private String descripcion;

    public Producto() {
    }

    public Producto(int productoid, String nombreproducto, String categoria, double preciounitario, int cantidadstock, int niveldeorden, String descripcion) {
        this.productoid = productoid;
        this.nombreproducto = nombreproducto;
        this.categoria = categoria;
        this.preciounitario = preciounitario;
        this.cantidadstock = cantidadstock;
        this.niveldeorden = niveldeorden;
        this.descripcion = descripcion;
    }

    public int getProductoid() {
        return productoid;
    }

    public void setProductoid(int productoid) {
        this.productoid = productoid;
    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreciounitario() {
        return preciounitario;
    }

    public void setPreciounitario(double preciounitario) {
        this.preciounitario = preciounitario;
    }

    public int getCantidadstock() {
        return cantidadstock;
    }

    public void setCantidadstock(int cantidadstock) {
        this.cantidadstock = cantidadstock;
    }

    public int getNiveldeorden() {
        return niveldeorden;
    }

    public void setNiveldeorden(int niveldeorden) {
        this.niveldeorden = niveldeorden;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
    
    
    
    
}
