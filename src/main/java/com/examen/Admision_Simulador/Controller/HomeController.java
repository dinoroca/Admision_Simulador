package com.examen.Admision_Simulador.Controller;

import com.examen.Admision_Simulador.Service.IUsuarioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HomeController {

    private final Logger log = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private IUsuarioService usuarioService;

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