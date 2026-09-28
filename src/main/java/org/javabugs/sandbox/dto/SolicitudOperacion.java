package org.javabugs.sandbox.dto;

public class SolicitudOperacion {

    private String tipoOperacion;
    private String referenciaSeguimiento;
    private ImporteDto importe;
    private Object emisor;
    private ReceptorDto receptor;
    private String concepto;
    private Integer folioNumero;

    public String getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    public String getReferenciaSeguimiento() {
        return referenciaSeguimiento;
    }

    public void setReferenciaSeguimiento(String referenciaSeguimiento) {
        this.referenciaSeguimiento = referenciaSeguimiento;
    }

    public ImporteDto getImporte() {
        return importe;
    }

    public void setImporte(ImporteDto importe) {
        this.importe = importe;
    }

    public Object getEmisor() {
        return emisor;
    }

    public void setEmisor(Object emisor) {
        this.emisor = emisor;
    }

    public ReceptorDto getReceptor() {
        return receptor;
    }

    public void setReceptor(ReceptorDto receptor) {
        this.receptor = receptor;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Integer getFolioNumero() {
        return folioNumero;
    }

    public void setFolioNumero(Integer folioNumero) {
        this.folioNumero = folioNumero;
    }
}
