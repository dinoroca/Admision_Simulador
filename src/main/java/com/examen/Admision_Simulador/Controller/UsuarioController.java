package com.examen.Admision_Simulador.Controller;

import com.examen.Admision_Simulador.Entity.Usuario;
import com.examen.Admision_Simulador.Service.IUsuarioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.servlet.http.HttpSession;
import java.util.Optional;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

    private final Logger logger= LoggerFactory.getLogger(UsuarioController.class);

    @Autowired
    private IUsuarioService usuarioService;

    BCryptPasswordEncoder passEncode= new BCryptPasswordEncoder();

    @GetMapping("/registro")
    public String create() {
        return "usuario/registro";
    }

    @PostMapping("/save")
    public String save(Usuario usuario) {
        logger.info("Usuario registro: {}", usuario);
        usuario.setPassword(passEncode.encode(usuario.getPassword()));
        usuarioService.save(usuario);
        return "usuario/principal";
    }
    @GetMapping("/login")
    public String login() {
        return "usuario/login";
    }

    @PostMapping("/acceder")
    public String acceder(Model model, Usuario usuario, HttpSession session) {
        logger.info("Accesos : {}", usuario);
        Optional<Usuario> user = usuarioService.findByEmail(usuario.getEmail());
        model.addAttribute("sesion",session.getAttribute("idusuario"));
        //logger.info("Usuario de db: {}", user.get());

        if (user.isPresent()) {
            session.setAttribute("idusuario", user.get().getId());
            model.addAttribute("preguntas",user.get().getPreguntas());
            return "usuario/principal";
        }else {
            logger.info("Usuario no existe");
            return "redirect:/usuario/login";
        }
    }

    @GetMapping("/cerrar")
    public String cerrarSesion( HttpSession session ) {
        session.removeAttribute("idusuario");
        return "redirect:/home";
    }

    @GetMapping("/finalizar")
    public String finalizar(){
        return "usuario/resultado";
    }
}
