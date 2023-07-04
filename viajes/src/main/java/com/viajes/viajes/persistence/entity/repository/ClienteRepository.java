package com.viajes.viajes.persistence.entity.repository;

import com.viajes.viajes.persistence.entity.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
