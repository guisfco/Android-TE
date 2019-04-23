package guisfco.com.br.rexercicio1.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

import guisfco.com.br.rexercicio1.R;
import guisfco.com.br.rexercicio1.dto.Carro;

public class Tela2Activity extends AppCompatActivity {

    private EditText etPlaca;
    private EditText etCor;
    private Spinner spMarca;
    private CheckBox cbNovo;
    private Button btEnviar;

    private String[] marcas = {"Chevrolet", "Fiat", "Ford", "Volkswagen"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        inicializaComponentes();
        spMarca.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, marcas));
        btEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tela2Activity.this, Tela3Activity.class);
                intent.putExtra("carro", montaCarro());
                startActivity(intent);
                finish();
            }
        });
    }

    private void inicializaComponentes() {
        etPlaca = findViewById(R.id.et_placa);
        etCor = findViewById(R.id.et_cor);
        spMarca = findViewById(R.id.sp_marca);
        cbNovo = findViewById(R.id.cb_novo);
        btEnviar = findViewById(R.id.bt_enviar);
    }

    private Carro montaCarro() {
        return new Carro(
                etPlaca.getText().toString(),
                etCor.getText().toString(),
                spMarca.getSelectedItem().toString(),
                cbNovo.isChecked());
    }
}
