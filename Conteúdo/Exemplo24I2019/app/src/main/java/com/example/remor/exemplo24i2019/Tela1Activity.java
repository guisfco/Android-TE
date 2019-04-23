package com.example.remor.exemplo24i2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Tela1Activity extends AppCompatActivity {

    private Button btSalvar;
    private EditText etNome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);

        // INICIALIZANDO OS OBJETOS DA CLASSE ATRAVES DO METODO FINDVIEWBYID
        this.btSalvar = findViewById(R.id.bt_salvar);
        this.etNome = findViewById(R.id.et_nome);



        this.btSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Tela1Activity.this, etNome.getText(), Toast.LENGTH_LONG).show();
            }
        });




    }
}
