package com.LuisBautista;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;
/**
 *
 * @author Luis Bautista
 * Clase que contiene un controlador de tipo rest, para desplegar inffo alnavegador
 * asi como el servidor enviando informacion con el log.
 */
@RestController
@Slf4j //para tener acceso a la variable log
public class ControladorInicio {
    
    @GetMapping("/")      
    public String inicio(){
        log.info("Ejecutando el Controlador rest");
        log.debug("Mas detalles del Controladorr");
        return "Hola Mundoo con SPRING reload!! 2";
    }

}
