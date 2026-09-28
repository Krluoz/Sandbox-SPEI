package org.javabugs.sandbox.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Receptor {

    @Column(
            name = "receptor_nombre",
            nullable = false,
            length = 40
    )
    private String nombre;

    @Column(
            name = "receptor_cuenta",
            nullable = false,
            length = 18
    )
    private String cuenta;

    @Column(
            name = "receptor_institucion",
            nullable = false,
            length = 3
    )
    private String institucion;

    public Receptor() {
    }

    public Receptor(
            String nombre,
            String cuenta,
            String institucion) {

        this.nombre = nombre;
        this.cuenta = cuenta;
        this.institucion = institucion;
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }
}