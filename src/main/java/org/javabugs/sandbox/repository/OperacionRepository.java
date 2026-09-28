package org.javabugs.sandbox.repository;

import org.javabugs.sandbox.model.Operacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperacionRepository
        extends JpaRepository<Operacion, Long> {

    boolean existsByReferenciasReferenciaSeguimiento(
            String referenciaSeguimiento
    );

}