package com.viajes.viajes.mapper;

import com.viajes.viajes.persistence.entity.entity.Cliente;
import com.viajes.viajes.service.dto.ClienteInDTO;
import org.springframework.stereotype.Component;

@Component
public class ClienteInDTOtoCliente implements IMapper <ClienteInDTO, Cliente>{

    @Override
    public Cliente map(ClienteInDTO in) {
        Cliente cliente = new Cliente();
        cliente.setNombre(in.getNombre());
        cliente.setApellido(in.getApellido());
        cliente.setNacionalidad(in.getNacionalidad());
        cliente.setDocIdentidad(in.getDocIdentidad());
        cliente.setDireccionDomicilio(in.getDireccionDomicilio());
        cliente.setFechaNacimiento(in.getFechaNacimiento());

        return cliente;
    }
}
