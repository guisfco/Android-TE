package guisfco.com.br.rexercicio4.database;

import java.util.ArrayList;
import java.util.List;

import guisfco.com.br.rexercicio4.dto.Carro;

/**
 * Created by guilherme.francisco on 23/04/19.
 */

public class Database {

    public static List<Carro> produtos = new ArrayList<>();

    public static void inserir(Carro produto) {
        produtos.add(produto);
    }

    public static void deletar(Carro produto) {
        produtos.remove(produto);
    }

    public static void deletarPorId(int id) {
        produtos.remove(id);
    }

    public static Carro buscarPorId(int id) {
        return produtos.get(id);
    }

    public static List<Carro> buscarTodos() {
        return produtos;
    }

}
