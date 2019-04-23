package guisfco.com.br.rexercicio1.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import javax.xml.datatype.Duration;

import guisfco.com.br.rexercicio1.R;
import guisfco.com.br.rexercicio1.dto.Carro;

public class Tela3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);
        Toast.makeText(this, getIntent().getSerializableExtra("carro").toString(), Toast.LENGTH_LONG).show();
    }
}
