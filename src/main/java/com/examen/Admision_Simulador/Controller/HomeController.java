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
}