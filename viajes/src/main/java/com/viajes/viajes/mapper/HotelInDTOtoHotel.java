package com.viajes.viajes.mapper;

import com.viajes.viajes.persistence.entity.entity.Hotel;
import com.viajes.viajes.service.dto.HotelInDTO;
import org.springframework.stereotype.Component;

@Component
public class HotelInDTOtoHotel implements IMapper <HotelInDTO, Hotel>{

    @Override
    public Hotel map(HotelInDTO in) {
        Hotel hotel = new Hotel();
        hotel.setNombre(in.getNombre());
        hotel.setUbicacion(in.getUbicacion());
        hotel.setCantEstrellas(in.getDuracionEstanciaDias());
        hotel.setServiciosExtras(in.getServiciosExtras());
        return hotel;
    }
}