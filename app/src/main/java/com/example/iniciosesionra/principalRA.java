package com.example.iniciosesionra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class principalRA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_ra);

        //img_button para salir de la app

        ImageButton ib_salir = findViewById(R.id.ib_salir);
        ib_salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent para ir a v.inicio de sesión

                Intent intent = new Intent (principalRA.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // img_button para ir a la v.registro Plantación

        ImageButton ib_registro = findViewById(R.id.ib_registro);
        ib_registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent para ir a v. registro plantas

                Intent intent = new Intent(principalRA.this, RegistroPlantas.class);
                startActivity(intent);
            }
        });

        //img_button para ir a v. estadisticas

        ImageButton ib_estadisticas = findViewById(R.id.ib_estadisticas);
        ib_estadisticas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent para ir a v. estadisticas

                Intent intent =  new Intent(principalRA.this, Estadisticas.class);
                startActivity(intent);
            }
        });

        //Img_button para ir a  v.Consejos

        ImageButton ib_consejos = findViewById(R.id.ib_consejos);
        ib_consejos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent para ir a V.Consejos
                Intent intent =  new Intent(principalRA.this, Consejos.class);
                startActivity(intent);
            }
        });

        //Img_button para ir a v.Recursos

        ImageButton ib_recursos = findViewById(R.id.ib_recursos);
        ib_recursos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent para ir a V.Recursos
                Intent intent = new Intent(principalRA.this, Recursos.class);
                startActivity(intent);
            }
        });


        //img_button para configurar cuenta

        ImageButton ib_configuracion = findViewById(R.id.ib_configuracion);
        ib_configuracion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent para ir a V.configuración

                Intent intent =  new Intent(principalRA.this , Configuracion.class);
                startActivity(intent);
            }
        });


    }
}