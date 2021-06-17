package com.LuisBautista;

import org.springframework.web.bind.annotation.GetMapping;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
/**
 *
 * @author Luis Bautista
 * Clase que contiene un controlador de tipo rest, para desplegar inffo alnavegador
 * asi como el servidor enviando informacion con el log.
 */
@Controller
@Slf4j //para tener acceso a la variable log
public class ControladorInicio {
    
    //para acceder valores dentro del application.properties hacemos lo sig.
    @Value("${index.saludo}")
    private String saludo;//aca se inyecta el valor de los properties
    
    //para procesar la informacion de tipo get e indicar el path para la ruta de inicio 
    @GetMapping("/")      
    public String inicio(Model model){  
        //para enviar info a la vista se hace uso de model para enviar el atributo
        var mensaje = "Enviando info a la vista con Model y Thymeleaf";
        log.info("Ejecutando el Controlador Spring MVC"); 
        //se agrega el atributo a model de clave valor para que lo pueda usar la vista
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("saludo", saludo);
        return "index";
    }

}
