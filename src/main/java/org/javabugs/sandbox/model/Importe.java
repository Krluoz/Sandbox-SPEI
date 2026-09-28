package org.javabugs.sandbox.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.math.BigDecimal;

@Embeddable
public class Importe {

    /*
    valor > 0
    valor <= 1,000,000.00
    máximo dos decimales
    divisa = MXN
    */
    @Column(
            name = "importe_valor",
            nullable = false,
            precision = 12,
            scale = 2
    )
    private BigDecimal valor;

    @Column(
            name = "importe_divisa",
            nullable = false,
            length = 3
    )
    private String divisa;

    public Importe() {
    }

    public Importe(BigDecimal valor, String divisa) {
        this.valor = valor;
        this.divisa = divisa;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public String getDivisa() {
        return divisa;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public void setDivisa(String divisa) {
        this.divisa = divisa;
    }
}