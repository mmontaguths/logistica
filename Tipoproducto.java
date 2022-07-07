package com.mjms.envios.model;

import javax.persistence.*;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;


@Entity
@Table (name="tipoproductos")

public class Tipoproducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String descripcion_tipoproducto;
    private String valor_tipoproducto;

    public Tipoproducto(Integer id, String descripcion_tipoproducto, String valor_tipoproducto) {
        this.id = id;
        this.descripcion_tipoproducto = descripcion_tipoproducto;
        this.valor_tipoproducto = valor_tipoproducto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion_tipoproducto() {
        return descripcion_tipoproducto;
    }

    public void setDescripcion_tipoproducto(String descripcion_tipoproducto) {
        this.descripcion_tipoproducto = descripcion_tipoproducto;
    }

    public String getValor_tipoproducto() {
        return valor_tipoproducto;
    }

    public void setValor_tipoproducto(String valor_tipoproducto) {
        this.valor_tipoproducto = valor_tipoproducto;
    }
}
