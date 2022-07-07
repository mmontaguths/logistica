package com.mjms.envios.Rest;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import com.mjms.envios.model.Cliente;
import com.mjms.envios.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping ("/envios/clientes/")
public class ClienteRest {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    private ResponseEntity<Cliente> guardar (@RequestBody Cliente cliente){
        Cliente temporal = clienteService.create(cliente);

        try {
            return ResponseEntity.created(new URI("/envios/clientes"+temporal.getId())).body(temporal);

        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }


    @GetMapping
    private ResponseEntity<List<Cliente>> listarTodasLosdatos (){
        return ResponseEntity.ok(clienteService.getAllClientes);
    }

    @DeleteMapping
    private ResponseEntity<Void> eliminarCliente (@RequestBody Cliente cliente){
        clienteService.delete(cliente);
        return ResponseEntity.ok().build();
    }

    @GetMapping (value = "{id}")
    private ResponseEntity<Optional<Cliente>> listarClientesPorID (@PathVariable ("id") Integer id){
        return ResponseEntity.ok(clienteService.findById(id));
    }


}








