package org.javabugs.sandbox.dto;

import java.math.BigDecimal;

public class Importe {
    private BigDecimal valor;
    private String divisa;

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getDivisa() {
        return divisa;
    }

    public void setDivisa(String divisa) {
        this.divisa = divisa;
    }
}
