package guisfco.com.br.rexercicio3.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import guisfco.com.br.rexercicio3.R;
import guisfco.com.br.rexercicio3.database.Database;
import guisfco.com.br.rexercicio3.dto.Produto;

public class Tela1Activity extends AppCompatActivity {

    private EditText etProduto;
    private AutoCompleteTextView acEstadoFisico;
    private EditText etPeso;
    private RadioGroup rgUnidadeMedida;
    private RadioButton rbUnidadeMedida;
    private Button btCadastrar;
    private Button btListar;
    private String[] estadosFisicos = {"Sólido", "Líquido", "Gasoso"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);
        inicializaComponentes();
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, estadosFisicos);
        acEstadoFisico.setAdapter(arrayAdapter);
        btCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Database.inserir(montaProduto());
                limpaCampos();
            }
        });
        btListar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tela1Activity.this, Tela2Activity.class);
                startActivity(intent);
                limpaCampos();
            }
        });
        rgUnidadeMedida.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                rbUnidadeMedida = findViewById(i);
            }
        });
    }

    private void inicializaComponentes() {
        etProduto = findViewById(R.id.et_produto);
        acEstadoFisico = findViewById(R.id.ac_estado_fisico);
        etPeso = findViewById(R.id.et_peso);
        rgUnidadeMedida = findViewById(R.id.rg_unidade_medida);
        btCadastrar = findViewById(R.id.bt_cadastrar);
        btListar = findViewById(R.id.bt_listar);
    }

    private Produto montaProduto() {
        return new Produto(
                etProduto.getText().toString(),
                acEstadoFisico.getText().toString(),
                Double.parseDouble(etPeso.getText().toString()),
                rbUnidadeMedida.getText().toString()
        );
    }

    private void limpaCampos() {
        etProduto.setText("");
        etPeso.setText("");
        acEstadoFisico.setText("");
    }
}
