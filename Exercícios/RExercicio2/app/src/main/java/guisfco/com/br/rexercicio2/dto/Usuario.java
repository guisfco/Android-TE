package guisfco.com.br.rexercicio2.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by guilherme.francisco on 22/04/19.
 */

public class Usuario implements Serializable {
    private String nome;
    private String genero;
    private boolean musica;
    private boolean filme;

    public Usuario(String nome, String genero, boolean musica, boolean filme) {
        this.nome = nome;
        this.genero = genero;
        this.musica = musica;
        this.filme = filme;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public boolean isMusica() {
        return musica;
    }

    public boolean isFilme() {
        return filme;
    }

    @Override
    public String toString() {
        return nome + ":" + genero;
    }

    public String verificaInteresses() {
        StringBuilder interesses = new StringBuilder();
        if (isMusica()) {
            interesses.append(", ").append("Música");
        }
        if (isFilme()) {
            interesses.append(", ").append("Filme");
        }
        return interesses.toString();
    }

    public String show() {
        StringBuilder str = new StringBuilder();
        str.append(this.nome);
        str.append(", ").append(this.genero);
        str.append(verificaInteresses());
        return str.toString();
    }
}
