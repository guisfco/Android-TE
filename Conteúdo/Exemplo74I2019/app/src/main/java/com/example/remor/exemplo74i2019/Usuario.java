package com.example.remor.exemplo74i2019;

public class Usuario {
    private long id;
    private String nome;
    private String genero;
    private boolean notificacao;

    public Usuario() {
    }

    public Usuario(long id, String nome, String genero, boolean notificacao) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.notificacao = notificacao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isNotificacao() {
        return notificacao;
    }

    public void setNotificacao(boolean notificacao) {
        this.notificacao = notificacao;
    }

    @Override
    public String toString() {
        return id+":"+nome+":"+genero+":"+notificacao;
    }
}
