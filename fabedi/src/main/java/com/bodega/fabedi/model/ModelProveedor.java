package com.bodega.fabedi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "tb_proveedor")
public class ModelProveedor {
    @Id
    @Column(name = "RUC", nullable = false, length = 11)
    private long RUC;

    @Column(name = "razon_social", nullable = false, length = 100)
    private String razon_social;

    @Column(name = "nro_contacto", nullable = false, length = 9)
    private String nro_contacto;

    @Column(name = "direccion", nullable = false, length = 155)
    private String direccion;

    @Column(name = "prov_estado", nullable = false, length = 1)
    private String prov_estado;

    public ModelProveedor(long RUC, String razon_social, String nro_contacto, String direccion, String prov_estado) {
        this.RUC = RUC;
        this.razon_social = razon_social;
        this.nro_contacto = nro_contacto;
        this.direccion = direccion;
        this.prov_estado = prov_estado;
    }

    /**
     * @return long return the RUC
     */
    public long getRUC() {
        return RUC;
    }

    /**
     * @param RUC the RUC to set
     */
    public void setRUC(long RUC) {
        this.RUC = RUC;
    }

    /**
     * @return String return the razon_social
     */
    public String getRazon_social() {
        return razon_social;
    }

    /**
     * @param razon_social the razon_social to set
     */
    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    /**
     * @return String return the nro_contacto
     */
    public String getNro_contacto() {
        return nro_contacto;
    }

    /**
     * @param nro_contacto the nro_contacto to set
     */
    public void setNro_contacto(String nro_contacto) {
        this.nro_contacto = nro_contacto;
    }

    /**
     * @return String return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return String return the prov_estado
     */
    public String getProv_estado() {
        return prov_estado;
    }

    /**
     * @param prov_estado the prov_estado to set
     */
    public void setProv_estado(String prov_estado) {
        this.prov_estado = prov_estado;
    }

}
