package guisfco.com.br.rexercicio3.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import guisfco.com.br.rexercicio3.R;
import guisfco.com.br.rexercicio3.dto.Produto;

public class Tela3Activity extends AppCompatActivity {

    private EditText etProduto;
    private EditText etEstadoFisico;
    private EditText etPeso;
    private EditText etUnidadeMedida;
    private Button btVoltar;
    private Produto produto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);
        inicializaComponentes();
        produto = (Produto) getIntent().getSerializableExtra("produto");
        populaDados(produto);
        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tela3Activity.this, Tela2Activity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void inicializaComponentes() {
        etProduto = findViewById(R.id.et_produto);
        etEstadoFisico = findViewById(R.id.et_estado_fisico);
        etPeso = findViewById(R.id.et_peso);
        etUnidadeMedida = findViewById(R.id.et_unidade_medida);
        btVoltar = findViewById(R.id.bt_voltar);
    }

    private void populaDados(Produto produto) {
        etProduto.setText(produto.getProduto());
        etEstadoFisico.setText(produto.getEstadoFisico());
        etPeso.setText(String.valueOf(produto.getPeso()));
        etUnidadeMedida.setText(produto.getUnidadeMedida());
    }
}
