package com.mjms.envios.model;

import javax.persistence.*;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;


@Entity
@Table (name="clientes")

public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre_cliente;
    private String apellido_cliente;
    private String direccion_cliente;
    private String telefono_cliente;
    private String email_cliente;


    public Cliente(Integer id, String nombre_cliente, String apellido_cliente, String direccion_cliente, String telefono_cliente, String email_cliente) {
        this.id = id;
        this.nombre_cliente = nombre_cliente;
        this.apellido_cliente = apellido_cliente;
        this.direccion_cliente = direccion_cliente;
        this.telefono_cliente = telefono_cliente;
        this.email_cliente = email_cliente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getApellido_cliente() {
        return apellido_cliente;
    }

    public void setApellido_cliente(String apellido_cliente) {
        this.apellido_cliente = apellido_cliente;
    }

    public String getDireccion_cliente() {
        return direccion_cliente;
    }

    public void setDireccion_cliente(String direccion_cliente) {
        this.direccion_cliente = direccion_cliente;
    }

    public String getTelefono_cliente() {
        return telefono_cliente;
    }

    public void setTelefono_cliente(String telefono_cliente) {
        this.telefono_cliente = telefono_cliente;
    }

    public String getEmail_cliente() {
        return email_cliente;
    }

    public void setEmail_cliente(String email_cliente) {
        this.email_cliente = email_cliente;
    }
}