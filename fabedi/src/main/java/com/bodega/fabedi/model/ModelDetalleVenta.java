package com.bodega.fabedi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_detalle_venta")
public class ModelDetalleVenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle", nullable = false)
    private long idDetalle;

    @ManyToOne
    @JoinColumn(name = "id_venta")
    private ModelVenta venta;

    @ManyToOne
    @JoinColumn(name = "pro_cod")
    private ModelProducto producto;

    @Column(name = "cantidad", nullable = false, length = 3)
    private int cantidad;

    @Column(name = "pro_precio", nullable = false, precision = 6)
    private Double precioProducto;

    // Constructor
    public ModelDetalleVenta(long idDetalle, ModelVenta venta, ModelProducto producto, int cantidad,
            Double precioProducto) {
        this.idDetalle = idDetalle;
        this.venta = venta;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioProducto = precioProducto;
    }

    // Getters y Setters

    public long getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(long idDetalle) {
        this.idDetalle = idDetalle;
    }

    public ModelVenta getVenta() {
        return venta;
    }

    public void setVenta(ModelVenta venta) {
        this.venta = venta;
    }

    public ModelProducto getProducto() {
        return producto;
    }

    public void setProducto(ModelProducto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(Double precioProducto) {
        this.precioProducto = precioProducto;
    }
}
