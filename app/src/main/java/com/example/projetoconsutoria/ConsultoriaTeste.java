package com.example.projetoconsutoria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

public class ConsultoriaTeste extends AppCompatActivity {

    private ImageView empresa;
    private ImageView servico;
    private ImageView cliente;
    private ImageView contato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_consultoria_teste);

        empresa = findViewById(R.id.empresaId);
        servico = findViewById(R.id.servicoId);
        cliente = findViewById(R.id.clienteId);
        contato = findViewById(R.id.contatoId);

        empresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ConsultoriaTeste.this, EmpresarialActivity.class));
            }
        });

        servico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ConsultoriaTeste.this,ServicoActivity.class));
            }
        });

        cliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ConsultoriaTeste.this,ClienteActivity.class));
            }
        });

        contato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ConsultoriaTeste.this,ContatoActivity.class));
            }
        });
    }
}
