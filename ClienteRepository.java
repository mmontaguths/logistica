package com.mjms.envios.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.mjms.envios.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}