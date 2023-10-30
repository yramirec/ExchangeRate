package com.example.exchangerate.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity(name = "TIPO_DE_CAMBIO")
public class ExchangeRate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String monedaOrigen;

    @Column(nullable = false)
    private String monedaDestino;

    @Column(nullable = false, precision = 19, scale = 4)
    private BigDecimal tipoDeCambio;

    public ExchangeRate() {
    }

    public ExchangeRate(String monedaOrigen, String monedaDestino, BigDecimal tipoDeCambio) {
        this.monedaOrigen = monedaOrigen;
        this.monedaDestino = monedaDestino;
        this.tipoDeCambio = tipoDeCambio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMonedaOrigen() {
        return monedaOrigen;
    }

    public void setMonedaOrigen(String monedaOrigen) {
        this.monedaOrigen = monedaOrigen;
    }

    public String getMonedaDestino() {
        return monedaDestino;
    }

    public void setMonedaDestino(String monedaDestino) {
        this.monedaDestino = monedaDestino;
    }

    public BigDecimal getTipoDeCambio() {
        return tipoDeCambio;
    }

    public void setTipoDeCambio(BigDecimal tipoDeCambio) {
        this.tipoDeCambio = tipoDeCambio;
    }
}