package com.bodega.fabedi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_producto")
public class ModelProducto {

    @Id
    @Column(name = "pro_cod", nullable = false, length = 6)
    private String pro_cod;

    @Column(name = "pro_nombre", nullable = false, length = 100)
    private String pro_nombre;

    @Column(name = "pro_stock", nullable = false, length = 4)
    private String pro_stock;

    @Column(name = "pro_compra", nullable = false, precision = 6)
    private Double pro_compra;

    @Column(name = "pro_venta", nullable = false, precision = 6)
    private Double pro_venta; // Fixed the duplicate annotation for pro_compra

    @Column(name = "pro_estado", nullable = false, length = 1)
    private String pro_estado;

    @Column(name = "pro_envase", nullable = false, length = 1)
    private String pro_envase;

    @Column(name = "pro_categoria", nullable = false, length = 25)
    private String pro_categoria;

    public ModelProducto(String pro_cod, String pro_nombre, String pro_stock, Double pro_compra, Double pro_venta,
            String pro_estado, String pro_envase, String pro_categoria) {
        this.pro_cod = pro_cod;
        this.pro_nombre = pro_nombre;
        this.pro_stock = pro_stock;
        this.pro_compra = pro_compra;
        this.pro_venta = pro_venta;
        this.pro_estado = pro_estado;
        this.pro_envase = pro_envase;
        this.pro_categoria = pro_categoria;
    }

    // GETTERS AND SETTERS

    public String getPro_cod() {
        return pro_cod;
    }

    public void setPro_cod(String pro_cod) {
        this.pro_cod = pro_cod;
    }

    public String getPro_nombre() {
        return pro_nombre;
    }

    public void setPro_nombre(String pro_nombre) {
        this.pro_nombre = pro_nombre;
    }

    public String getPro_stock() {
        return pro_stock;
    }

    public void setPro_stock(String pro_stock) {
        this.pro_stock = pro_stock;
    }

    public Double getPro_compra() {
        return pro_compra;
    }

    public void setPro_compra(Double pro_compra) {
        this.pro_compra = pro_compra;
    }

    public Double getPro_venta() {
        return pro_venta;
    }

    public void setPro_venta(Double pro_venta) {
        this.pro_venta = pro_venta;
    }

    public String getPro_estado() {
        return pro_estado;
    }

    public void setPro_estado(String pro_estado) {
        this.pro_estado = pro_estado;
    }

    public String getPro_envase() {
        return pro_envase;
    }

    public void setPro_envase(String pro_envase) {
        this.pro_envase = pro_envase;
    }

    public String getPro_categoria() {
        return pro_categoria;
    }

    public void setPro_categoria(String pro_categoria) {
        this.pro_categoria = pro_categoria;
    }
}