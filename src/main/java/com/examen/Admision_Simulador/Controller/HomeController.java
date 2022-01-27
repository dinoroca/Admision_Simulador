package com.examen.Admision_Simulador.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home() {
        return "index";
    }

    @GetMapping("/contactos")
    public String contactos() {
        return "contactos";
    }

    @GetMapping("/nosotros")
    public String nosotros() {
        return "nosotros";
    }

    @GetMapping("/politica")
    public String politica() {
        return "politica";
    }

    @GetMapping("/preguntas")
    public String preguntas() {
        return "preguntas";
    }

    @GetMapping("/carreras")
    public String carreras() {
        return "carreras";
    }
}