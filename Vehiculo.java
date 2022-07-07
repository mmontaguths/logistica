package com.mjms.envios.model;

import javax.persistence.*;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;


@Entity
@Table(name= "vehiculos")

public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String plac_vehiculo;
    private String modelo_vehiculo;
    private String color_vehiculo;
    private String referencia_vehiculo;


    public Vehiculo(Integer id, String plac_vehiculo, String modelo_vehiculo, String color_vehiculo, String referencia_vehiculo) {
        this.id = id;
        this.plac_vehiculo = plac_vehiculo;
        this.modelo_vehiculo = modelo_vehiculo;
        this.color_vehiculo = color_vehiculo;
        this.referencia_vehiculo = referencia_vehiculo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlac_vehiculo() {
        return plac_vehiculo;
    }

    public void setPlac_vehiculo(String plac_vehiculo) {
        this.plac_vehiculo = plac_vehiculo;
    }

    public String getModelo_vehiculo() {
        return modelo_vehiculo;
    }

    public void setModelo_vehiculo(String modelo_vehiculo) {
        this.modelo_vehiculo = modelo_vehiculo;
    }

    public String getColor_vehiculo() {
        return color_vehiculo;
    }

    public void setColor_vehiculo(String color_vehiculo) {
        this.color_vehiculo = color_vehiculo;
    }

    public String getReferencia_vehiculo() {
        return referencia_vehiculo;
    }

    public void setReferencia_vehiculo(String referencia_vehiculo) {
        this.referencia_vehiculo = referencia_vehiculo;
    }
}
