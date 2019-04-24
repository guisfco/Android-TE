package guisfco.com.br.rexercicio2.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import guisfco.com.br.rexercicio2.R;
import guisfco.com.br.rexercicio2.dto.Usuario;

public class Tela3Activity extends AppCompatActivity {

    private Usuario usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);
        usuario = (Usuario) getIntent().getSerializableExtra("usuario");
        Toast.makeText(this, usuario.show(), Toast.LENGTH_LONG).show();
    }

}
