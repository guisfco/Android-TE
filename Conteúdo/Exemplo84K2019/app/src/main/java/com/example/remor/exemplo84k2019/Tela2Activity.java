package com.example.remor.exemplo84k2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Tela2Activity extends AppCompatActivity {

    private TextView tvNome;
    private TextView tvTelefone;
    private Button btConfirmar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        this.inicializaComponentes();
//        String nome = getIntent().getStringExtra("nome");
//        String telefone = getIntent().getStringExtra("telefone");
        Usuario usuario = (Usuario)getIntent().getSerializableExtra("usuario");

        tvNome.setText(usuario.getNome());
        tvTelefone.setText(usuario.getTelefone());


    }

    private void inicializaComponentes() {
        this.tvNome = findViewById(R.id.tv_nome);
        this.tvTelefone = findViewById(R.id.tv_telefone);
        this.btConfirmar = findViewById(R.id.bt_confirmar);
    }




}
