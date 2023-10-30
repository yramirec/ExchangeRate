package com.example.exchangerate.repository;

import com.example.exchangerate.entity.ExchangeRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExchangeRateRepository extends JpaRepository<ExchangeRate, Long> {
    Optional<ExchangeRate> findByMonedaOrigenAndMonedaDestino(String monedaOrigen, String monedaDestino);
}
