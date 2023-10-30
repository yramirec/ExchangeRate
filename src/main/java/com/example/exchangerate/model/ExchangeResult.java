package com.example.exchangerate.model;

import java.math.BigDecimal;

public class ExchangeResult {

    private BigDecimal monto;
    private BigDecimal montoConTipoDeCambio;
    private String monedaOrigen;
    private String monedaDestino;
    private BigDecimal tipoDeCambio;

    public ExchangeResult(BigDecimal monto, BigDecimal montoConTipoDeCambio, String monedaOrigen, String monedaDestino, BigDecimal tipoDeCambio) {
        this.monto = monto;
        this.montoConTipoDeCambio = montoConTipoDeCambio;
        this.monedaOrigen = monedaOrigen;
        this.monedaDestino = monedaDestino;
        this.tipoDeCambio = tipoDeCambio;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public BigDecimal getMontoConTipoDeCambio() {
        return montoConTipoDeCambio;
    }

    public void setMontoConTipoDeCambio(BigDecimal montoConTipoDeCambio) {
        this.montoConTipoDeCambio = montoConTipoDeCambio;
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

    @Override
    public String toString() {
        return "ResultadoCambio{" +
                "monto=" + monto +
                ", montoConTipoDeCambio=" + montoConTipoDeCambio +
                ", monedaOrigen='" + monedaOrigen + '\'' +
                ", monedaDestino='" + monedaDestino + '\'' +
                ", tipoDeCambio=" + tipoDeCambio +
                '}';
    }
}
