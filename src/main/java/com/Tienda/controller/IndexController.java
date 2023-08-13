package com.Tienda.controller;

import com.Tienda.service.ProductoService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ldied
 */
@Controller
public class IndexController {
    
    @Autowired
    ProductoService productoService;
    @RequestMapping("/")
    public String page(Model model, HttpSession session) {
//        String imagen = (String)session.getAttribute("usuarioImagen");
//        model.addAttribute("avatar", imagen);
        var listaProductos = productoService.getProductos(true);
        model.addAttribute("productos", listaProductos);
        return "index";
    }
    
    
    
    
}
