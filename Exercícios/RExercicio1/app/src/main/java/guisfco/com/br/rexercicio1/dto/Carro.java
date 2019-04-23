package guisfco.com.br.rexercicio1.dto;

import java.io.Serializable;

/**
 * Created by guilherme.francisco on 22/04/19.
 */

public class Carro implements Serializable {
    private String placa;
    private String cor;
    private String marca;
    private boolean novo;

    public Carro(String placa, String cor, String marca, boolean novo) {
        this.placa = placa;
        this.cor = cor;
        this.marca = marca;
        this.novo = novo;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                ", novo=" + novo +
                '}';
    }
}
