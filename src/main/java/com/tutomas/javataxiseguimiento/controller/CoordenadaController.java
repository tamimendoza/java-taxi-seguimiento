package com.tutomas.javataxiseguimiento.controller;

import com.tutomas.javataxiseguimiento.model.Coordenada;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class CoordenadaController {

    @MessageMapping("/taxi")
    @SendTo("/taxi/coordenada")
    public Coordenada envio(
            Coordenada coordenada
    ) {
        // tareas del socket
        return coordenada;
    }

}
