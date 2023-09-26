package com.MedApp.Historico.Service;

import com.MedApp.Historico.Model.M_Usuario;
import com.MedApp.Historico.Repository.R_Usuario;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
public class S_Usuario {
    private static R_Usuario r_usuario;

    public S_Usuario(R_Usuario r_usuario) {
        this.r_usuario =  r_usuario;
    }
    public static String cadastrarUsuario(String nome, String email, String CPF, String senha,String ConfSenha) {
        boolean podeSalvar = true;
        String mensagem = "";
        if(S_Generico.textoEstaVazio(nome)){
            podeSalvar = false;
            mensagem += "O nome precisa ser preenchido!";
        }
        if(!S_Generico.validarEmail(email)){
            podeSalvar = false;
            mensagem += "e-Mail inválido!";
        }
        if(!CpfValidador.validateCPF(CPF)){
            podeSalvar = false;
            mensagem += "CPF Inválido<br/>";

        }
        if(!senha.equals(ConfSenha)) {
            podeSalvar = false;
            mensagem += "A Senha e a Confirmação de Senha devem ser iguais<br/>";

        }


        if(podeSalvar){
            M_Usuario m_usuario = new M_Usuario();
            m_usuario.setNome(nome);
            m_usuario.setEmail(email);
            m_usuario.setCPF(CPF);
            m_usuario.setSenha(senha);

            try{
                r_usuario.save(m_usuario);
                mensagem += "Deu Bom";
            }catch (DataIntegrityViolationException e){
                mensagem += "Deu Ruim";
            }
        }
        return mensagem;
    }
}

