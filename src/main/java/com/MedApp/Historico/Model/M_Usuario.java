package com.MedApp.Historico.Model;

import jakarta.persistence.*;

@Entity
@Table(name="cadastro")
public class M_Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String CPF;
    private String senha;
    private String confirmar_senha;

    public M_Usuario() {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.CPF = CPF;
        this.senha = senha;
        this.confirmar_senha = confirmar_senha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getConfirmar_senha() {
        return confirmar_senha;
    }

    public void setConfirmar_senha(String confirmar_senha) {
        this.confirmar_senha = confirmar_senha;
    }
}
