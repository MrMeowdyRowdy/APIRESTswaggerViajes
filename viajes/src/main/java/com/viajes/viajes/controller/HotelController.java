package com.viajes.viajes.controller;

import com.viajes.viajes.persistence.entity.entity.Cliente;
import com.viajes.viajes.persistence.entity.entity.Hotel;
import com.viajes.viajes.service.HotelService;
import com.viajes.viajes.service.dto.HotelInDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hoteles")
public class HotelController {

    private final HotelService hotelService;

    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @PostMapping
    public Hotel createHotel(@RequestBody HotelInDTO hotelInDTO){
        return this.hotelService.createHotel(hotelInDTO);
    }

    @GetMapping
    public List<Hotel> findAll(){
        return this.hotelService.findAllHoteles();
    }

    @DeleteMapping
    public boolean deleteHotel(HotelInDTO hotelInDTO){
        return this.hotelService.deleteHotel(hotelInDTO);
    }
}
