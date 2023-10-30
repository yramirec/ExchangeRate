package com.example.exchangerate.service;

import com.example.exchangerate.model.ExchangeResult;
import com.example.exchangerate.repository.ExchangeRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;

@Service
public class ExchangeRateServiceImpl implements ExchangeRateService {

    @Autowired
    private ExchangeRateRepository exchangeRateRepository;

    public Mono<ExchangeResult> aplicarTipoDeCambio(BigDecimal monto, String monedaOrigen, String monedaDestino) {
        return Mono.justOrEmpty(exchangeRateRepository.findByMonedaOrigenAndMonedaDestino(monedaOrigen, monedaDestino))
                .map(tipoDeCambio -> {
                    BigDecimal montoConTipoDeCambio = monto.multiply(tipoDeCambio.getTipoDeCambio());
                    return new ExchangeResult(monto, montoConTipoDeCambio, monedaOrigen, monedaDestino, tipoDeCambio.getTipoDeCambio());
                });
    }
}
