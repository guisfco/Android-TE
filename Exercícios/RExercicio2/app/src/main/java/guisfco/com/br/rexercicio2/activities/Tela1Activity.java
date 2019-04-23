package guisfco.com.br.rexercicio2.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import guisfco.com.br.rexercicio2.R;
import guisfco.com.br.rexercicio2.dto.Usuario;

public class Tela1Activity extends AppCompatActivity {

    private EditText etNome;
    private RadioGroup rgGenero;
    private RadioButton rbGenero;
    private CheckBox cbMusica;
    private CheckBox cbFilme;
    private Button btCadastrar;
    private Button btEnviar;
    private List<Usuario> usuarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);
        inicializaComponentes();
        btCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usuarios.add(montaUsuario());
                limpaCampos();
            }
        });
        btEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tela1Activity.this, Tela2Activity.class);
                intent.putExtra("usuarios", (Serializable) usuarios);
                startActivity(intent);
                finish();
            }
        });
        rgGenero.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                rbGenero = findViewById(i);
            }
        });
    }

    private void inicializaComponentes() {
        etNome = findViewById(R.id.et_nome);
        rgGenero = findViewById(R.id.rg_genero);
        cbMusica = findViewById(R.id.cb_musica);
        cbFilme = findViewById(R.id.cb_filme);
        btCadastrar = findViewById(R.id.bt_cadastrar);
        btEnviar = findViewById(R.id.bt_enviar);
        usuarios = new ArrayList<>();
    }

    private void limpaCampos() {
        etNome.setText("");
        rgGenero.setSelected(false);
        rbGenero = null;
        cbMusica.setChecked(false);
        cbFilme.setChecked(false);
    }

    private Usuario montaUsuario() {
        return new Usuario(
                etNome.getText().toString(),
                rbGenero.getText().toString(),
                cbMusica.isChecked(),
                cbFilme.isChecked()
        );
    }
}
