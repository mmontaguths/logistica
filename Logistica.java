package com.mjms.envios.model;

import javax.persistence.*;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;



@Entity
@Table (name="logisticas")

public class Logistica {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private String tipo_logistica;
    private String descripcion_logistica;
    private String tipo_descuento;

    @ManyToOne
    private Envio envio;




    public Logistica(Integer id, String tipo_logistica, String descripcion_logistica, String tipo_descuento) {
        this.id = id;
        this.tipo_logistica = tipo_logistica;
        this.descripcion_logistica = descripcion_logistica;
        this.tipo_descuento = tipo_descuento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo_logistica() {
        return tipo_logistica;
    }

    public void setTipo_logistica(String tipo_logistica) {
        this.tipo_logistica = tipo_logistica;
    }

    public String getDescripcion_logistica() {
        return descripcion_logistica;
    }

    public void setDescripcion_logistica(String descripcion_logistica) {
        this.descripcion_logistica = descripcion_logistica;
    }

    public String getTipo_descuento() {
        return tipo_descuento;
    }

    public void setTipo_descuento(String tipo_descuento) {
        this.tipo_descuento = tipo_descuento;
    }

    public Envio getEnvios() {
        return envio;
    }

    public void setEnvios(Envio envio) {
        this.envio = envio;
    }
}
