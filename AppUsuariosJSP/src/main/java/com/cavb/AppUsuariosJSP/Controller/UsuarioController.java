package com.cavb.AppUsuariosJSP.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
    @GetMapping
    public String GetAll(Model model){
        model.addAttribute("message", "Hola a todos!");
        return "index";
    }
}
