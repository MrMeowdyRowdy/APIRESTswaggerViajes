package com.viajes.viajes.persistence.entity.repository;

import com.viajes.viajes.persistence.entity.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository  extends JpaRepository<Hotel, Long> {
}
