package org.javabugs.sandbox.dto;

public class EmisorVNTDto {
    private String nombre;
    private String identificacionFiscal;
    private String sucursal;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacionFiscal() {
        return identificacionFiscal;
    }

    public void setIdentificacionFiscal(String identificacionFiscal) {
        this.identificacionFiscal = identificacionFiscal;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }
}
