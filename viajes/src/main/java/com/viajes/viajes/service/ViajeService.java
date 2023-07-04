package com.viajes.viajes.service;

import com.viajes.viajes.mapper.ViajeInDTOtoViaje;
import com.viajes.viajes.persistence.entity.entity.Cliente;
import com.viajes.viajes.persistence.entity.entity.Hotel;
import com.viajes.viajes.persistence.entity.entity.Viaje;
import com.viajes.viajes.persistence.entity.repository.ViajeRepository;
import com.viajes.viajes.service.dto.HotelInDTO;
import com.viajes.viajes.service.dto.ViajeInDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViajeService {
    private final ViajeRepository viajeRepository;
    private final ViajeInDTOtoViaje mapper;
    public ViajeService(ViajeRepository viajeRepository, ViajeInDTOtoViaje mapper) {
        this.viajeRepository = viajeRepository;
        this.mapper = mapper;
    }

    public Viaje createViaje(ViajeInDTO viajeInDTO){
        Viaje viaje = mapper.map(viajeInDTO);
        return this.viajeRepository.save(viaje);
    }

    public List<Viaje> findAllViajes(){
        return this.viajeRepository.findAll();
    }

    public boolean deleteViaje(ViajeInDTO viajeInDTO){
        Viaje viaje = mapper.map(viajeInDTO);
        this.viajeRepository.delete(viaje);
        return true;
    }
}
