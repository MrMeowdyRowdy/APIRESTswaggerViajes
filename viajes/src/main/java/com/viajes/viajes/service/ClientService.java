package com.viajes.viajes.service;

import com.viajes.viajes.mapper.ClienteInDTOtoCliente;
import com.viajes.viajes.persistence.entity.entity.Cliente;
import com.viajes.viajes.persistence.entity.entity.Hotel;
import com.viajes.viajes.persistence.entity.repository.ClienteRepository;
import com.viajes.viajes.service.dto.ClienteInDTO;
import com.viajes.viajes.service.dto.HotelInDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    private final ClienteRepository clienteRepository;
    private final ClienteInDTOtoCliente mapper;
    public ClientService(ClienteRepository clienteRepository, ClienteInDTOtoCliente mapper) {
        this.clienteRepository = clienteRepository;
        this.mapper = mapper;
    }

    public Cliente createCliente(ClienteInDTO clienteInDTO){
        Cliente cliente = mapper.map(clienteInDTO);
        return this.clienteRepository.save(cliente);
    }

    public List<Cliente> findAllClientes(){
        return this.clienteRepository.findAll();
    }

    public boolean deleteCliente(ClienteInDTO clienteInDTO){
        Cliente cliente = mapper.map(clienteInDTO);
        this.clienteRepository.delete(cliente);
        return true;
    }
}
