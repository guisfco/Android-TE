package com.example.remor.exemplo44i2019;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class TelaPrincipalActivity extends ListActivity {

    private String[] strMenu = {"Cadastrar", "Editar", "Excluir", "Buscar"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_tela_principal);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, strMenu);
        super.setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        switch (position) {
            // cadastrar
            case 0:
                // trocar para a tela de cadastrar
                Intent itTelaCadastro = new Intent(this, TelaCadastrarActivity.class);
                // envia para o SO a intencao de abrir a tela de cadastro
                startActivity(itTelaCadastro);
                finish();
                break;
            // editar
            case 1:
                break;
            // excluir
            case 2:
                break;
            // buscar
            case 3:
                break;
        }

        Toast.makeText(this, strMenu[position], Toast.LENGTH_LONG).show();

    }

    // IMPLEMENTAR O LAYOUT DA NOVA TELA
    // CRIAR UMA ACTIVITY PARA GERENCIAR O LAYOUT NOVO
    // CRIAR UM EVENTO DE CLICK PARA ABRIR A NOVA TELA







}
