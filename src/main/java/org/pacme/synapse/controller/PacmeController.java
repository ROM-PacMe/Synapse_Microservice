package org.pacme.synapse.controller;
import org.pacme.synapse.dto.PersonaDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController //Buscar que es una Aplicación Rest (Servicio)
public class PacmeController {
    @GetMapping("/")
    public String logicMang() {
        return "Este es un pequeño Servicio de respuesta";
    }

    //DTO
    @PostMapping("/nombre")
    public String nombre(@RequestBody PersonaDto personaDto) {
        return "Tu Nombre es: "+personaDto.getNombre();
    }
}
