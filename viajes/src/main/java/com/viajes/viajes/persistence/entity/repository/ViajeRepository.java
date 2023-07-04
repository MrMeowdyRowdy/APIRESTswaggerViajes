package com.viajes.viajes.persistence.entity.repository;

import com.viajes.viajes.persistence.entity.entity.Viaje;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ViajeRepository  extends JpaRepository<Viaje, Long> {
}
