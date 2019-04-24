package guisfco.com.br.rexercicio3.database;

import java.util.ArrayList;
import java.util.List;

import guisfco.com.br.rexercicio3.dto.Produto;

/**
 * Created by guilherme.francisco on 23/04/19.
 */

public class Database {

    public static List<Produto> produtos = new ArrayList<>();

    public static void inserir(Produto produto) {
        produtos.add(produto);
    }

    public static void deletar(Produto produto) {
        produtos.remove(produto);
    }

    public static void deletarPorId(int id) {
        produtos.remove(id);
    }

    public static Produto buscarPorId(int id) {
        return produtos.get(id);
    }

    public static List<Produto> buscarTodos() {
        return produtos;
    }

}
