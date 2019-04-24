package guisfco.com.br.rexercicio4.activities;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

import guisfco.com.br.rexercicio4.database.Database;
import guisfco.com.br.rexercicio4.dto.Carro;

public class ListagemActivity extends ListActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, Database.buscarTodos()));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Intent intent = new Intent(this, CadastroActivity.class);
        intent.putExtra("idCarro", position);
        startActivity(intent);
        finish();
    }
}
