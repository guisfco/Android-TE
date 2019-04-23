package com.example.remor.exemplo14i2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Tela1Activity extends AppCompatActivity {

    private TextView tvMensagem;
    private Button btCliqueAqui;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);

        tvMensagem = findViewById(R.id.tv_mensagem);

        btCliqueAqui = findViewById(R.id.bt_clique_aqui);




        btCliqueAqui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvMensagem.setText("Ola Mundo, alterou!");
            }
        });














        Toast.makeText(Tela1Activity.this, "Olá Mundo!",Toast.LENGTH_LONG).show();


    }
}
