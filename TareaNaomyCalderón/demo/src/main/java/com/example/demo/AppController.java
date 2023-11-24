package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    
    @GetMapping("/pagina")
    public String pagina(Model model) {
        model.addAttribute("tituloH1", "Hola desde el H1");
        model.addAttribute("textoH2", "Este es el texto del H2");
        model.addAttribute("textoDiv", "Contenido del div");
        return "pagina";
    }

}
