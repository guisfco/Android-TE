package com.example.remor.exemplo74i2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText etNome;
    private RadioGroup rgGenero;
    private RadioButton rbSelecionado;
    private CheckBox cbNotificacao;
    private Button btEnviar;
    private Usuario usuario;
    private ArrayList<Usuario> usuarios;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.inicializaComponentes();
        rgGenero.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int idSelecionado) {
                rbSelecionado = findViewById(idSelecionado);
            }
        });

        btEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // PEGAR TODOS OS VALORES DA TELA E JOGAR PARA O OBJETO USUARIO
                usuario.setNome(etNome.getText().toString());
                usuario.setGenero(rbSelecionado.getText().toString());
                usuario.setNotificacao(cbNotificacao.isChecked());
                Toast.makeText(MainActivity.this,usuario.toString(), Toast.LENGTH_LONG).show();
                // ENVIAR O OBJETO USUARIO PARA O SERVIDOR
                usuarios.add(usuario);
            }
        });

    }

    private void inicializaComponentes() {
        etNome = findViewById(R.id.et_nome);
        cbNotificacao = findViewById(R.id.cb_notificacao);
        rgGenero = findViewById(R.id.rg_genero);
        btEnviar = findViewById(R.id.bt_enviar);
        usuario = new Usuario();
        usuarios = new ArrayList<>();
    }




}
