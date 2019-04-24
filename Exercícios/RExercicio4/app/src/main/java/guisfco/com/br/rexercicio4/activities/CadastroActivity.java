package guisfco.com.br.rexercicio4.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import guisfco.com.br.rexercicio4.R;
import guisfco.com.br.rexercicio4.database.Database;
import guisfco.com.br.rexercicio4.dto.Carro;

public class CadastroActivity extends AppCompatActivity {

    private EditText etPlaca;
    private EditText etCor;
    private Spinner spMarca;
    private RadioGroup rgEstado;
    private Button btCadastrar;
    private RadioButton rbEstado;
    private String[] marcas = {"Chevrolet", "Fiat", "Ford", "Volkswagen"};
    private Carro carroExistente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        inicializaComponentes();
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, marcas);
        spMarca.setAdapter(arrayAdapter);

        Integer idCarro;

        try {
            idCarro = (Integer) getIntent().getExtras().get("idCarro");
        } catch (Exception e) {
            idCarro = null;
        }

        if (idCarro != null) {
            carroExistente = Database.buscarPorId(idCarro);
            atualizaComponentes(carroExistente, arrayAdapter);
            btCadastrar.setText("Editar");
        }

        btCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CadastroActivity.this, Tela1Activity.class);
                if (carroExistente == null) {
                    Database.inserir(montaCarro());
                } else {
                    atualizaCarro(carroExistente);
                }
                startActivity(intent);
                finish();
            }
        });
        rgEstado.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                rbEstado = findViewById(i);
            }
        });
    }

    private void inicializaComponentes() {
        etPlaca = findViewById(R.id.et_placa);
        etCor = findViewById(R.id.et_cor);
        spMarca = findViewById(R.id.sp_marca);
        rgEstado = findViewById(R.id.rg_estado);
        btCadastrar = findViewById(R.id.bt_cadastrar);
    }

    private Carro montaCarro() {
        return new Carro(
                etPlaca.getText().toString(),
                etCor.getText().toString(),
                spMarca.getSelectedItem().toString(),
                rbEstado.getText().toString());
    }

    private void atualizaCarro(Carro carro) {
        carro.setPlaca(etPlaca.getText().toString());
        carro.setCor(etCor.getText().toString());
        carro.setEstado(rbEstado.getText().toString());
        carro.setMarca(spMarca.getSelectedItem().toString());
    }

    private void atualizaComponentes(Carro carro, ArrayAdapter arrayAdapter) {
        etPlaca.setText(carro.getPlaca());
        etCor.setText(carro.getCor());
        spMarca.setSelection(arrayAdapter.getPosition(carro.getMarca()));
        if (carro.getEstado().equalsIgnoreCase("Novo")) {
            rgEstado.check(R.id.rb_novo);
            rbEstado = findViewById(R.id.rb_novo);
        } else {
            rgEstado.check(R.id.rb_usado);
            rbEstado = findViewById(R.id.rb_usado);
        }
    }
}
