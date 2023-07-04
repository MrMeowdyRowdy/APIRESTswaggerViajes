package com.viajes.viajes.controller;

import com.viajes.viajes.persistence.entity.entity.Cliente;
import com.viajes.viajes.persistence.entity.entity.Viaje;
import com.viajes.viajes.service.ViajeService;
import com.viajes.viajes.service.dto.HotelInDTO;
import com.viajes.viajes.service.dto.ViajeInDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/viajes")
public class ViajeController {

    private final ViajeService viajeService;

    public ViajeController(ViajeService viajeService) {
        this.viajeService = viajeService;
    }

    @PostMapping
    public Viaje createViaje(@RequestBody ViajeInDTO viajeInDTO){
        return this.viajeService.createViaje(viajeInDTO);
    }

    @GetMapping
    public List<Viaje> findAll(){
        return this.viajeService.findAllViajes();
    }

    @DeleteMapping
    public boolean deleteViaje(ViajeInDTO viajeInDTO){
        return this.viajeService.deleteViaje(viajeInDTO);
    }
}
