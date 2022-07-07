package com.mjms.envios.service;



import java.util.List;
import java.util.Optional;

import com.mjms.envios.Repository.ClienteRepository;
import com.mjms.envios.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



    @Service
    public class ClienteService {

        public List<Cliente> getAllClientes;
        @Autowired
        private ClienteRepository clienteReporitory;


        public Cliente create (Cliente cliente) {

            return clienteReporitory.save(cliente);
        }

        public List<Cliente> getAllClientes (){
            return clienteReporitory.findAll();
        }

        public void delete (Cliente cliente) {
            clienteReporitory.delete(cliente);
        }

        public Optional<Cliente> findById (Integer id) {
            return clienteReporitory.findById(id);
        }



}
