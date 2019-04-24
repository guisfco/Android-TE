package guisfco.com.br.rexercicio4.activities;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Tela1Activity extends ListActivity {

    private String[] menu = {"Cadastrar", "Editar", "Buscar", "Excluir"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, menu);
        setListAdapter(arrayAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        switch (position) {
            case 0:
                startActivity(new Intent(this, CadastroActivity.class));
                finish();
                break;
            case 1:
                startActivity(new Intent(this, ListagemActivity.class));
        }
    }
}
