package com.example.remor.exemplo84k2019;

import java.io.Serializable;

public class Usuario implements Serializable {
    private String nome;
    private String telefone;

    public Usuario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
