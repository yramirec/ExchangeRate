package com.example.exchangerate.service;

import com.example.exchangerate.model.ExchangeResult;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;

public interface ExchangeRateService {
    public Mono<ExchangeResult> aplicarTipoDeCambio(BigDecimal monto, String monedaOrigen, String monedaDestino);
}
