package com.example.remor.exemplo64i2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class Tela1Activity extends AppCompatActivity {

    private CheckBox cbFundamental;
    private CheckBox cbMedio;
    private Button btSalvar;
    private Usuario usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);
        this.inicializaComponentes();
        this.btSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usuario.setFundamental(cbFundamental.isChecked());
                usuario.setMedio(cbMedio.isChecked());
                usuario.setNome(etNome.getText());

                // enviar pro servidor





                Toast.makeText(Tela1Activity.this,"Fundamental: "+cbFundamental.isChecked(), Toast.LENGTH_LONG).show();

            }
        });


        this.cbFundamental.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(Tela1Activity.this,"Fundamental: "+b, Toast.LENGTH_LONG).show();
            }
        });



    }

    private void inicializaComponentes() {
        this.cbFundamental = findViewById(R.id.cb_fudamental);
        this.cbMedio = findViewById(R.id.cb_medio);
        this.btSalvar = findViewById(R.id.bt_salvar);
        this.usuario = new Usuario();
    }





}
