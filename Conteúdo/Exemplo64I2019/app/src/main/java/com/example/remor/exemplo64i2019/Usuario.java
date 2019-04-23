package com.example.remor.exemplo64i2019;

public class Usuario {
    private String nome;
    private boolean fundamental;
    private boolean medio;

    public Usuario(String nome, boolean fundamental, boolean medio) {
        this.nome = nome;
        this.fundamental = fundamental;
        this.medio = medio;
    }

    public Usuario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isFundamental() {
        return fundamental;
    }

    public void setFundamental(boolean fundamental) {
        this.fundamental = fundamental;
    }

    public boolean isMedio() {
        return medio;
    }

    public void setMedio(boolean medio) {
        this.medio = medio;
    }
}
