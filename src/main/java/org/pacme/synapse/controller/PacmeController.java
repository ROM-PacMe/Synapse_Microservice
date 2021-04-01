package org.pacme.synapse.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Buscar que es una Aplicación Rest (Servicio)
public class PacmeController {
    @GetMapping("/")
    public String logicMang() {
        return "Este es un pequeño Servicio de respuesta";
    }
}
