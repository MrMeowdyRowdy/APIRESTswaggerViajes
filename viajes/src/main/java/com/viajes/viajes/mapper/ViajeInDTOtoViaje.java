package com.viajes.viajes.mapper;

import com.viajes.viajes.persistence.entity.entity.Hotel;
import com.viajes.viajes.persistence.entity.entity.Viaje;
import com.viajes.viajes.service.dto.HotelInDTO;
import com.viajes.viajes.service.dto.ViajeInDTO;
import org.springframework.stereotype.Component;

@Component
public class ViajeInDTOtoViaje implements IMapper <ViajeInDTO, Viaje>{

    @Override
    public Viaje map(ViajeInDTO in) {
        Viaje viaje = new Viaje();
        viaje.setDestino(in.getDestino());
        viaje.setDuracionDias(in.getDuracionDias());
        viaje.setPartida(in.getPartida());
        viaje.setPaquetesIncluidos(in.getPaquetesIncluidos());
        return viaje;
    }
}