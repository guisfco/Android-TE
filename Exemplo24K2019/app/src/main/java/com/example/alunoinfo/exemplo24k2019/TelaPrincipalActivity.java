package com.example.alunoinfo.exemplo24k2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TelaPrincipalActivity extends AppCompatActivity {

    private EditText etNome;
    private Button btCliqueAqui;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //CHAMANDO METODO ONCREATE DA CLASSE APPCOMPATACTIVITY
        super.onCreate(savedInstanceState);

        //DEFININDO LAYOUT A SER MANIPULADO
        setContentView(R.layout.activity_tela_principal);

        //INICIALIZANDO OS COMPONENTES E VINCULANDO COM O LAYOUT
        this.etNome = findViewById(R.id.et_nome);
        this.btCliqueAqui = findViewById(R.id.bt_clique_aqui);

        //ADICIONANDO EVENTO DE CLIQUE NO BOTÃO
        this.btCliqueAqui.setOnClickListener(new View.OnClickListener() {
            //CLASSE ANÔNIMA
            @Override
            public void onClick(View view) {
                //CHAMANDO O TOAST PARA EXIBIR TEXTO DA ET
                Toast.makeText(TelaPrincipalActivity.this, etNome.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
