package com.Tienda.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ldied
 */
@Controller
public class IndexController {
    
    @RequestMapping("/")
    public String page(Model model, HttpSession session) {
//        String imagen = (String)session.getAttribute("usuarioImagen");
//        model.addAttribute("avatar", imagen);
        return "index";
    }
    
}
