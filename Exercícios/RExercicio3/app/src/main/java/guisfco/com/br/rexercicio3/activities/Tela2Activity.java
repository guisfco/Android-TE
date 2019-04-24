package guisfco.com.br.rexercicio3.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import guisfco.com.br.rexercicio3.R;
import guisfco.com.br.rexercicio3.database.Database;
import guisfco.com.br.rexercicio3.dto.Produto;

public class Tela2Activity extends AppCompatActivity {

    private Spinner spProduto;
    private boolean interagiuSpinner;
    private List<Produto> produtos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        inicializaComponentes();
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, produtos);
        spProduto.setAdapter(arrayAdapter);
        spProduto.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (interagiuSpinner) {
                    Intent intent = new Intent(Tela2Activity.this, Tela3Activity.class);
                    intent.putExtra("produto", Database.buscarPorId(i - 1));
                    startActivity(intent);
                }
                interagiuSpinner = true;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    private void inicializaComponentes() {
        spProduto = findViewById(R.id.sp_produto);
        produtos = new ArrayList<>(Database.buscarTodos());
        produtos.add(0, new Produto("Selecione o produto", "", null, null));
    }
}
