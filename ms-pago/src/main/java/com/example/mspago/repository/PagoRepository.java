package com.example.mspago.repository;

import com.example.mspago.entity.Pago;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagoRepository extends JpaRepository<Pago, Integer> {
    // Puedes agregar consultas personalizadas aquí si es necesario

}
