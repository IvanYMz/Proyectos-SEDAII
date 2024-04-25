package com.mycompany.tienda;

/**
 *
 * @author ivan_
 */
public class Carrito {
    private int Id;
    private String Producto;
    private String Descripción;
    private int Costo_u;
    private int costo;
    private int cantidad;
    private String Fecha;
    private String Vendedor;
    int tam;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public String getDescripción() {
        return Descripción;
    }

    public void setDescripción(String Descripción) {
        this.Descripción = Descripción;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getVendedor() {
        return Vendedor;
    }

    public void setVendedor(String Vendedor) {
        this.Vendedor = Vendedor;
    }
    
    public int getTam() {
        return (getProducto().length() * 2 + 2) + (getDescripción().length() * 2 + 2) + (getFecha().length() * 2 + 2) + (getVendedor().length() * 2 + 2) + 4 + 4 + 4 + 4;
    }

    public int getCosto_u() {
        return Costo_u;
    }

    public void setCosto_u(int Costo_u) {
        this.Costo_u = Costo_u;
    }
}
