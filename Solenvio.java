package com.mjms.envios.model;

import javax.persistence.*;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;


import java.util.Date;


@Entity
@Table(name= "solenvios")


public class Solenvio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String numero_guia;
    private String valor_reportado;
    private Date fecha_recibido;
    private Date fecha_entrega;
    private String precio_envio;
    private String contenido_envio;


    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private Envio envio;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private Bodega bodega;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private Logistica logistica;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private Tipoproducto tipoproducto;

    public Solenvio() {

    }

    public Solenvio(Integer id, String numero_guia, String valor_reportado, Date fecha_recibido, Date fecha_entrega, String precio_envio, String contenido_envio, Cliente cliente, Envio envio, Bodega bodega, Logistica logistica, Tipoproducto tipoproducto) {
        this.id = id;
        this.numero_guia = numero_guia;
        this.valor_reportado = valor_reportado;
        this.fecha_recibido = fecha_recibido;
        this.fecha_entrega = fecha_entrega;
        this.precio_envio = precio_envio;
        this.contenido_envio = contenido_envio;
        this.cliente = cliente;
        this.envio = envio;
        this.bodega = bodega;
        this.logistica = logistica;
        this.tipoproducto = tipoproducto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero_guia() {
        return numero_guia;
    }

    public void setNumero_guia(String numero_guia) {
        this.numero_guia = numero_guia;
    }

    public String getValor_reportado() {
        return valor_reportado;
    }

    public void setValor_reportado(String valor_reportado) {
        this.valor_reportado = valor_reportado;
    }

    public Date getFecha_recibido() {
        return fecha_recibido;
    }

    public void setFecha_recibido(Date fecha_recibido) {
        this.fecha_recibido = fecha_recibido;
    }

    public Date getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(Date fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public String getPrecio_envio() {
        return precio_envio;
    }

    public void setPrecio_envio(String precio_envio) {
        this.precio_envio = precio_envio;
    }

    public String getContenido_envio() {
        return contenido_envio;
    }

    public void setContenido_envio(String contenido_envio) {
        this.contenido_envio = contenido_envio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Envio getEnvio() {
        return envio;
    }

    public void setEnvio(Envio envio) {
        this.envio = envio;
    }

    public Bodega getBodega() {
        return bodega;
    }

    public void setBodega(Bodega bodega) {
        this.bodega = bodega;
    }

    public Logistica getLogistica() {
        return logistica;
    }

    public void setLogistica(Logistica logistica) {
        this.logistica = logistica;
    }

    public Tipoproducto getTipoproductos() {
        return tipoproducto;
    }

    public void setTipoproductos(Tipoproducto tipoproductos) {
        this.tipoproducto = tipoproductos;
    }


}
