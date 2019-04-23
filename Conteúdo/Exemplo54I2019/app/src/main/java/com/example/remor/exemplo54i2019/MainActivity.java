package com.example.remor.exemplo54i2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView lvProfs;
//    public static final String NOME_INSTITUICAO = "IFSUL";
    private String[] vetProfs = {"Alex Orozco", "Mauricio Escobar", "Fernanda Guedes", "Mauricio Santos", "Diego Pedro", "Adriano Fiad", "Rodrigo Remor", "Monica Py", "Marcus Vinicius de Brito"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.lvProfs = findViewById(R.id.lv_professores);

        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, vetProfs);


        this.lvProfs.setAdapter(adapter);

        this.lvProfs.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, vetProfs[i], Toast.LENGTH_LONG).show();
            }
        });












    }
}
