package org.javabugs.sandbox.controller;

import org.javabugs.sandbox.dto.OperacionResponse;
import org.javabugs.sandbox.dto.SolicitudOperacion;
import org.javabugs.sandbox.service.OperacionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/operaciones")
public class OperacionController {
    private final OperacionService operacionService;

    public OperacionController(OperacionService operacionService) {
        this.operacionService = operacionService;
    }

    @PostMapping
    public ResponseEntity<OperacionResponse> registarOperacion(@RequestBody SolicitudOperacion solicitud){
        OperacionResponse respuesta = operacionService.registarOperacion(solicitud);
        return ResponseEntity.status(HttpStatus.CREATED).body(respuesta);
    }

}
