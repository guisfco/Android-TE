package guisfco.com.br.rexercicio2.activities;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

import guisfco.com.br.rexercicio2.dto.Usuario;

public class Tela2Activity extends ListActivity {

    private List<Usuario> usuarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        usuarios = (List<Usuario>) getIntent().getSerializableExtra("usuarios");
        setListAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, usuarios));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Intent intent = new Intent(this, Tela3Activity.class);
        intent.putExtra("usuario", usuarios.get(position));
        startActivity(intent);
    }
}
