package com.MedApp.Historico.Controller;

import com.MedApp.Historico.Service.S_Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class C_Usuario {
    @GetMapping("/cadastro")
    public String getCadastro(){
        return "Usuario/cadastro";
    }
    @PostMapping("/cadastro")
    public String cadastrarUsuario(@RequestParam("nome") String nome,
                                   @RequestParam("email") String email,
                                   @RequestParam("CPF") String CPF,
                                   @RequestParam("senha") String senha,
                                   @RequestParam("confirmar_senha")String confirmar_senha){
        S_Usuario.cadastrarUsuario(nome, email, CPF,senha,confirmar_senha);
        return "Usuario/cadastro";
    }
}
