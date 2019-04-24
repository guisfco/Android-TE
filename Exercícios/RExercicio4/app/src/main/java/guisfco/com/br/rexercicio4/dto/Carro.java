package guisfco.com.br.rexercicio4.dto;

import java.io.Serializable;

/**
 * Created by guilherme.francisco on 23/04/19.
 */

public class Carro implements Serializable {
    private String placa;
    private String cor;
    private String marca;
    private String estado;

    public Carro(String placa, String cor, String marca, String estado) {
        this.placa = placa;
        this.cor = cor;
        this.marca = marca;
        this.estado = estado;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCor() {
        return cor;
    }

    public String getMarca() {
        return marca;
    }

    public String getEstado() {
        return estado;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return placa + ":" + cor + ":" + marca + ":" + estado;
    }
}
