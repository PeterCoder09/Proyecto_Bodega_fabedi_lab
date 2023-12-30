package com.bodega.fabedi.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "tb_venta")
public class ModelVenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Specify the generation strategy
    @Column(name = "id_venta", nullable = false, length = 6)
    private long id_venta;

    @Column(name = "fecha", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fecha;

    @Column(name = "total", nullable = false, precision = 6)
    private Double total;

    public ModelVenta(long id_venta, Date fecha, Double total) {
        this.id_venta = id_venta;
        this.fecha = fecha;
        this.total = total;
    }

    // Add a default constructor for JPA
    public ModelVenta() {
    }

    // Getters and setters
    public long getId_venta() {
        return id_venta;
    }

    public void setId_venta(long id_venta) {
        this.id_venta = id_venta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
