package com.example.app_organizao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cadastro extends AppCompatActivity implements View.OnClickListener{

    Button btContinuar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        btContinuar = (Button) findViewById(R.id.btContinuar);
        btContinuar.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.btContinuar) {
            Intent intenção = new Intent(this, perfiluser.class);
            startActivity(intenção);
        }
    }
}