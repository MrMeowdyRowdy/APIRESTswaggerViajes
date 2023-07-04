package com.viajes.viajes.service;

import com.viajes.viajes.mapper.HotelInDTOtoHotel;
import com.viajes.viajes.persistence.entity.entity.Cliente;
import com.viajes.viajes.persistence.entity.entity.Hotel;
import com.viajes.viajes.persistence.entity.repository.HotelRepository;
import com.viajes.viajes.service.dto.HotelInDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {
    private final HotelRepository hotelRepository;
    private final HotelInDTOtoHotel mapper;
    public HotelService(HotelRepository hotelRepository, HotelInDTOtoHotel mapper) {
        this.hotelRepository = hotelRepository;
        this.mapper = mapper;
    }

    public Hotel createHotel(HotelInDTO hotelInDTO){
        Hotel hotel = mapper.map(hotelInDTO);
        return this.hotelRepository.save(hotel);
    }

    public List<Hotel> findAllHoteles(){
        return this.hotelRepository.findAll();
    }

    public boolean deleteHotel(HotelInDTO hotelInDTO){
        Hotel hotel = mapper.map(hotelInDTO);
        this.hotelRepository.delete(hotel);
        return true;
    }
}
