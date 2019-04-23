package com.example.remor.exemplo34i2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class TelaPrincipalActivity extends AppCompatActivity {

    private AutoCompleteTextView actEstados;
    private Button btSalvar;
    private String[] strEstados = {"Rio Grande do Sul", "Rio Grande do Norte", "Rio de Janeiro", "Paraná", "Pará"};
    private Spinner spEstados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

        this.actEstados = findViewById(R.id.act_estados);
        this.btSalvar = findViewById(R.id.bt_salvar);
        this.spEstados = findViewById(R.id.sp_estados);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,strEstados);

        this.actEstados.setAdapter(adapter);

        this.spEstados.setAdapter(adapter);

        this.spEstados.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int posicao, long l) {
                Toast.makeText(TelaPrincipalActivity.this,strEstados[posicao], Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });




        this.btSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(TelaPrincipalActivity.this,actEstados.getText(), Toast.LENGTH_LONG).show();
                Toast.makeText(TelaPrincipalActivity.this,"Spinner: "+spEstados.getSelectedItem().toString()+" Act: "+ actEstados.getText(), Toast.LENGTH_LONG).show();
            }
        });















    }
}
