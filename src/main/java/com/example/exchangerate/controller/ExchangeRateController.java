package com.example.exchangerate.controller;

import com.example.exchangerate.model.ExchangeResult;
import com.example.exchangerate.service.ExchangeRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/cambio")
public class ExchangeRateController {
    @Autowired
    private ExchangeRateService exchangeRateService;

    @GetMapping
    public Mono<ResponseEntity<ExchangeResult>> aplicarCambio(
            @RequestParam BigDecimal monto,
            @RequestParam String monedaOrigen,
            @RequestParam String monedaDestino) {
        return exchangeRateService.aplicarTipoDeCambio(monto, monedaOrigen, monedaDestino)
                .map(resultado -> ResponseEntity.ok(resultado))
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }
}
