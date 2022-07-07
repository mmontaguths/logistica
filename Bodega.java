package com.mjms.envios.model;

import javax.persistence.*;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;

@Entity
@Table (name="bodegas")
public class Bodega {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre_bodega;
    private String pais_bodega;
    private String departamento_bodega;
    private String ciudad_bodega;
    private String direccion_bodega;
    private String telefono_bodega;


    public Bodega(Integer id, String nombre_bodega, String pais_bodega, String departamento_bodega, String ciudad_bodega, String direccion_bodega, String telefono_bodega) {
        this.id = id;
        this.nombre_bodega = nombre_bodega;
        this.pais_bodega = pais_bodega;
        this.departamento_bodega = departamento_bodega;
        this.ciudad_bodega = ciudad_bodega;
        this.direccion_bodega = direccion_bodega;
        this.telefono_bodega = telefono_bodega;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre_bodega() {
        return nombre_bodega;
    }

    public void setNombre_bodega(String nombre_bodega) {
        this.nombre_bodega = nombre_bodega;
    }

    public String getPais_bodega() {
        return pais_bodega;
    }

    public void setPais_bodega(String pais_bodega) {
        this.pais_bodega = pais_bodega;
    }

    public String getDepartamento_bodega() {
        return departamento_bodega;
    }

    public void setDepartamento_bodega(String departamento_bodega) {
        this.departamento_bodega = departamento_bodega;
    }

    public String getCiudad_bodega() {
        return ciudad_bodega;
    }

    public void setCiudad_bodega(String ciudad_bodega) {
        this.ciudad_bodega = ciudad_bodega;
    }

    public String getDireccion_bodega() {
        return direccion_bodega;
    }

    public void setDireccion_bodega(String direccion_bodega) {
        this.direccion_bodega = direccion_bodega;
    }

    public String getTelefono_bodega() {
        return telefono_bodega;
    }

    public void setTelefono_bodega(String telefono_bodega) {
        this.telefono_bodega = telefono_bodega;
    }
}
