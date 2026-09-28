package org.javabugs.sandbox.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "operacion",
        indexes = {
                @Index(
                        name = "idx_operacion_estado",
                        columnList = "estado"
                ),
                @Index(
                        name = "idx_operacion_tipo",
                        columnList = "tipo_operacion"
                ),
                @Index(
                        name = "idx_operacion_fecha",
                        columnList = "fecha_registro"
                )
        }
)
public class Operacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(
            name = "tipo_operacion",
            nullable = false,
            length = 3
    )
    private TipoOperacion tipoOperacion;

    @Enumerated(EnumType.STRING)
    @Column(
            name = "estado",
            nullable = false,
            length = 20
    )
    private EstadoOperacion estado;

    @Embedded
    private Emisor emisor;

    @Embedded
    private Receptor receptor;

    @Embedded
    private Importe importe;

    @Embedded
    private Referencias referencias;

    @Column(
            name = "fecha_registro",
            nullable = false,
            updatable = false
    )
    private LocalDateTime fechaRegistro;

    public Operacion() {
    }

    public Operacion(
            TipoOperacion tipoOperacion,
            EstadoOperacion estado,
            Emisor emisor,
            Receptor receptor,
            Importe importe,
            Referencias referencias) {

        this.tipoOperacion = tipoOperacion;
        this.estado = estado;
        this.emisor = emisor;
        this.receptor = receptor;
        this.importe = importe;
        this.referencias = referencias;
    }

    @PrePersist
    public void prePersist() {

        if (fechaRegistro == null) {
            fechaRegistro = LocalDateTime.now();
        }

        if (estado == null) {
            estado = EstadoOperacion.RECIBIDO;
        }
    }

    public Long getId() {
        return id;
    }

    public TipoOperacion getTipoOperacion() {
        return tipoOperacion;
    }

    public EstadoOperacion getEstado() {
        return estado;
    }

    public Emisor getEmisor() {
        return emisor;
    }

    public Receptor getReceptor() {
        return receptor;
    }

    public Importe getImporte() {
        return importe;
    }

    public Referencias getReferencias() {
        return referencias;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setTipoOperacion(
            TipoOperacion tipoOperacion) {

        this.tipoOperacion = tipoOperacion;
    }

    public void setEstado(
            EstadoOperacion estado) {

        this.estado = estado;
    }

    public void setEmisor(Emisor emisor) {
        this.emisor = emisor;
    }

    public void setReceptor(Receptor receptor) {
        this.receptor = receptor;
    }

    public void setImporte(Importe importe) {
        this.importe = importe;
    }

    public void setReferencias(
            Referencias referencias) {

        this.referencias = referencias;
    }
}