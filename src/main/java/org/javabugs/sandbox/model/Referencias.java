package org.javabugs.sandbox.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Referencias {

    @Column(
            name = "concepto",
            nullable = false,
            length = 40
    )
    private String concepto;

    @Column(
            name = "folio_numerico",
            nullable = false
    )
    private Integer folioNumerico;

    // V12: referencia no puede estar registrada previamente
    @Column(
            name = "referencia_seguimiento",
            nullable = false,
            unique = true,
            length = 30
    )
    private String referenciaSeguimiento;

    public Referencias() {
    }

    public Referencias(
            String concepto,
            Integer folioNumerico,
            String referenciaSeguimiento) {

        this.concepto = concepto;
        this.folioNumerico = folioNumerico;
        this.referenciaSeguimiento =
                referenciaSeguimiento;
    }

    public String getConcepto() {
        return concepto;
    }

    public Integer getFolioNumerico() {
        return folioNumerico;
    }

    public String getReferenciaSeguimiento() {
        return referenciaSeguimiento;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public void setFolioNumerico(Integer folioNumerico) {
        this.folioNumerico = folioNumerico;
    }

    public void setReferenciaSeguimiento(
            String referenciaSeguimiento) {

        this.referenciaSeguimiento =
                referenciaSeguimiento;
    }
}