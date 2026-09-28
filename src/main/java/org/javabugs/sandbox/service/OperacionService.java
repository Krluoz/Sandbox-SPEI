package org.javabugs.sandbox.service;

import org.javabugs.sandbox.dto.OperacionResponse;
import org.javabugs.sandbox.dto.SolicitudOperacion;
import org.springframework.stereotype.Service;

@Service
public class OperacionService {
    public OperacionResponse registarOperacion (SolicitudOperacion solicitudn){
        OperacionResponse respuesta = new OperacionResponse();
        respuesta.setId(1L);
        respuesta.setMensaje("Operacion recibida");

        return respuesta;
    }
}
