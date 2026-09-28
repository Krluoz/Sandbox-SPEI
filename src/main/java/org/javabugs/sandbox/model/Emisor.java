package org.javabugs.sandbox.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Emisor {

    @Column(name = "emisor_nombre", length = 40)
    private String nombre;

    @Column(name = "emisor_cuenta", length = 18)
    /* Cuenta no tiene nullable = false puesto que cuando la
    * transaccion es VNT puede ser null*/
    private String cuenta;

    @Column(name = "emisor_institucion", length = 3)
    private String institucion;

    @Column(name = "emisor_sucursal", length = 50)
    private String sucursal;

    @Column(name = "emisor_documento_identidad", length = 50)
    private String documentoIdentidad;

    public Emisor() {
    }

    public Emisor(
            String nombre,
            String cuenta,
            String institucion,
            String sucursal,
            String documentoIdentidad) {

        this.nombre = nombre;
        this.cuenta = cuenta;
        this.institucion = institucion;
        this.sucursal = sucursal;
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public String getInstitucion() {
        return institucion;
    }

    public String getSucursal() {
        return sucursal;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }
}