package com.mjms.envios.model;

import javax.persistence.*;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;

@Entity
@Table(name="envios")
public class Envio {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String estado_envio;

    public Envio(Integer id, String estado_envio) {
        this.id = id;
        this.estado_envio = estado_envio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEstado_envio() {
        return estado_envio;
    }

    public void setEstado_envio(String estado_envio) {
        this.estado_envio = estado_envio;
    }
}
