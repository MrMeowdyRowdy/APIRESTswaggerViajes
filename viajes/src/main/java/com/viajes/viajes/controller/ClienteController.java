package com.viajes.viajes.controller;

import com.viajes.viajes.mapper.ClienteInDTOtoCliente;
import com.viajes.viajes.persistence.entity.entity.Cliente;
import com.viajes.viajes.service.ClientService;
import com.viajes.viajes.service.dto.ClienteInDTO;
import com.viajes.viajes.service.dto.HotelInDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    private final ClientService clientService;

    public ClienteController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping
    public Cliente createCliente(@RequestBody ClienteInDTO clienteInDTO){
        return this.clientService.createCliente(clienteInDTO);
    }

    @GetMapping
    public List<Cliente> findAll(){
        return this.clientService.findAllClientes();
    }



    @DeleteMapping
    public boolean deleteCliente(ClienteInDTO clienteInDTO){
        return this.clientService.deleteCliente(clienteInDTO);
    }
}

