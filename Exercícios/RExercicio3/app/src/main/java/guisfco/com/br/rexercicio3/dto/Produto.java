package guisfco.com.br.rexercicio3.dto;

import java.io.Serializable;

/**
 * Created by guilherme.francisco on 23/04/19.
 */

public class Produto implements Serializable {
    private String produto;
    private String estadoFisico;
    private Double peso;
    private String unidadeMedida;

    public Produto(String produto, String estadoFisico, Double peso, String unidadeMedida) {
        this.produto = produto;
        this.estadoFisico = estadoFisico;
        this.peso = peso;
        this.unidadeMedida = unidadeMedida;
    }

    public String getProduto() {
        return produto;
    }

    public String getEstadoFisico() {
        return estadoFisico;
    }

    public Double getPeso() {
        return peso;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    @Override
    public String toString() {
        return produto + ":" + estadoFisico;
    }
}
