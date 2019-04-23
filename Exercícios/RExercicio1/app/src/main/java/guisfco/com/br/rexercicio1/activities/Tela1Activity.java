package guisfco.com.br.rexercicio1.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import guisfco.com.br.rexercicio1.R;

public class Tela1Activity extends AppCompatActivity {

    private Button btMenuCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializaComponentes();
        btMenuCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tela1Activity.this, Tela2Activity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void inicializaComponentes() {
        btMenuCadastrar = findViewById(R.id.bt_menu_cadastrar);
    }
}
