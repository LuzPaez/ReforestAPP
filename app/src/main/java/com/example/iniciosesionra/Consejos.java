package com.example.iniciosesionra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class Consejos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consejos);

        // img button para regresar a la principal
        ImageButton ib_salir =  findViewById(R.id.ib_salir);
        ib_salir.setOnClickListener(view -> {
            //intent para regresar a pagina principal
            Intent intent = new Intent(Consejos.this, principalRA.class);
            startActivity(intent);
        });

        //Botones Registro , Estadistica, Recursos

        // button Registro
        Button btnRegistro = findViewById(R.id.btnRegistro);
        btnRegistro.setOnClickListener(view -> {
            //intent para ingresar a v.Registro plantas
            Intent intent =  new Intent(Consejos.this, RegistroPlantas.class);
            startActivity(intent);
        });

        // button Estadisticas
        Button btnEstadistica = findViewById(R.id.btnEstadistica);
        btnEstadistica.setOnClickListener(view -> {
            //intent para ingresar a v.Estadistica
            Intent intent =  new Intent(Consejos.this, Estadisticas.class);
            startActivity(intent);
        });

        // button Recursos
        Button btnRecursos = findViewById(R.id.btnRecursos);
        btnRecursos.setOnClickListener(view -> {
            //intent para ingresar a v.Recursos
            Intent intent =  new Intent(Consejos.this, Recursos.class);
            startActivity(intent);
        });


    }
}